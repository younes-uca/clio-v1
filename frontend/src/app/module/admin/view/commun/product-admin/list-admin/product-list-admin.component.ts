import {Component, OnInit} from '@angular/core';
import {ProductService} from 'src/app/controller/service/Product.service';
import {ProductDto} from 'src/app/controller/model/Product.model';
import {ProductCriteria} from 'src/app/controller/criteria/ProductCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { ProductFamilyService } from 'src/app/controller/service/ProductFamily.service';

import {ProductFamilyDto} from 'src/app/controller/model/ProductFamily.model';


@Component({
  selector: 'app-product-list-admin',
  templateUrl: './product-list-admin.component.html'
})
export class ProductListAdminComponent extends AbstractListController<ProductDto, ProductCriteria, ProductService>  implements OnInit {

    fileName = 'Product';

    productFamilys :Array<ProductFamilyDto>;
  
    constructor(productService: ProductService, private productFamilyService: ProductFamilyService) {
        super(productService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadProductFamily();
    }

    public async loadProducts(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Product', 'list');
        isPermistted ? this.service.findAll().subscribe(products => this.items = products,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'partNumber', header: 'Part number'},
            {field: 'productFamily?.libelle', header: 'Product family'},
        ];
    }


    public async loadProductFamily(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Product', 'list');
        isPermistted ? this.productFamilyService.findAllOptimized().subscribe(productFamilys => this.productFamilys = productFamilys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: ProductDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Part number': e.partNumber ,
                'Product family': e.productFamily?.libelle ,
            }
        });

        this.criteriaData = [{
            'Part number': this.criteria.partNumber ? this.criteria.partNumber : environment.emptyForExport ,
        //'Product family': this.criteria.productFamily?.libelle ? this.criteria.productFamily?.libelle : environment.emptyForExport ,
        }];
      }
}
