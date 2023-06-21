import {Component, OnInit} from '@angular/core';
import {PurchaseOrderStatusService} from 'src/app/controller/service/PurchaseOrderStatus.service';
import {PurchaseOrderStatusDto} from 'src/app/controller/model/PurchaseOrderStatus.model';
import {PurchaseOrderStatusCriteria} from 'src/app/controller/criteria/PurchaseOrderStatusCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-purchase-order-status-list-admin',
  templateUrl: './purchase-order-status-list-admin.component.html'
})
export class PurchaseOrderStatusListAdminComponent extends AbstractListController<PurchaseOrderStatusDto, PurchaseOrderStatusCriteria, PurchaseOrderStatusService>  implements OnInit {

    fileName = 'PurchaseOrderStatus';

  
    constructor(purchaseOrderStatusService: PurchaseOrderStatusService) {
        super(purchaseOrderStatusService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadPurchaseOrderStatuss(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('PurchaseOrderStatus', 'list');
        isPermistted ? this.service.findAll().subscribe(purchaseOrderStatuss => this.items = purchaseOrderStatuss,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'libelle', header: 'Libelle'},
            {field: 'code', header: 'Code'},
        ];
    }



	public initDuplicate(res: PurchaseOrderStatusDto) {
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
