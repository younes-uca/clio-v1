import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {PurchaseOrderDeliveryDto} from '../model/PurchaseOrderDelivery.model';
import {PurchaseOrderDeliveryCriteria} from '../criteria/PurchaseOrderDeliveryCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {PurchaseOrderDto} from '../model/PurchaseOrder.model';
import {PurchaserDto} from '../model/Purchaser.model';
import {PurchaseOrderDeliveryProductDto} from '../model/PurchaseOrderDeliveryProduct.model';
import {OrderSupplierStatusDto} from '../model/OrderSupplierStatus.model';
import {OrderSupplierDeliveryStatusDto} from '../model/OrderSupplierDeliveryStatus.model';

@Injectable({
  providedIn: 'root'
})
export class PurchaseOrderDeliveryService extends AbstractService<PurchaseOrderDeliveryDto, PurchaseOrderDeliveryCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/purchaseOrderDelivery/');
    }

    public constrcutDto(): PurchaseOrderDeliveryDto {
        return new PurchaseOrderDeliveryDto();
    }

    public constrcutCriteria(): PurchaseOrderDeliveryCriteria {
        return new PurchaseOrderDeliveryCriteria();
    }
}
