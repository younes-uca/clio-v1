import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {OrderSupplierDeliveryStatusDto} from '../model/OrderSupplierDeliveryStatus.model';
import {OrderSupplierDeliveryStatusCriteria} from '../criteria/OrderSupplierDeliveryStatusCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class OrderSupplierDeliveryStatusService extends AbstractService<OrderSupplierDeliveryStatusDto, OrderSupplierDeliveryStatusCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/orderSupplierDeliveryStatus/');
    }

    public constrcutDto(): OrderSupplierDeliveryStatusDto {
        return new OrderSupplierDeliveryStatusDto();
    }

    public constrcutCriteria(): OrderSupplierDeliveryStatusCriteria {
        return new OrderSupplierDeliveryStatusCriteria();
    }
}
