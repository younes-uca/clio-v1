import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {PurchaseOrderProductStatusDto} from '../model/PurchaseOrderProductStatus.model';
import {PurchaseOrderProductStatusCriteria} from '../criteria/PurchaseOrderProductStatusCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class PurchaseOrderProductStatusService extends AbstractService<PurchaseOrderProductStatusDto, PurchaseOrderProductStatusCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/purchaseOrderProductStatus/');
    }

    public constrcutDto(): PurchaseOrderProductStatusDto {
        return new PurchaseOrderProductStatusDto();
    }

    public constrcutCriteria(): PurchaseOrderProductStatusCriteria {
        return new PurchaseOrderProductStatusCriteria();
    }
}
