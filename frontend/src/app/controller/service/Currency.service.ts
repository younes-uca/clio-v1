import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {CurrencyDto} from '../model/Currency.model';
import {CurrencyCriteria} from '../criteria/CurrencyCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class CurrencyService extends AbstractService<CurrencyDto, CurrencyCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/currency/');
    }

    public constrcutDto(): CurrencyDto {
        return new CurrencyDto();
    }

    public constrcutCriteria(): CurrencyCriteria {
        return new CurrencyCriteria();
    }
}
