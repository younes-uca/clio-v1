import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {CurrencyService} from 'src/app/controller/service/Currency.service';
import {CurrencyDto} from 'src/app/controller/model/Currency.model';
import {CurrencyCriteria} from 'src/app/controller/criteria/CurrencyCriteria.model';

@Component({
  selector: 'app-currency-view-admin',
  templateUrl: './currency-view-admin.component.html'
})
export class CurrencyViewAdminComponent extends AbstractViewController<CurrencyDto, CurrencyCriteria, CurrencyService> implements OnInit {


    constructor(private currencyService: CurrencyService){
        super(currencyService);
    }

    ngOnInit(): void {
    }




}
