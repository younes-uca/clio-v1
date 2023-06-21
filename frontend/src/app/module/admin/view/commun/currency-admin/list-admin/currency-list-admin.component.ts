import {Component, OnInit} from '@angular/core';
import {CurrencyService} from 'src/app/controller/service/Currency.service';
import {CurrencyDto} from 'src/app/controller/model/Currency.model';
import {CurrencyCriteria} from 'src/app/controller/criteria/CurrencyCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-currency-list-admin',
  templateUrl: './currency-list-admin.component.html'
})
export class CurrencyListAdminComponent extends AbstractListController<CurrencyDto, CurrencyCriteria, CurrencyService>  implements OnInit {

    fileName = 'Currency';

  
    constructor(currencyService: CurrencyService) {
        super(currencyService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadCurrencys(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Currency', 'list');
        isPermistted ? this.service.findAll().subscribe(currencys => this.items = currencys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'libelle', header: 'Libelle'},
            {field: 'code', header: 'Code'},
        ];
    }



	public initDuplicate(res: CurrencyDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Libelle': e.libelle ,
                 'Code': e.code ,
            }
        });

        this.criteriaData = [{
            'Libelle': this.criteria.libelle ? this.criteria.libelle : environment.emptyForExport ,
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
        }];
      }
}
