import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {CurrencyService} from 'src/app/controller/service/Currency.service';
import {CurrencyDto} from 'src/app/controller/model/Currency.model';
import {CurrencyCriteria} from 'src/app/controller/criteria/CurrencyCriteria.model';
@Component({
  selector: 'app-currency-create-admin',
  templateUrl: './currency-create-admin.component.html'
})
export class CurrencyCreateAdminComponent extends AbstractCreateController<CurrencyDto, CurrencyCriteria, CurrencyService>  implements OnInit {



   private _validCurrencyLibelle = true;
   private _validCurrencyCode = true;

    constructor( private currencyService: CurrencyService ) {
        super(currencyService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validCurrencyLibelle = value;
        this.validCurrencyCode = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateCurrencyLibelle();
        this.validateCurrencyCode();
    }

    public validateCurrencyLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validCurrencyLibelle = false;
        } else {
            this.validCurrencyLibelle = true;
        }
    }
    public validateCurrencyCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validCurrencyCode = false;
        } else {
            this.validCurrencyCode = true;
        }
    }






    get validCurrencyLibelle(): boolean {
        return this._validCurrencyLibelle;
    }

    set validCurrencyLibelle(value: boolean) {
         this._validCurrencyLibelle = value;
    }
    get validCurrencyCode(): boolean {
        return this._validCurrencyCode;
    }

    set validCurrencyCode(value: boolean) {
         this._validCurrencyCode = value;
    }



}
