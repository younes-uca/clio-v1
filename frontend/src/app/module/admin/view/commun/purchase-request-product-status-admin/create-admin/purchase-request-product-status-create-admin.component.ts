import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {PurchaseRequestProductStatusService} from 'src/app/controller/service/PurchaseRequestProductStatus.service';
import {PurchaseRequestProductStatusDto} from 'src/app/controller/model/PurchaseRequestProductStatus.model';
import {PurchaseRequestProductStatusCriteria} from 'src/app/controller/criteria/PurchaseRequestProductStatusCriteria.model';
@Component({
  selector: 'app-purchase-request-product-status-create-admin',
  templateUrl: './purchase-request-product-status-create-admin.component.html'
})
export class PurchaseRequestProductStatusCreateAdminComponent extends AbstractCreateController<PurchaseRequestProductStatusDto, PurchaseRequestProductStatusCriteria, PurchaseRequestProductStatusService>  implements OnInit {



   private _validPurchaseRequestProductStatusLibelle = true;
   private _validPurchaseRequestProductStatusCode = true;

    constructor( private purchaseRequestProductStatusService: PurchaseRequestProductStatusService ) {
        super(purchaseRequestProductStatusService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validPurchaseRequestProductStatusLibelle = value;
        this.validPurchaseRequestProductStatusCode = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validatePurchaseRequestProductStatusLibelle();
        this.validatePurchaseRequestProductStatusCode();
    }

    public validatePurchaseRequestProductStatusLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validPurchaseRequestProductStatusLibelle = false;
        } else {
            this.validPurchaseRequestProductStatusLibelle = true;
        }
    }
    public validatePurchaseRequestProductStatusCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validPurchaseRequestProductStatusCode = false;
        } else {
            this.validPurchaseRequestProductStatusCode = true;
        }
    }






    get validPurchaseRequestProductStatusLibelle(): boolean {
        return this._validPurchaseRequestProductStatusLibelle;
    }

    set validPurchaseRequestProductStatusLibelle(value: boolean) {
         this._validPurchaseRequestProductStatusLibelle = value;
    }
    get validPurchaseRequestProductStatusCode(): boolean {
        return this._validPurchaseRequestProductStatusCode;
    }

    set validPurchaseRequestProductStatusCode(value: boolean) {
         this._validPurchaseRequestProductStatusCode = value;
    }



}
