import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {OrderSupplierStatusService} from 'src/app/controller/service/OrderSupplierStatus.service';
import {OrderSupplierStatusDto} from 'src/app/controller/model/OrderSupplierStatus.model';
import {OrderSupplierStatusCriteria} from 'src/app/controller/criteria/OrderSupplierStatusCriteria.model';

@Component({
  selector: 'app-order-supplier-status-view-admin',
  templateUrl: './order-supplier-status-view-admin.component.html'
})
export class OrderSupplierStatusViewAdminComponent extends AbstractViewController<OrderSupplierStatusDto, OrderSupplierStatusCriteria, OrderSupplierStatusService> implements OnInit {


    constructor(private orderSupplierStatusService: OrderSupplierStatusService){
        super(orderSupplierStatusService);
    }

    ngOnInit(): void {
    }




}
