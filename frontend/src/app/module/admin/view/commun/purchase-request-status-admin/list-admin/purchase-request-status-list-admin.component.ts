import {Component, OnInit} from '@angular/core';
import {PurchaseRequestStatusService} from 'src/app/controller/service/PurchaseRequestStatus.service';
import {PurchaseRequestStatusDto} from 'src/app/controller/model/PurchaseRequestStatus.model';
import {PurchaseRequestStatusCriteria} from 'src/app/controller/criteria/PurchaseRequestStatusCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-purchase-request-status-list-admin',
  templateUrl: './purchase-request-status-list-admin.component.html'
})
export class PurchaseRequestStatusListAdminComponent extends AbstractListController<PurchaseRequestStatusDto, PurchaseRequestStatusCriteria, PurchaseRequestStatusService>  implements OnInit {

    fileName = 'PurchaseRequestStatus';

  
    constructor(purchaseRequestStatusService: PurchaseRequestStatusService) {
        super(purchaseRequestStatusService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadPurchaseRequestStatuss(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('PurchaseRequestStatus', 'list');
        isPermistted ? this.service.findAll().subscribe(purchaseRequestStatuss => this.items = purchaseRequestStatuss,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'libelle', header: 'Libelle'},
            {field: 'code', header: 'Code'},
        ];
    }



	public initDuplicate(res: PurchaseRequestStatusDto) {
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
