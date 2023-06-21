import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {PurchaseRequestStatusService} from 'src/app/controller/service/PurchaseRequestStatus.service';
import {PurchaseRequestStatusDto} from 'src/app/controller/model/PurchaseRequestStatus.model';
import {PurchaseRequestStatusCriteria} from 'src/app/controller/criteria/PurchaseRequestStatusCriteria.model';

@Component({
  selector: 'app-purchase-request-status-view-admin',
  templateUrl: './purchase-request-status-view-admin.component.html'
})
export class PurchaseRequestStatusViewAdminComponent extends AbstractViewController<PurchaseRequestStatusDto, PurchaseRequestStatusCriteria, PurchaseRequestStatusService> implements OnInit {


    constructor(private purchaseRequestStatusService: PurchaseRequestStatusService){
        super(purchaseRequestStatusService);
    }

    ngOnInit(): void {
    }




}
