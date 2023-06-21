import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {PurchaseOrderStatusService} from 'src/app/controller/service/PurchaseOrderStatus.service';
import {PurchaseOrderStatusDto} from 'src/app/controller/model/PurchaseOrderStatus.model';
import {PurchaseOrderStatusCriteria} from 'src/app/controller/criteria/PurchaseOrderStatusCriteria.model';
@Component({
  selector: 'app-purchase-order-status-create-admin',
  templateUrl: './purchase-order-status-create-admin.component.html'
})
export class PurchaseOrderStatusCreateAdminComponent extends AbstractCreateController<PurchaseOrderStatusDto, PurchaseOrderStatusCriteria, PurchaseOrderStatusService>  implements OnInit {



   private _validPurchaseOrderStatusLibelle = true;
   private _validPurchaseOrderStatusCode = true;

    constructor( private purchaseOrderStatusService: PurchaseOrderStatusService ) {
        super(purchaseOrderStatusService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validPurchaseOrderStatusLibelle = value;
        this.validPurchaseOrderStatusCode = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validatePurchaseOrderStatusLibelle();
        this.validatePurchaseOrderStatusCode();
    }

    public validatePurchaseOrderStatusLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validPurchaseOrderStatusLibelle = false;
        } else {
            this.validPurchaseOrderStatusLibelle = true;
        }
    }
    public validatePurchaseOrderStatusCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validPurchaseOrderStatusCode = false;
        } else {
            this.validPurchaseOrderStatusCode = true;
        }
    }






    get validPurchaseOrderStatusLibelle(): boolean {
        return this._validPurchaseOrderStatusLibelle;
    }

    set validPurchaseOrderStatusLibelle(value: boolean) {
         this._validPurchaseOrderStatusLibelle = value;
    }
    get validPurchaseOrderStatusCode(): boolean {
        return this._validPurchaseOrderStatusCode;
    }

    set validPurchaseOrderStatusCode(value: boolean) {
         this._validPurchaseOrderStatusCode = value;
    }



}
