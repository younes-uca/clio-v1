import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {OrderSupplierTypeService} from 'src/app/controller/service/OrderSupplierType.service';
import {OrderSupplierTypeDto} from 'src/app/controller/model/OrderSupplierType.model';
import {OrderSupplierTypeCriteria} from 'src/app/controller/criteria/OrderSupplierTypeCriteria.model';
@Component({
  selector: 'app-order-supplier-type-create-admin',
  templateUrl: './order-supplier-type-create-admin.component.html'
})
export class OrderSupplierTypeCreateAdminComponent extends AbstractCreateController<OrderSupplierTypeDto, OrderSupplierTypeCriteria, OrderSupplierTypeService>  implements OnInit {



   private _validOrderSupplierTypeLibelle = true;
   private _validOrderSupplierTypeCode = true;

    constructor( private orderSupplierTypeService: OrderSupplierTypeService ) {
        super(orderSupplierTypeService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validOrderSupplierTypeLibelle = value;
        this.validOrderSupplierTypeCode = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateOrderSupplierTypeLibelle();
        this.validateOrderSupplierTypeCode();
    }

    public validateOrderSupplierTypeLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validOrderSupplierTypeLibelle = false;
        } else {
            this.validOrderSupplierTypeLibelle = true;
        }
    }
    public validateOrderSupplierTypeCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validOrderSupplierTypeCode = false;
        } else {
            this.validOrderSupplierTypeCode = true;
        }
    }






    get validOrderSupplierTypeLibelle(): boolean {
        return this._validOrderSupplierTypeLibelle;
    }

    set validOrderSupplierTypeLibelle(value: boolean) {
         this._validOrderSupplierTypeLibelle = value;
    }
    get validOrderSupplierTypeCode(): boolean {
        return this._validOrderSupplierTypeCode;
    }

    set validOrderSupplierTypeCode(value: boolean) {
         this._validOrderSupplierTypeCode = value;
    }



}
