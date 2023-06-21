import {Component, OnInit} from '@angular/core';
import {PurchaseOrderProductStatusService} from 'src/app/controller/service/PurchaseOrderProductStatus.service';
import {PurchaseOrderProductStatusDto} from 'src/app/controller/model/PurchaseOrderProductStatus.model';
import {PurchaseOrderProductStatusCriteria} from 'src/app/controller/criteria/PurchaseOrderProductStatusCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-purchase-order-product-status-list-admin',
  templateUrl: './purchase-order-product-status-list-admin.component.html'
})
export class PurchaseOrderProductStatusListAdminComponent extends AbstractListController<PurchaseOrderProductStatusDto, PurchaseOrderProductStatusCriteria, PurchaseOrderProductStatusService>  implements OnInit {

    fileName = 'PurchaseOrderProductStatus';

  
    constructor(purchaseOrderProductStatusService: PurchaseOrderProductStatusService) {
        super(purchaseOrderProductStatusService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadPurchaseOrderProductStatuss(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('PurchaseOrderProductStatus', 'list');
        isPermistted ? this.service.findAll().subscribe(purchaseOrderProductStatuss => this.items = purchaseOrderProductStatuss,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'libelle', header: 'Libelle'},
            {field: 'code', header: 'Code'},
        ];
    }



	public initDuplicate(res: PurchaseOrderProductStatusDto) {
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
