import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {PurchaseRequestStatusService} from 'src/app/controller/service/PurchaseRequestStatus.service';
import {PurchaseRequestStatusDto} from 'src/app/controller/model/PurchaseRequestStatus.model';
import {PurchaseRequestStatusCriteria} from 'src/app/controller/criteria/PurchaseRequestStatusCriteria.model';



@Component({
  selector: 'app-purchase-request-status-edit-admin',
  templateUrl: './purchase-request-status-edit-admin.component.html'
})
export class PurchaseRequestStatusEditAdminComponent extends AbstractEditController<PurchaseRequestStatusDto, PurchaseRequestStatusCriteria, PurchaseRequestStatusService>   implements OnInit {


    private _validPurchaseRequestStatusLibelle = true;
    private _validPurchaseRequestStatusCode = true;




    constructor( private purchaseRequestStatusService: PurchaseRequestStatusService ) {
        super(purchaseRequestStatusService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validPurchaseRequestStatusLibelle = value;
        this.validPurchaseRequestStatusCode = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validatePurchaseRequestStatusLibelle();
        this.validatePurchaseRequestStatusCode();
    }
    public validatePurchaseRequestStatusLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validPurchaseRequestStatusLibelle = false;
        } else {
            this.validPurchaseRequestStatusLibelle = true;
        }
    }
    public validatePurchaseRequestStatusCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validPurchaseRequestStatusCode = false;
        } else {
            this.validPurchaseRequestStatusCode = true;
        }
    }






    get validPurchaseRequestStatusLibelle(): boolean {
        return this._validPurchaseRequestStatusLibelle;
    }
    set validPurchaseRequestStatusLibelle(value: boolean) {
        this._validPurchaseRequestStatusLibelle = value;
    }
    get validPurchaseRequestStatusCode(): boolean {
        return this._validPurchaseRequestStatusCode;
    }
    set validPurchaseRequestStatusCode(value: boolean) {
        this._validPurchaseRequestStatusCode = value;
    }

}
