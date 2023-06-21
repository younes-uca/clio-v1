import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {StoreService} from 'src/app/controller/service/Store.service';
import {StoreDto} from 'src/app/controller/model/Store.model';
import {StoreCriteria} from 'src/app/controller/criteria/StoreCriteria.model';



@Component({
  selector: 'app-store-edit-admin',
  templateUrl: './store-edit-admin.component.html'
})
export class StoreEditAdminComponent extends AbstractEditController<StoreDto, StoreCriteria, StoreService>   implements OnInit {


    private _validStoreLibelle = true;
    private _validStoreCode = true;




    constructor( private storeService: StoreService ) {
        super(storeService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validStoreLibelle = value;
        this.validStoreCode = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateStoreLibelle();
        this.validateStoreCode();
    }
    public validateStoreLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validStoreLibelle = false;
        } else {
            this.validStoreLibelle = true;
        }
    }
    public validateStoreCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validStoreCode = false;
        } else {
            this.validStoreCode = true;
        }
    }






    get validStoreLibelle(): boolean {
        return this._validStoreLibelle;
    }
    set validStoreLibelle(value: boolean) {
        this._validStoreLibelle = value;
    }
    get validStoreCode(): boolean {
        return this._validStoreCode;
    }
    set validStoreCode(value: boolean) {
        this._validStoreCode = value;
    }

}
