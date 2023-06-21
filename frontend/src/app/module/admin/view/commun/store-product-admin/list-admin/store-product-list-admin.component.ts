import {Component, OnInit} from '@angular/core';
import {StoreProductService} from 'src/app/controller/service/StoreProduct.service';
import {StoreProductDto} from 'src/app/controller/model/StoreProduct.model';
import {StoreProductCriteria} from 'src/app/controller/criteria/StoreProductCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { StoreService } from 'src/app/controller/service/Store.service';
import { ProductService } from 'src/app/controller/service/Product.service';

import {StoreDto} from 'src/app/controller/model/Store.model';
import {ProductDto} from 'src/app/controller/model/Product.model';


@Component({
  selector: 'app-store-product-list-admin',
  templateUrl: './store-product-list-admin.component.html'
})
export class StoreProductListAdminComponent extends AbstractListController<StoreProductDto, StoreProductCriteria, StoreProductService>  implements OnInit {

    fileName = 'StoreProduct';

    stores :Array<StoreDto>;
    products :Array<ProductDto>;
  
    constructor(storeProductService: StoreProductService, private storeService: StoreService, private productService: ProductService) {
        super(storeProductService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadStore();
      this.loadProduct();
    }

    public async loadStoreProducts(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('StoreProduct', 'list');
        isPermistted ? this.service.findAll().subscribe(storeProducts => this.items = storeProducts,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'store?.libelle', header: 'Store'},
            {field: 'product?.id', header: 'Product'},
            {field: 'qantity', header: 'Qantity'},
        ];
    }


    public async loadStore(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('StoreProduct', 'list');
        isPermistted ? this.storeService.findAllOptimized().subscribe(stores => this.stores = stores,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadProduct(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('StoreProduct', 'list');
        isPermistted ? this.productService.findAll().subscribe(products => this.products = products,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: StoreProductDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                'Store': e.store?.libelle ,
                'Product': e.product?.id ,
                 'Qantity': e.qantity ,
            }
        });

        this.criteriaData = [{
        //'Store': this.criteria.store?.libelle ? this.criteria.store?.libelle : environment.emptyForExport ,
        //'Product': this.criteria.product?.id ? this.criteria.product?.id : environment.emptyForExport ,
            'Qantity Min': this.criteria.qantityMin ? this.criteria.qantityMin : environment.emptyForExport ,
            'Qantity Max': this.criteria.qantityMax ? this.criteria.qantityMax : environment.emptyForExport ,
        }];
      }
}
