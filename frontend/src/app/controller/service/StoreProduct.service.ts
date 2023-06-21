import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {StoreProductDto} from '../model/StoreProduct.model';
import {StoreProductCriteria} from '../criteria/StoreProductCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {StoreDto} from '../model/Store.model';
import {ProductDto} from '../model/Product.model';

@Injectable({
  providedIn: 'root'
})
export class StoreProductService extends AbstractService<StoreProductDto, StoreProductCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/storeProduct/');
    }

    public constrcutDto(): StoreProductDto {
        return new StoreProductDto();
    }

    public constrcutCriteria(): StoreProductCriteria {
        return new StoreProductCriteria();
    }
}
