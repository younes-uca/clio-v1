import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {UnitePriceService} from 'src/app/controller/service/UnitePrice.service';
import {UnitePriceDto} from 'src/app/controller/model/UnitePrice.model';
import {UnitePriceCriteria} from 'src/app/controller/criteria/UnitePriceCriteria.model';



@Component({
  selector: 'app-unite-price-edit-admin',
  templateUrl: './unite-price-edit-admin.component.html'
})
export class UnitePriceEditAdminComponent extends AbstractEditController<UnitePriceDto, UnitePriceCriteria, UnitePriceService>   implements OnInit {


    private _validUnitePriceLibelle = true;
    private _validUnitePriceCode = true;




    constructor( private unitePriceService: UnitePriceService ) {
        super(unitePriceService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validUnitePriceLibelle = value;
        this.validUnitePriceCode = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateUnitePriceLibelle();
        this.validateUnitePriceCode();
    }
    public validateUnitePriceLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validUnitePriceLibelle = false;
        } else {
            this.validUnitePriceLibelle = true;
        }
    }
    public validateUnitePriceCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validUnitePriceCode = false;
        } else {
            this.validUnitePriceCode = true;
        }
    }






    get validUnitePriceLibelle(): boolean {
        return this._validUnitePriceLibelle;
    }
    set validUnitePriceLibelle(value: boolean) {
        this._validUnitePriceLibelle = value;
    }
    get validUnitePriceCode(): boolean {
        return this._validUnitePriceCode;
    }
    set validUnitePriceCode(value: boolean) {
        this._validUnitePriceCode = value;
    }

}
