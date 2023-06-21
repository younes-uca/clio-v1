import {Component, OnInit} from '@angular/core';
import {PurchaseRequestService} from 'src/app/controller/service/PurchaseRequest.service';
import {PurchaseRequestDto} from 'src/app/controller/model/PurchaseRequest.model';
import {PurchaseRequestCriteria} from 'src/app/controller/criteria/PurchaseRequestCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { SupplierService } from 'src/app/controller/service/Supplier.service';
import { PurchaseRequestStatusService } from 'src/app/controller/service/PurchaseRequestStatus.service';

import {PurchaseRequestProductDto} from 'src/app/controller/model/PurchaseRequestProduct.model';
import {PurchaseRequestStatusDto} from 'src/app/controller/model/PurchaseRequestStatus.model';
import {SupplierDto} from 'src/app/controller/model/Supplier.model';


@Component({
  selector: 'app-purchase-request-list-admin',
  templateUrl: './purchase-request-list-admin.component.html'
})
export class PurchaseRequestListAdminComponent extends AbstractListController<PurchaseRequestDto, PurchaseRequestCriteria, PurchaseRequestService>  implements OnInit {

    fileName = 'PurchaseRequest';

    suppliers :Array<SupplierDto>;
    purchaseRequestStatuss :Array<PurchaseRequestStatusDto>;
  
    constructor(purchaseRequestService: PurchaseRequestService, private supplierService: SupplierService, private purchaseRequestStatusService: PurchaseRequestStatusService) {
        super(purchaseRequestService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadSupplier();
      this.loadPurchaseRequestStatus();
    }

    public async loadPurchaseRequests(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('PurchaseRequest', 'list');
        isPermistted ? this.service.findAll().subscribe(purchaseRequests => this.items = purchaseRequests,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'refrence', header: 'Refrence'},
            {field: 'montantDevis', header: 'Montant devis'},
            {field: 'datePurchaseRequest', header: 'Date purchase request'},
            {field: 'dateLivraison', header: 'Date livraison'},
            {field: 'supplier?.reference', header: 'Supplier'},
            {field: 'montantAchat', header: 'Montant achat'},
            {field: 'purchaseRequestStatus?.libelle', header: 'Purchase request status'},
        ];
    }


    public async loadSupplier(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('PurchaseRequest', 'list');
        isPermistted ? this.supplierService.findAllOptimized().subscribe(suppliers => this.suppliers = suppliers,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadPurchaseRequestStatus(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('PurchaseRequest', 'list');
        isPermistted ? this.purchaseRequestStatusService.findAllOptimized().subscribe(purchaseRequestStatuss => this.purchaseRequestStatuss = purchaseRequestStatuss,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: PurchaseRequestDto) {
        if (res.purchaseRequestProducts != null) {
             res.purchaseRequestProducts.forEach(d => { d.purchaseRequest = null; d.id = null; });
        }
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Refrence': e.refrence ,
                 'Montant devis': e.montantDevis ,
                'Date purchase request': this.datePipe.transform(e.datePurchaseRequest , 'dd/MM/yyyy hh:mm'),
                'Date livraison': this.datePipe.transform(e.dateLivraison , 'dd/MM/yyyy hh:mm'),
                'Supplier': e.supplier?.reference ,
                 'Montant achat': e.montantAchat ,
                'Purchase request status': e.purchaseRequestStatus?.libelle ,
            }
        });

        this.criteriaData = [{
            'Refrence': this.criteria.refrence ? this.criteria.refrence : environment.emptyForExport ,
            'Montant devis Min': this.criteria.montantDevisMin ? this.criteria.montantDevisMin : environment.emptyForExport ,
            'Montant devis Max': this.criteria.montantDevisMax ? this.criteria.montantDevisMax : environment.emptyForExport ,
            'Date purchase request Min': this.criteria.datePurchaseRequestFrom ? this.datePipe.transform(this.criteria.datePurchaseRequestFrom , this.dateFormat) : environment.emptyForExport ,
            'Date purchase request Max': this.criteria.datePurchaseRequestTo ? this.datePipe.transform(this.criteria.datePurchaseRequestTo , this.dateFormat) : environment.emptyForExport ,
            'Date livraison Min': this.criteria.dateLivraisonFrom ? this.datePipe.transform(this.criteria.dateLivraisonFrom , this.dateFormat) : environment.emptyForExport ,
            'Date livraison Max': this.criteria.dateLivraisonTo ? this.datePipe.transform(this.criteria.dateLivraisonTo , this.dateFormat) : environment.emptyForExport ,
        //'Supplier': this.criteria.supplier?.reference ? this.criteria.supplier?.reference : environment.emptyForExport ,
            'Montant achat Min': this.criteria.montantAchatMin ? this.criteria.montantAchatMin : environment.emptyForExport ,
            'Montant achat Max': this.criteria.montantAchatMax ? this.criteria.montantAchatMax : environment.emptyForExport ,
        //'Purchase request status': this.criteria.purchaseRequestStatus?.libelle ? this.criteria.purchaseRequestStatus?.libelle : environment.emptyForExport ,
        }];
      }
}
