import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {StoreProductService} from 'src/app/controller/service/StoreProduct.service';
import {StoreProductDto} from 'src/app/controller/model/StoreProduct.model';
import {StoreProductCriteria} from 'src/app/controller/criteria/StoreProductCriteria.model';


import {StoreDto} from 'src/app/controller/model/Store.model';
import {StoreService} from 'src/app/controller/service/Store.service';
import {ProductDto} from 'src/app/controller/model/Product.model';
import {ProductService} from 'src/app/controller/service/Product.service';

@Component({
  selector: 'app-store-product-edit-admin',
  templateUrl: './store-product-edit-admin.component.html'
})
export class StoreProductEditAdminComponent extends AbstractEditController<StoreProductDto, StoreProductCriteria, StoreProductService>   implements OnInit {



    private _validStoreLibelle = true;
    private _validStoreCode = true;



    constructor( private storeProductService: StoreProductService , private storeService: StoreService, private productService: ProductService) {
        super(storeProductService);
    }

    ngOnInit(): void {
    this.store = new StoreDto();
    this.storeService.findAll().subscribe((data) => this.stores = data);
    this.product = new ProductDto();
    this.productService.findAll().subscribe((data) => this.products = data);
}


    public setValidation(value : boolean){
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }



   public async openCreateProduct(product: string) {
        const isPermistted = await this.roleService.isPermitted('Product', 'edit');
        if(isPermistted) {
             this.product = new ProductDto();
             this.createProductDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }
   public async openCreateStore(store: string) {
        const isPermistted = await this.roleService.isPermitted('Store', 'edit');
        if(isPermistted) {
             this.store = new StoreDto();
             this.createStoreDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }

   get product(): ProductDto {
       return this.productService.item;
   }
  set product(value: ProductDto) {
        this.productService.item = value;
   }
   get products(): Array<ProductDto> {
        return this.productService.items;
   }
   set products(value: Array<ProductDto>) {
        this.productService.items = value;
   }
   get createProductDialog(): boolean {
       return this.productService.createDialog;
   }
  set createProductDialog(value: boolean) {
       this.productService.createDialog= value;
   }
   get store(): StoreDto {
       return this.storeService.item;
   }
  set store(value: StoreDto) {
        this.storeService.item = value;
   }
   get stores(): Array<StoreDto> {
        return this.storeService.items;
   }
   set stores(value: Array<StoreDto>) {
        this.storeService.items = value;
   }
   get createStoreDialog(): boolean {
       return this.storeService.createDialog;
   }
  set createStoreDialog(value: boolean) {
       this.storeService.createDialog= value;
   }



    get validStoreLibelle(): boolean {
        return this._validStoreLibelle;
    }
    set validStoreLibelle(value: boolean) {
        this._validStoreLibelle = value;
    }
    get validStoreCode(): boolean {
        return this._validStoreCode;
    }
    set validStoreCode(value: boolean) {
        this._validStoreCode = value;
    }
}
