import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {PurchaserDto} from '../model/Purchaser.model';
import {PurchaserCriteria} from '../criteria/PurchaserCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class PurchaserService extends AbstractService<PurchaserDto, PurchaserCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/purchaser/');
    }

    public constrcutDto(): PurchaserDto {
        return new PurchaserDto();
    }

    public constrcutCriteria(): PurchaserCriteria {
        return new PurchaserCriteria();
    }
}
