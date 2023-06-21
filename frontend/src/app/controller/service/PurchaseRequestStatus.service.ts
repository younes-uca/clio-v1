import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {PurchaseRequestStatusDto} from '../model/PurchaseRequestStatus.model';
import {PurchaseRequestStatusCriteria} from '../criteria/PurchaseRequestStatusCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class PurchaseRequestStatusService extends AbstractService<PurchaseRequestStatusDto, PurchaseRequestStatusCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/purchaseRequestStatus/');
    }

    public constrcutDto(): PurchaseRequestStatusDto {
        return new PurchaseRequestStatusDto();
    }

    public constrcutCriteria(): PurchaseRequestStatusCriteria {
        return new PurchaseRequestStatusCriteria();
    }
}
