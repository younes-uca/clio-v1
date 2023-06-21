import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {PurchaserService} from 'src/app/controller/service/Purchaser.service';
import {PurchaserDto} from 'src/app/controller/model/Purchaser.model';
import {PurchaserCriteria} from 'src/app/controller/criteria/PurchaserCriteria.model';

@Component({
  selector: 'app-purchaser-view-admin',
  templateUrl: './purchaser-view-admin.component.html'
})
export class PurchaserViewAdminComponent extends AbstractViewController<PurchaserDto, PurchaserCriteria, PurchaserService> implements OnInit {


    constructor(private purchaserService: PurchaserService){
        super(purchaserService);
    }

    ngOnInit(): void {
    }




}
