import {Component, OnInit} from '@angular/core';
import {SupplierService} from 'src/app/controller/service/Supplier.service';
import {SupplierDto} from 'src/app/controller/model/Supplier.model';
import {SupplierCriteria} from 'src/app/controller/criteria/SupplierCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-supplier-list-admin',
  templateUrl: './supplier-list-admin.component.html'
})
export class SupplierListAdminComponent extends AbstractListController<SupplierDto, SupplierCriteria, SupplierService>  implements OnInit {

    fileName = 'Supplier';

  
    constructor(supplierService: SupplierService) {
        super(supplierService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadSuppliers(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Supplier', 'list');
        isPermistted ? this.service.findAll().subscribe(suppliers => this.items = suppliers,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'nom', header: 'Nom'},
            {field: 'prenom', header: 'Prenom'},
            {field: 'reference', header: 'Reference'},
            {field: 'email', header: 'Email'},
        ];
    }



	public initDuplicate(res: SupplierDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Nom': e.nom ,
                 'Prenom': e.prenom ,
                 'Reference': e.reference ,
                 'Email': e.email ,
            }
        });

        this.criteriaData = [{
            'Nom': this.criteria.nom ? this.criteria.nom : environment.emptyForExport ,
            'Prenom': this.criteria.prenom ? this.criteria.prenom : environment.emptyForExport ,
            'Reference': this.criteria.reference ? this.criteria.reference : environment.emptyForExport ,
            'Email': this.criteria.email ? this.criteria.email : environment.emptyForExport ,
        }];
      }
}
