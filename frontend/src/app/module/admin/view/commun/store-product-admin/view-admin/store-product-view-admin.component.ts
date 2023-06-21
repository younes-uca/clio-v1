import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {StoreProductService} from 'src/app/controller/service/StoreProduct.service';
import {StoreProductDto} from 'src/app/controller/model/StoreProduct.model';
import {StoreProductCriteria} from 'src/app/controller/criteria/StoreProductCriteria.model';

import {StoreDto} from 'src/app/controller/model/Store.model';
import {StoreService} from 'src/app/controller/service/Store.service';
import {ProductDto} from 'src/app/controller/model/Product.model';
import {ProductService} from 'src/app/controller/service/Product.service';
@Component({
  selector: 'app-store-product-view-admin',
  templateUrl: './store-product-view-admin.component.html'
})
export class StoreProductViewAdminComponent extends AbstractViewController<StoreProductDto, StoreProductCriteria, StoreProductService> implements OnInit {


    constructor(private storeProductService: StoreProductService, private storeService: StoreService, private productService: ProductService){
        super(storeProductService);
    }

    ngOnInit(): void {
        this.store = new StoreDto();
        this.storeService.findAll().subscribe((data) => this.stores = data);
        this.product = new ProductDto();
        this.productService.findAll().subscribe((data) => this.products = data);
    }


    get product(): ProductDto {
       return this.productService.item;
    }
    set product(value: ProductDto) {
        this.productService.item = value;
    }
    get products():Array<ProductDto> {
       return this.productService.items;
    }
    set products(value: Array<ProductDto>) {
        this.productService.items = value;
    }
    get store(): StoreDto {
       return this.storeService.item;
    }
    set store(value: StoreDto) {
        this.storeService.item = value;
    }
    get stores():Array<StoreDto> {
       return this.storeService.items;
    }
    set stores(value: Array<StoreDto>) {
        this.storeService.items = value;
    }


}
