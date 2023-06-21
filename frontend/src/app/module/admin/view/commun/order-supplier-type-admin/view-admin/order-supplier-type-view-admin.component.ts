import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {OrderSupplierTypeService} from 'src/app/controller/service/OrderSupplierType.service';
import {OrderSupplierTypeDto} from 'src/app/controller/model/OrderSupplierType.model';
import {OrderSupplierTypeCriteria} from 'src/app/controller/criteria/OrderSupplierTypeCriteria.model';

@Component({
  selector: 'app-order-supplier-type-view-admin',
  templateUrl: './order-supplier-type-view-admin.component.html'
})
export class OrderSupplierTypeViewAdminComponent extends AbstractViewController<OrderSupplierTypeDto, OrderSupplierTypeCriteria, OrderSupplierTypeService> implements OnInit {


    constructor(private orderSupplierTypeService: OrderSupplierTypeService){
        super(orderSupplierTypeService);
    }

    ngOnInit(): void {
    }




}
