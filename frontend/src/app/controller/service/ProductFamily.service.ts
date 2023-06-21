import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {ProductFamilyDto} from '../model/ProductFamily.model';
import {ProductFamilyCriteria} from '../criteria/ProductFamilyCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class ProductFamilyService extends AbstractService<ProductFamilyDto, ProductFamilyCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/productFamily/');
    }

    public constrcutDto(): ProductFamilyDto {
        return new ProductFamilyDto();
    }

    public constrcutCriteria(): ProductFamilyCriteria {
        return new ProductFamilyCriteria();
    }
}
