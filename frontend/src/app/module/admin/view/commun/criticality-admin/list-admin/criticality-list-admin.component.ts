import {Component, OnInit} from '@angular/core';
import {CriticalityService} from 'src/app/controller/service/Criticality.service';
import {CriticalityDto} from 'src/app/controller/model/Criticality.model';
import {CriticalityCriteria} from 'src/app/controller/criteria/CriticalityCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-criticality-list-admin',
  templateUrl: './criticality-list-admin.component.html'
})
export class CriticalityListAdminComponent extends AbstractListController<CriticalityDto, CriticalityCriteria, CriticalityService>  implements OnInit {

    fileName = 'Criticality';

  
    constructor(criticalityService: CriticalityService) {
        super(criticalityService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadCriticalitys(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Criticality', 'list');
        isPermistted ? this.service.findAll().subscribe(criticalitys => this.items = criticalitys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'libelle', header: 'Libelle'},
            {field: 'code', header: 'Code'},
        ];
    }



	public initDuplicate(res: CriticalityDto) {
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
