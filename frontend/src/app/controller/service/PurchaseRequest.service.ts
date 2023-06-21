import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {PurchaseRequestDto} from '../model/PurchaseRequest.model';
import {PurchaseRequestCriteria} from '../criteria/PurchaseRequestCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {PurchaseRequestProductDto} from '../model/PurchaseRequestProduct.model';
import {PurchaseRequestStatusDto} from '../model/PurchaseRequestStatus.model';
import {SupplierDto} from '../model/Supplier.model';

@Injectable({
  providedIn: 'root'
})
export class PurchaseRequestService extends AbstractService<PurchaseRequestDto, PurchaseRequestCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/purchaseRequest/');
    }

    public constrcutDto(): PurchaseRequestDto {
        return new PurchaseRequestDto();
    }

    public constrcutCriteria(): PurchaseRequestCriteria {
        return new PurchaseRequestCriteria();
    }
}
