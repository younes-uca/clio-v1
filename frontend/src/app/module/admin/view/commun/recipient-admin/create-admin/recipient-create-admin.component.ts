import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {RecipientService} from 'src/app/controller/service/Recipient.service';
import {RecipientDto} from 'src/app/controller/model/Recipient.model';
import {RecipientCriteria} from 'src/app/controller/criteria/RecipientCriteria.model';
@Component({
  selector: 'app-recipient-create-admin',
  templateUrl: './recipient-create-admin.component.html'
})
export class RecipientCreateAdminComponent extends AbstractCreateController<RecipientDto, RecipientCriteria, RecipientService>  implements OnInit {



   private _validRecipientLibelle = true;
   private _validRecipientCode = true;

    constructor( private recipientService: RecipientService ) {
        super(recipientService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validRecipientLibelle = value;
        this.validRecipientCode = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateRecipientLibelle();
        this.validateRecipientCode();
    }

    public validateRecipientLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validRecipientLibelle = false;
        } else {
            this.validRecipientLibelle = true;
        }
    }
    public validateRecipientCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validRecipientCode = false;
        } else {
            this.validRecipientCode = true;
        }
    }






    get validRecipientLibelle(): boolean {
        return this._validRecipientLibelle;
    }

    set validRecipientLibelle(value: boolean) {
         this._validRecipientLibelle = value;
    }
    get validRecipientCode(): boolean {
        return this._validRecipientCode;
    }

    set validRecipientCode(value: boolean) {
         this._validRecipientCode = value;
    }



}
