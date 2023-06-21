import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {UnitePriceService} from 'src/app/controller/service/UnitePrice.service';
import {UnitePriceDto} from 'src/app/controller/model/UnitePrice.model';
import {UnitePriceCriteria} from 'src/app/controller/criteria/UnitePriceCriteria.model';

@Component({
  selector: 'app-unite-price-view-admin',
  templateUrl: './unite-price-view-admin.component.html'
})
export class UnitePriceViewAdminComponent extends AbstractViewController<UnitePriceDto, UnitePriceCriteria, UnitePriceService> implements OnInit {


    constructor(private unitePriceService: UnitePriceService){
        super(unitePriceService);
    }

    ngOnInit(): void {
    }




}
