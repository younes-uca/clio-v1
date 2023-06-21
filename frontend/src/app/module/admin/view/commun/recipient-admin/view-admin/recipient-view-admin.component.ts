import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {RecipientService} from 'src/app/controller/service/Recipient.service';
import {RecipientDto} from 'src/app/controller/model/Recipient.model';
import {RecipientCriteria} from 'src/app/controller/criteria/RecipientCriteria.model';

@Component({
  selector: 'app-recipient-view-admin',
  templateUrl: './recipient-view-admin.component.html'
})
export class RecipientViewAdminComponent extends AbstractViewController<RecipientDto, RecipientCriteria, RecipientService> implements OnInit {


    constructor(private recipientService: RecipientService){
        super(recipientService);
    }

    ngOnInit(): void {
    }




}
