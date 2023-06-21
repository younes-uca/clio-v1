import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {PurchaseOrderStatusService} from 'src/app/controller/service/PurchaseOrderStatus.service';
import {PurchaseOrderStatusDto} from 'src/app/controller/model/PurchaseOrderStatus.model';
import {PurchaseOrderStatusCriteria} from 'src/app/controller/criteria/PurchaseOrderStatusCriteria.model';

@Component({
  selector: 'app-purchase-order-status-view-admin',
  templateUrl: './purchase-order-status-view-admin.component.html'
})
export class PurchaseOrderStatusViewAdminComponent extends AbstractViewController<PurchaseOrderStatusDto, PurchaseOrderStatusCriteria, PurchaseOrderStatusService> implements OnInit {


    constructor(private purchaseOrderStatusService: PurchaseOrderStatusService){
        super(purchaseOrderStatusService);
    }

    ngOnInit(): void {
    }




}
