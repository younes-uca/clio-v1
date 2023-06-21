import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {OrderSupplierStatusService} from 'src/app/controller/service/OrderSupplierStatus.service';
import {OrderSupplierStatusDto} from 'src/app/controller/model/OrderSupplierStatus.model';
import {OrderSupplierStatusCriteria} from 'src/app/controller/criteria/OrderSupplierStatusCriteria.model';



@Component({
  selector: 'app-order-supplier-status-edit-admin',
  templateUrl: './order-supplier-status-edit-admin.component.html'
})
export class OrderSupplierStatusEditAdminComponent extends AbstractEditController<OrderSupplierStatusDto, OrderSupplierStatusCriteria, OrderSupplierStatusService>   implements OnInit {


    private _validOrderSupplierStatusLibelle = true;
    private _validOrderSupplierStatusCode = true;




    constructor( private orderSupplierStatusService: OrderSupplierStatusService ) {
        super(orderSupplierStatusService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validOrderSupplierStatusLibelle = value;
        this.validOrderSupplierStatusCode = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateOrderSupplierStatusLibelle();
        this.validateOrderSupplierStatusCode();
    }
    public validateOrderSupplierStatusLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validOrderSupplierStatusLibelle = false;
        } else {
            this.validOrderSupplierStatusLibelle = true;
        }
    }
    public validateOrderSupplierStatusCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validOrderSupplierStatusCode = false;
        } else {
            this.validOrderSupplierStatusCode = true;
        }
    }






    get validOrderSupplierStatusLibelle(): boolean {
        return this._validOrderSupplierStatusLibelle;
    }
    set validOrderSupplierStatusLibelle(value: boolean) {
        this._validOrderSupplierStatusLibelle = value;
    }
    get validOrderSupplierStatusCode(): boolean {
        return this._validOrderSupplierStatusCode;
    }
    set validOrderSupplierStatusCode(value: boolean) {
        this._validOrderSupplierStatusCode = value;
    }

}
