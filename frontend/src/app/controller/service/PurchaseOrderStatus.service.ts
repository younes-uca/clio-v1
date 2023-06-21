import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {PurchaseOrderStatusDto} from '../model/PurchaseOrderStatus.model';
import {PurchaseOrderStatusCriteria} from '../criteria/PurchaseOrderStatusCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class PurchaseOrderStatusService extends AbstractService<PurchaseOrderStatusDto, PurchaseOrderStatusCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/purchaseOrderStatus/');
    }

    public constrcutDto(): PurchaseOrderStatusDto {
        return new PurchaseOrderStatusDto();
    }

    public constrcutCriteria(): PurchaseOrderStatusCriteria {
        return new PurchaseOrderStatusCriteria();
    }
}
