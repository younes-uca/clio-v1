import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {PurchaserService} from 'src/app/controller/service/Purchaser.service';
import {PurchaserDto} from 'src/app/controller/model/Purchaser.model';
import {PurchaserCriteria} from 'src/app/controller/criteria/PurchaserCriteria.model';



@Component({
  selector: 'app-purchaser-edit-admin',
  templateUrl: './purchaser-edit-admin.component.html'
})
export class PurchaserEditAdminComponent extends AbstractEditController<PurchaserDto, PurchaserCriteria, PurchaserService>   implements OnInit {


    private _validPurchaserLibelle = true;
    private _validPurchaserCode = true;




    constructor( private purchaserService: PurchaserService ) {
        super(purchaserService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validPurchaserLibelle = value;
        this.validPurchaserCode = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validatePurchaserLibelle();
        this.validatePurchaserCode();
    }
    public validatePurchaserLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validPurchaserLibelle = false;
        } else {
            this.validPurchaserLibelle = true;
        }
    }
    public validatePurchaserCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validPurchaserCode = false;
        } else {
            this.validPurchaserCode = true;
        }
    }






    get validPurchaserLibelle(): boolean {
        return this._validPurchaserLibelle;
    }
    set validPurchaserLibelle(value: boolean) {
        this._validPurchaserLibelle = value;
    }
    get validPurchaserCode(): boolean {
        return this._validPurchaserCode;
    }
    set validPurchaserCode(value: boolean) {
        this._validPurchaserCode = value;
    }

}
