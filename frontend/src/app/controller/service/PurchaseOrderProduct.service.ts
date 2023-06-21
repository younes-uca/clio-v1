import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {PurchaseOrderProductDto} from '../model/PurchaseOrderProduct.model';
import {PurchaseOrderProductCriteria} from '../criteria/PurchaseOrderProductCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {PurchaseOrderProductStatusDto} from '../model/PurchaseOrderProductStatus.model';
import {ProductDto} from '../model/Product.model';
import {PurchaseOrderDto} from '../model/PurchaseOrder.model';
import {UnitePriceDto} from '../model/UnitePrice.model';

@Injectable({
  providedIn: 'root'
})
export class PurchaseOrderProductService extends AbstractService<PurchaseOrderProductDto, PurchaseOrderProductCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/purchaseOrderProduct/');
    }

    public constrcutDto(): PurchaseOrderProductDto {
        return new PurchaseOrderProductDto();
    }

    public constrcutCriteria(): PurchaseOrderProductCriteria {
        return new PurchaseOrderProductCriteria();
    }
}
