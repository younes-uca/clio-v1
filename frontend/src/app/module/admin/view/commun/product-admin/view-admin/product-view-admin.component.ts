import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {ProductService} from 'src/app/controller/service/Product.service';
import {ProductDto} from 'src/app/controller/model/Product.model';
import {ProductCriteria} from 'src/app/controller/criteria/ProductCriteria.model';

import {ProductFamilyDto} from 'src/app/controller/model/ProductFamily.model';
import {ProductFamilyService} from 'src/app/controller/service/ProductFamily.service';
@Component({
  selector: 'app-product-view-admin',
  templateUrl: './product-view-admin.component.html'
})
export class ProductViewAdminComponent extends AbstractViewController<ProductDto, ProductCriteria, ProductService> implements OnInit {


    constructor(private productService: ProductService, private productFamilyService: ProductFamilyService){
        super(productService);
    }

    ngOnInit(): void {
        this.productFamily = new ProductFamilyDto();
        this.productFamilyService.findAll().subscribe((data) => this.productFamilys = data);
    }


    get productFamily(): ProductFamilyDto {
       return this.productFamilyService.item;
    }
    set productFamily(value: ProductFamilyDto) {
        this.productFamilyService.item = value;
    }
    get productFamilys():Array<ProductFamilyDto> {
       return this.productFamilyService.items;
    }
    set productFamilys(value: Array<ProductFamilyDto>) {
        this.productFamilyService.items = value;
    }


}
