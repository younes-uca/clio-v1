import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {CriticalityService} from 'src/app/controller/service/Criticality.service';
import {CriticalityDto} from 'src/app/controller/model/Criticality.model';
import {CriticalityCriteria} from 'src/app/controller/criteria/CriticalityCriteria.model';



@Component({
  selector: 'app-criticality-edit-admin',
  templateUrl: './criticality-edit-admin.component.html'
})
export class CriticalityEditAdminComponent extends AbstractEditController<CriticalityDto, CriticalityCriteria, CriticalityService>   implements OnInit {


    private _validCriticalityLibelle = true;
    private _validCriticalityCode = true;




    constructor( private criticalityService: CriticalityService ) {
        super(criticalityService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validCriticalityLibelle = value;
        this.validCriticalityCode = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateCriticalityLibelle();
        this.validateCriticalityCode();
    }
    public validateCriticalityLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validCriticalityLibelle = false;
        } else {
            this.validCriticalityLibelle = true;
        }
    }
    public validateCriticalityCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validCriticalityCode = false;
        } else {
            this.validCriticalityCode = true;
        }
    }






    get validCriticalityLibelle(): boolean {
        return this._validCriticalityLibelle;
    }
    set validCriticalityLibelle(value: boolean) {
        this._validCriticalityLibelle = value;
    }
    get validCriticalityCode(): boolean {
        return this._validCriticalityCode;
    }
    set validCriticalityCode(value: boolean) {
        this._validCriticalityCode = value;
    }

}
