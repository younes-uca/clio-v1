import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {PurchaseOrderProductStatusService} from 'src/app/controller/service/PurchaseOrderProductStatus.service';
import {PurchaseOrderProductStatusDto} from 'src/app/controller/model/PurchaseOrderProductStatus.model';
import {PurchaseOrderProductStatusCriteria} from 'src/app/controller/criteria/PurchaseOrderProductStatusCriteria.model';



@Component({
  selector: 'app-purchase-order-product-status-edit-admin',
  templateUrl: './purchase-order-product-status-edit-admin.component.html'
})
export class PurchaseOrderProductStatusEditAdminComponent extends AbstractEditController<PurchaseOrderProductStatusDto, PurchaseOrderProductStatusCriteria, PurchaseOrderProductStatusService>   implements OnInit {


    private _validPurchaseOrderProductStatusLibelle = true;
    private _validPurchaseOrderProductStatusCode = true;




    constructor( private purchaseOrderProductStatusService: PurchaseOrderProductStatusService ) {
        super(purchaseOrderProductStatusService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validPurchaseOrderProductStatusLibelle = value;
        this.validPurchaseOrderProductStatusCode = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validatePurchaseOrderProductStatusLibelle();
        this.validatePurchaseOrderProductStatusCode();
    }
    public validatePurchaseOrderProductStatusLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validPurchaseOrderProductStatusLibelle = false;
        } else {
            this.validPurchaseOrderProductStatusLibelle = true;
        }
    }
    public validatePurchaseOrderProductStatusCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validPurchaseOrderProductStatusCode = false;
        } else {
            this.validPurchaseOrderProductStatusCode = true;
        }
    }






    get validPurchaseOrderProductStatusLibelle(): boolean {
        return this._validPurchaseOrderProductStatusLibelle;
    }
    set validPurchaseOrderProductStatusLibelle(value: boolean) {
        this._validPurchaseOrderProductStatusLibelle = value;
    }
    get validPurchaseOrderProductStatusCode(): boolean {
        return this._validPurchaseOrderProductStatusCode;
    }
    set validPurchaseOrderProductStatusCode(value: boolean) {
        this._validPurchaseOrderProductStatusCode = value;
    }

}
