import {Component, OnInit} from '@angular/core';
import {ProductFamilyService} from 'src/app/controller/service/ProductFamily.service';
import {ProductFamilyDto} from 'src/app/controller/model/ProductFamily.model';
import {ProductFamilyCriteria} from 'src/app/controller/criteria/ProductFamilyCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-product-family-list-admin',
  templateUrl: './product-family-list-admin.component.html'
})
export class ProductFamilyListAdminComponent extends AbstractListController<ProductFamilyDto, ProductFamilyCriteria, ProductFamilyService>  implements OnInit {

    fileName = 'ProductFamily';

  
    constructor(productFamilyService: ProductFamilyService) {
        super(productFamilyService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadProductFamilys(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('ProductFamily', 'list');
        isPermistted ? this.service.findAll().subscribe(productFamilys => this.items = productFamilys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'libelle', header: 'Libelle'},
            {field: 'code', header: 'Code'},
        ];
    }



	public initDuplicate(res: ProductFamilyDto) {
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
