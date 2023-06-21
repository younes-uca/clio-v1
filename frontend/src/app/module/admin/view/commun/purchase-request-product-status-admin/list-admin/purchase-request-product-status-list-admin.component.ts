import {Component, OnInit} from '@angular/core';
import {PurchaseRequestProductStatusService} from 'src/app/controller/service/PurchaseRequestProductStatus.service';
import {PurchaseRequestProductStatusDto} from 'src/app/controller/model/PurchaseRequestProductStatus.model';
import {PurchaseRequestProductStatusCriteria} from 'src/app/controller/criteria/PurchaseRequestProductStatusCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-purchase-request-product-status-list-admin',
  templateUrl: './purchase-request-product-status-list-admin.component.html'
})
export class PurchaseRequestProductStatusListAdminComponent extends AbstractListController<PurchaseRequestProductStatusDto, PurchaseRequestProductStatusCriteria, PurchaseRequestProductStatusService>  implements OnInit {

    fileName = 'PurchaseRequestProductStatus';

  
    constructor(purchaseRequestProductStatusService: PurchaseRequestProductStatusService) {
        super(purchaseRequestProductStatusService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadPurchaseRequestProductStatuss(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('PurchaseRequestProductStatus', 'list');
        isPermistted ? this.service.findAll().subscribe(purchaseRequestProductStatuss => this.items = purchaseRequestProductStatuss,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'libelle', header: 'Libelle'},
            {field: 'code', header: 'Code'},
        ];
    }



	public initDuplicate(res: PurchaseRequestProductStatusDto) {
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
