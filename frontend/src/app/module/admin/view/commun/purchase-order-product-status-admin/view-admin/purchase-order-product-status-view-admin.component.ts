import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {PurchaseOrderProductStatusService} from 'src/app/controller/service/PurchaseOrderProductStatus.service';
import {PurchaseOrderProductStatusDto} from 'src/app/controller/model/PurchaseOrderProductStatus.model';
import {PurchaseOrderProductStatusCriteria} from 'src/app/controller/criteria/PurchaseOrderProductStatusCriteria.model';

@Component({
  selector: 'app-purchase-order-product-status-view-admin',
  templateUrl: './purchase-order-product-status-view-admin.component.html'
})
export class PurchaseOrderProductStatusViewAdminComponent extends AbstractViewController<PurchaseOrderProductStatusDto, PurchaseOrderProductStatusCriteria, PurchaseOrderProductStatusService> implements OnInit {


    constructor(private purchaseOrderProductStatusService: PurchaseOrderProductStatusService){
        super(purchaseOrderProductStatusService);
    }

    ngOnInit(): void {
    }




}
