import {Component, OnInit} from '@angular/core';
import {RecipientService} from 'src/app/controller/service/Recipient.service';
import {RecipientDto} from 'src/app/controller/model/Recipient.model';
import {RecipientCriteria} from 'src/app/controller/criteria/RecipientCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-recipient-list-admin',
  templateUrl: './recipient-list-admin.component.html'
})
export class RecipientListAdminComponent extends AbstractListController<RecipientDto, RecipientCriteria, RecipientService>  implements OnInit {

    fileName = 'Recipient';

  
    constructor(recipientService: RecipientService) {
        super(recipientService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadRecipients(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Recipient', 'list');
        isPermistted ? this.service.findAll().subscribe(recipients => this.items = recipients,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'libelle', header: 'Libelle'},
            {field: 'code', header: 'Code'},
        ];
    }



	public initDuplicate(res: RecipientDto) {
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
