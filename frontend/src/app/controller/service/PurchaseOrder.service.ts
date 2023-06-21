import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {PurchaseOrderDto} from '../model/PurchaseOrder.model';
import {PurchaseOrderCriteria} from '../criteria/PurchaseOrderCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {PurchaseOrderStatusDto} from '../model/PurchaseOrderStatus.model';
import {CurrencyDto} from '../model/Currency.model';
import {PurchaseOrderProductDto} from '../model/PurchaseOrderProduct.model';
import {OrderSupplierTypeDto} from '../model/OrderSupplierType.model';
import {PurchaserDto} from '../model/Purchaser.model';
import {RecipientDto} from '../model/Recipient.model';
import {SupplierDto} from '../model/Supplier.model';
import {CriticalityDto} from '../model/Criticality.model';
import {PurchaseRequestDto} from '../model/PurchaseRequest.model';

@Injectable({
  providedIn: 'root'
})
export class PurchaseOrderService extends AbstractService<PurchaseOrderDto, PurchaseOrderCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/purchaseOrder/');
    }

    public constrcutDto(): PurchaseOrderDto {
        return new PurchaseOrderDto();
    }

    public constrcutCriteria(): PurchaseOrderCriteria {
        return new PurchaseOrderCriteria();
    }
}
