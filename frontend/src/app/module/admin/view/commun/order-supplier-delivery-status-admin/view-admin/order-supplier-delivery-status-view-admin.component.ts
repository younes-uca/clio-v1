import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {OrderSupplierDeliveryStatusService} from 'src/app/controller/service/OrderSupplierDeliveryStatus.service';
import {OrderSupplierDeliveryStatusDto} from 'src/app/controller/model/OrderSupplierDeliveryStatus.model';
import {OrderSupplierDeliveryStatusCriteria} from 'src/app/controller/criteria/OrderSupplierDeliveryStatusCriteria.model';

@Component({
  selector: 'app-order-supplier-delivery-status-view-admin',
  templateUrl: './order-supplier-delivery-status-view-admin.component.html'
})
export class OrderSupplierDeliveryStatusViewAdminComponent extends AbstractViewController<OrderSupplierDeliveryStatusDto, OrderSupplierDeliveryStatusCriteria, OrderSupplierDeliveryStatusService> implements OnInit {


    constructor(private orderSupplierDeliveryStatusService: OrderSupplierDeliveryStatusService){
        super(orderSupplierDeliveryStatusService);
    }

    ngOnInit(): void {
    }




}
