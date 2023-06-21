import {Component, OnInit} from '@angular/core';
import {UnitePriceService} from 'src/app/controller/service/UnitePrice.service';
import {UnitePriceDto} from 'src/app/controller/model/UnitePrice.model';
import {UnitePriceCriteria} from 'src/app/controller/criteria/UnitePriceCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-unite-price-list-admin',
  templateUrl: './unite-price-list-admin.component.html'
})
export class UnitePriceListAdminComponent extends AbstractListController<UnitePriceDto, UnitePriceCriteria, UnitePriceService>  implements OnInit {

    fileName = 'UnitePrice';

  
    constructor(unitePriceService: UnitePriceService) {
        super(unitePriceService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadUnitePrices(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('UnitePrice', 'list');
        isPermistted ? this.service.findAll().subscribe(unitePrices => this.items = unitePrices,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'libelle', header: 'Libelle'},
            {field: 'code', header: 'Code'},
        ];
    }



	public initDuplicate(res: UnitePriceDto) {
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
