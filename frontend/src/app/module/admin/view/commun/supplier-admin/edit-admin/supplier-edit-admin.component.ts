import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {SupplierService} from 'src/app/controller/service/Supplier.service';
import {SupplierDto} from 'src/app/controller/model/Supplier.model';
import {SupplierCriteria} from 'src/app/controller/criteria/SupplierCriteria.model';



@Component({
  selector: 'app-supplier-edit-admin',
  templateUrl: './supplier-edit-admin.component.html'
})
export class SupplierEditAdminComponent extends AbstractEditController<SupplierDto, SupplierCriteria, SupplierService>   implements OnInit {


    private _validSupplierReference = true;




    constructor( private supplierService: SupplierService ) {
        super(supplierService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validSupplierReference = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateSupplierReference();
    }
    public validateSupplierReference(){
        if (this.stringUtilService.isEmpty(this.item.reference)) {
            this.errorMessages.push('Reference non valide');
            this.validSupplierReference = false;
        } else {
            this.validSupplierReference = true;
        }
    }






    get validSupplierReference(): boolean {
        return this._validSupplierReference;
    }
    set validSupplierReference(value: boolean) {
        this._validSupplierReference = value;
    }

}
