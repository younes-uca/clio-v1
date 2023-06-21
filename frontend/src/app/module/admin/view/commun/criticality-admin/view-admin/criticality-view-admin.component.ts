import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {CriticalityService} from 'src/app/controller/service/Criticality.service';
import {CriticalityDto} from 'src/app/controller/model/Criticality.model';
import {CriticalityCriteria} from 'src/app/controller/criteria/CriticalityCriteria.model';

@Component({
  selector: 'app-criticality-view-admin',
  templateUrl: './criticality-view-admin.component.html'
})
export class CriticalityViewAdminComponent extends AbstractViewController<CriticalityDto, CriticalityCriteria, CriticalityService> implements OnInit {


    constructor(private criticalityService: CriticalityService){
        super(criticalityService);
    }

    ngOnInit(): void {
    }




}
