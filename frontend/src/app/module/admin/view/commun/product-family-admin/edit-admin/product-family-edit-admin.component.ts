import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {ProductFamilyService} from 'src/app/controller/service/ProductFamily.service';
import {ProductFamilyDto} from 'src/app/controller/model/ProductFamily.model';
import {ProductFamilyCriteria} from 'src/app/controller/criteria/ProductFamilyCriteria.model';



@Component({
  selector: 'app-product-family-edit-admin',
  templateUrl: './product-family-edit-admin.component.html'
})
export class ProductFamilyEditAdminComponent extends AbstractEditController<ProductFamilyDto, ProductFamilyCriteria, ProductFamilyService>   implements OnInit {


    private _validProductFamilyLibelle = true;
    private _validProductFamilyCode = true;




    constructor( private productFamilyService: ProductFamilyService ) {
        super(productFamilyService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validProductFamilyLibelle = value;
        this.validProductFamilyCode = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateProductFamilyLibelle();
        this.validateProductFamilyCode();
    }
    public validateProductFamilyLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validProductFamilyLibelle = false;
        } else {
            this.validProductFamilyLibelle = true;
        }
    }
    public validateProductFamilyCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validProductFamilyCode = false;
        } else {
            this.validProductFamilyCode = true;
        }
    }






    get validProductFamilyLibelle(): boolean {
        return this._validProductFamilyLibelle;
    }
    set validProductFamilyLibelle(value: boolean) {
        this._validProductFamilyLibelle = value;
    }
    get validProductFamilyCode(): boolean {
        return this._validProductFamilyCode;
    }
    set validProductFamilyCode(value: boolean) {
        this._validProductFamilyCode = value;
    }

}
