import {Component, OnInit} from '@angular/core';
import {OrderSupplierTypeService} from 'src/app/controller/service/OrderSupplierType.service';
import {OrderSupplierTypeDto} from 'src/app/controller/model/OrderSupplierType.model';
import {OrderSupplierTypeCriteria} from 'src/app/controller/criteria/OrderSupplierTypeCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-order-supplier-type-list-admin',
  templateUrl: './order-supplier-type-list-admin.component.html'
})
export class OrderSupplierTypeListAdminComponent extends AbstractListController<OrderSupplierTypeDto, OrderSupplierTypeCriteria, OrderSupplierTypeService>  implements OnInit {

    fileName = 'OrderSupplierType';

  
    constructor(orderSupplierTypeService: OrderSupplierTypeService) {
        super(orderSupplierTypeService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadOrderSupplierTypes(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('OrderSupplierType', 'list');
        isPermistted ? this.service.findAll().subscribe(orderSupplierTypes => this.items = orderSupplierTypes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'libelle', header: 'Libelle'},
            {field: 'code', header: 'Code'},
        ];
    }



	public initDuplicate(res: OrderSupplierTypeDto) {
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
