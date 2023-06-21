import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {ProductFamilyService} from 'src/app/controller/service/ProductFamily.service';
import {ProductFamilyDto} from 'src/app/controller/model/ProductFamily.model';
import {ProductFamilyCriteria} from 'src/app/controller/criteria/ProductFamilyCriteria.model';

@Component({
  selector: 'app-product-family-view-admin',
  templateUrl: './product-family-view-admin.component.html'
})
export class ProductFamilyViewAdminComponent extends AbstractViewController<ProductFamilyDto, ProductFamilyCriteria, ProductFamilyService> implements OnInit {


    constructor(private productFamilyService: ProductFamilyService){
        super(productFamilyService);
    }

    ngOnInit(): void {
    }




}
