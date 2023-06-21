import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {PurchaseRequestProductStatusDto} from '../model/PurchaseRequestProductStatus.model';
import {PurchaseRequestProductStatusCriteria} from '../criteria/PurchaseRequestProductStatusCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class PurchaseRequestProductStatusService extends AbstractService<PurchaseRequestProductStatusDto, PurchaseRequestProductStatusCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/purchaseRequestProductStatus/');
    }

    public constrcutDto(): PurchaseRequestProductStatusDto {
        return new PurchaseRequestProductStatusDto();
    }

    public constrcutCriteria(): PurchaseRequestProductStatusCriteria {
        return new PurchaseRequestProductStatusCriteria();
    }
}
