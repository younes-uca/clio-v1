import {Component, OnInit} from '@angular/core';
import {OrderSupplierDeliveryStatusService} from 'src/app/controller/service/OrderSupplierDeliveryStatus.service';
import {OrderSupplierDeliveryStatusDto} from 'src/app/controller/model/OrderSupplierDeliveryStatus.model';
import {OrderSupplierDeliveryStatusCriteria} from 'src/app/controller/criteria/OrderSupplierDeliveryStatusCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-order-supplier-delivery-status-list-admin',
  templateUrl: './order-supplier-delivery-status-list-admin.component.html'
})
export class OrderSupplierDeliveryStatusListAdminComponent extends AbstractListController<OrderSupplierDeliveryStatusDto, OrderSupplierDeliveryStatusCriteria, OrderSupplierDeliveryStatusService>  implements OnInit {

    fileName = 'OrderSupplierDeliveryStatus';

  
    constructor(orderSupplierDeliveryStatusService: OrderSupplierDeliveryStatusService) {
        super(orderSupplierDeliveryStatusService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadOrderSupplierDeliveryStatuss(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('OrderSupplierDeliveryStatus', 'list');
        isPermistted ? this.service.findAll().subscribe(orderSupplierDeliveryStatuss => this.items = orderSupplierDeliveryStatuss,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'libelle', header: 'Libelle'},
            {field: 'code', header: 'Code'},
        ];
    }



	public initDuplicate(res: OrderSupplierDeliveryStatusDto) {
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
