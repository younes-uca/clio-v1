import {Component, OnInit} from '@angular/core';
import {OrderSupplierStatusService} from 'src/app/controller/service/OrderSupplierStatus.service';
import {OrderSupplierStatusDto} from 'src/app/controller/model/OrderSupplierStatus.model';
import {OrderSupplierStatusCriteria} from 'src/app/controller/criteria/OrderSupplierStatusCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-order-supplier-status-list-admin',
  templateUrl: './order-supplier-status-list-admin.component.html'
})
export class OrderSupplierStatusListAdminComponent extends AbstractListController<OrderSupplierStatusDto, OrderSupplierStatusCriteria, OrderSupplierStatusService>  implements OnInit {

    fileName = 'OrderSupplierStatus';

  
    constructor(orderSupplierStatusService: OrderSupplierStatusService) {
        super(orderSupplierStatusService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadOrderSupplierStatuss(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('OrderSupplierStatus', 'list');
        isPermistted ? this.service.findAll().subscribe(orderSupplierStatuss => this.items = orderSupplierStatuss,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'libelle', header: 'Libelle'},
            {field: 'code', header: 'Code'},
        ];
    }



	public initDuplicate(res: OrderSupplierStatusDto) {
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
