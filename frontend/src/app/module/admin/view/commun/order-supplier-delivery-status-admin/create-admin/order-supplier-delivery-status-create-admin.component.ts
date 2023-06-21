import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {OrderSupplierDeliveryStatusService} from 'src/app/controller/service/OrderSupplierDeliveryStatus.service';
import {OrderSupplierDeliveryStatusDto} from 'src/app/controller/model/OrderSupplierDeliveryStatus.model';
import {OrderSupplierDeliveryStatusCriteria} from 'src/app/controller/criteria/OrderSupplierDeliveryStatusCriteria.model';
@Component({
  selector: 'app-order-supplier-delivery-status-create-admin',
  templateUrl: './order-supplier-delivery-status-create-admin.component.html'
})
export class OrderSupplierDeliveryStatusCreateAdminComponent extends AbstractCreateController<OrderSupplierDeliveryStatusDto, OrderSupplierDeliveryStatusCriteria, OrderSupplierDeliveryStatusService>  implements OnInit {



   private _validOrderSupplierDeliveryStatusLibelle = true;
   private _validOrderSupplierDeliveryStatusCode = true;

    constructor( private orderSupplierDeliveryStatusService: OrderSupplierDeliveryStatusService ) {
        super(orderSupplierDeliveryStatusService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validOrderSupplierDeliveryStatusLibelle = value;
        this.validOrderSupplierDeliveryStatusCode = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateOrderSupplierDeliveryStatusLibelle();
        this.validateOrderSupplierDeliveryStatusCode();
    }

    public validateOrderSupplierDeliveryStatusLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validOrderSupplierDeliveryStatusLibelle = false;
        } else {
            this.validOrderSupplierDeliveryStatusLibelle = true;
        }
    }
    public validateOrderSupplierDeliveryStatusCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validOrderSupplierDeliveryStatusCode = false;
        } else {
            this.validOrderSupplierDeliveryStatusCode = true;
        }
    }






    get validOrderSupplierDeliveryStatusLibelle(): boolean {
        return this._validOrderSupplierDeliveryStatusLibelle;
    }

    set validOrderSupplierDeliveryStatusLibelle(value: boolean) {
         this._validOrderSupplierDeliveryStatusLibelle = value;
    }
    get validOrderSupplierDeliveryStatusCode(): boolean {
        return this._validOrderSupplierDeliveryStatusCode;
    }

    set validOrderSupplierDeliveryStatusCode(value: boolean) {
         this._validOrderSupplierDeliveryStatusCode = value;
    }



}
