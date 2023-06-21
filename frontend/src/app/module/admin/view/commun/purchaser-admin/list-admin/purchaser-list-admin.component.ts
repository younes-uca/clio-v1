import {Component, OnInit} from '@angular/core';
import {PurchaserService} from 'src/app/controller/service/Purchaser.service';
import {PurchaserDto} from 'src/app/controller/model/Purchaser.model';
import {PurchaserCriteria} from 'src/app/controller/criteria/PurchaserCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-purchaser-list-admin',
  templateUrl: './purchaser-list-admin.component.html'
})
export class PurchaserListAdminComponent extends AbstractListController<PurchaserDto, PurchaserCriteria, PurchaserService>  implements OnInit {

    fileName = 'Purchaser';

  
    constructor(purchaserService: PurchaserService) {
        super(purchaserService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadPurchasers(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Purchaser', 'list');
        isPermistted ? this.service.findAll().subscribe(purchasers => this.items = purchasers,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'libelle', header: 'Libelle'},
            {field: 'code', header: 'Code'},
        ];
    }



	public initDuplicate(res: PurchaserDto) {
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
