import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {PurchaseOrderDeliveryProductDto} from '../model/PurchaseOrderDeliveryProduct.model';
import {PurchaseOrderDeliveryProductCriteria} from '../criteria/PurchaseOrderDeliveryProductCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {ProductDto} from '../model/Product.model';
import {StoreDto} from '../model/Store.model';
import {PurchaseOrderDeliveryDto} from '../model/PurchaseOrderDelivery.model';

@Injectable({
  providedIn: 'root'
})
export class PurchaseOrderDeliveryProductService extends AbstractService<PurchaseOrderDeliveryProductDto, PurchaseOrderDeliveryProductCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/purchaseOrderDeliveryProduct/');
    }

    public constrcutDto(): PurchaseOrderDeliveryProductDto {
        return new PurchaseOrderDeliveryProductDto();
    }

    public constrcutCriteria(): PurchaseOrderDeliveryProductCriteria {
        return new PurchaseOrderDeliveryProductCriteria();
    }
}
