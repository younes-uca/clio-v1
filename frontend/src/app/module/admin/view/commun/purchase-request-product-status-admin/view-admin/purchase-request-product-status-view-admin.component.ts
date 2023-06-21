import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {PurchaseRequestProductStatusService} from 'src/app/controller/service/PurchaseRequestProductStatus.service';
import {PurchaseRequestProductStatusDto} from 'src/app/controller/model/PurchaseRequestProductStatus.model';
import {PurchaseRequestProductStatusCriteria} from 'src/app/controller/criteria/PurchaseRequestProductStatusCriteria.model';

@Component({
  selector: 'app-purchase-request-product-status-view-admin',
  templateUrl: './purchase-request-product-status-view-admin.component.html'
})
export class PurchaseRequestProductStatusViewAdminComponent extends AbstractViewController<PurchaseRequestProductStatusDto, PurchaseRequestProductStatusCriteria, PurchaseRequestProductStatusService> implements OnInit {


    constructor(private purchaseRequestProductStatusService: PurchaseRequestProductStatusService){
        super(purchaseRequestProductStatusService);
    }

    ngOnInit(): void {
    }




}
