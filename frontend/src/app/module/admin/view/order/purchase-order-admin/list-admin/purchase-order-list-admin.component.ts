import {Component, OnInit} from '@angular/core';
import {PurchaseOrderService} from 'src/app/controller/service/PurchaseOrder.service';
import {PurchaseOrderDto} from 'src/app/controller/model/PurchaseOrder.model';
import {PurchaseOrderCriteria} from 'src/app/controller/criteria/PurchaseOrderCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { OrderSupplierTypeService } from 'src/app/controller/service/OrderSupplierType.service';
import { CriticalityService } from 'src/app/controller/service/Criticality.service';
import { SupplierService } from 'src/app/controller/service/Supplier.service';
import { RecipientService } from 'src/app/controller/service/Recipient.service';
import { PurchaserService } from 'src/app/controller/service/Purchaser.service';
import { CurrencyService } from 'src/app/controller/service/Currency.service';
import { PurchaseOrderStatusService } from 'src/app/controller/service/PurchaseOrderStatus.service';
import { PurchaseRequestService } from 'src/app/controller/service/PurchaseRequest.service';

import {PurchaseOrderStatusDto} from 'src/app/controller/model/PurchaseOrderStatus.model';
import {CurrencyDto} from 'src/app/controller/model/Currency.model';
import {PurchaseOrderProductDto} from 'src/app/controller/model/PurchaseOrderProduct.model';
import {OrderSupplierTypeDto} from 'src/app/controller/model/OrderSupplierType.model';
import {PurchaserDto} from 'src/app/controller/model/Purchaser.model';
import {RecipientDto} from 'src/app/controller/model/Recipient.model';
import {SupplierDto} from 'src/app/controller/model/Supplier.model';
import {CriticalityDto} from 'src/app/controller/model/Criticality.model';
import {PurchaseRequestDto} from 'src/app/controller/model/PurchaseRequest.model';


@Component({
  selector: 'app-purchase-order-list-admin',
  templateUrl: './purchase-order-list-admin.component.html'
})
export class PurchaseOrderListAdminComponent extends AbstractListController<PurchaseOrderDto, PurchaseOrderCriteria, PurchaseOrderService>  implements OnInit {

    fileName = 'PurchaseOrder';

    orderSupplierTypes :Array<OrderSupplierTypeDto>;
    criticalitys :Array<CriticalityDto>;
    suppliers :Array<SupplierDto>;
    recipients :Array<RecipientDto>;
    purchasers :Array<PurchaserDto>;
    currencys :Array<CurrencyDto>;
    purchaseOrderStatuss :Array<PurchaseOrderStatusDto>;
    purchaseRequests :Array<PurchaseRequestDto>;
  
    constructor(purchaseOrderService: PurchaseOrderService, private orderSupplierTypeService: OrderSupplierTypeService, private criticalityService: CriticalityService, private supplierService: SupplierService, private recipientService: RecipientService, private purchaserService: PurchaserService, private currencyService: CurrencyService, private purchaseOrderStatusService: PurchaseOrderStatusService, private purchaseRequestService: PurchaseRequestService) {
        super(purchaseOrderService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadOrderSupplierType();
      this.loadCriticality();
      this.loadSupplier();
      this.loadRecipient();
      this.loadPurchaser();
      this.loadCurrency();
      this.loadPurchaseOrderStatus();
      this.loadPurchaseRequest();
    }

    public async loadPurchaseOrders(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('PurchaseOrder', 'list');
        isPermistted ? this.service.findAll().subscribe(purchaseOrders => this.items = purchaseOrders,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'refrence', header: 'Refrence'},
            {field: 'orderSupplierType?.libelle', header: 'Order supplier type'},
            {field: 'dateOrderSupplier', header: 'Date order supplier'},
            {field: 'criticality?.libelle', header: 'Criticality'},
            {field: 'supplier?.reference', header: 'Supplier'},
            {field: 'recipient?.libelle', header: 'Recipient'},
            {field: 'purchaser?.libelle', header: 'Purchaser'},
            {field: 'total', header: 'Total'},
            {field: 'currency?.libelle', header: 'Currency'},
            {field: 'purchaseOrderStatus?.libelle', header: 'Purchase order status'},
            {field: 'purchaseRequest?.refrence', header: 'Purchase request'},
        ];
    }


    public async loadOrderSupplierType(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('PurchaseOrder', 'list');
        isPermistted ? this.orderSupplierTypeService.findAllOptimized().subscribe(orderSupplierTypes => this.orderSupplierTypes = orderSupplierTypes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadCriticality(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('PurchaseOrder', 'list');
        isPermistted ? this.criticalityService.findAllOptimized().subscribe(criticalitys => this.criticalitys = criticalitys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadSupplier(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('PurchaseOrder', 'list');
        isPermistted ? this.supplierService.findAllOptimized().subscribe(suppliers => this.suppliers = suppliers,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadRecipient(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('PurchaseOrder', 'list');
        isPermistted ? this.recipientService.findAllOptimized().subscribe(recipients => this.recipients = recipients,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadPurchaser(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('PurchaseOrder', 'list');
        isPermistted ? this.purchaserService.findAllOptimized().subscribe(purchasers => this.purchasers = purchasers,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadCurrency(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('PurchaseOrder', 'list');
        isPermistted ? this.currencyService.findAllOptimized().subscribe(currencys => this.currencys = currencys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadPurchaseOrderStatus(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('PurchaseOrder', 'list');
        isPermistted ? this.purchaseOrderStatusService.findAllOptimized().subscribe(purchaseOrderStatuss => this.purchaseOrderStatuss = purchaseOrderStatuss,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadPurchaseRequest(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('PurchaseOrder', 'list');
        isPermistted ? this.purchaseRequestService.findAllOptimized().subscribe(purchaseRequests => this.purchaseRequests = purchaseRequests,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: PurchaseOrderDto) {
        if (res.purchaseOrderProducts != null) {
             res.purchaseOrderProducts.forEach(d => { d.purchaseOrder = null; d.id = null; });
        }
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Refrence': e.refrence ,
                'Order supplier type': e.orderSupplierType?.libelle ,
                'Date order supplier': this.datePipe.transform(e.dateOrderSupplier , 'dd/MM/yyyy hh:mm'),
                'Criticality': e.criticality?.libelle ,
                'Supplier': e.supplier?.reference ,
                'Recipient': e.recipient?.libelle ,
                'Purchaser': e.purchaser?.libelle ,
                 'Total': e.total ,
                 'Description': e.description ,
                'Currency': e.currency?.libelle ,
                'Purchase order status': e.purchaseOrderStatus?.libelle ,
                'Purchase request': e.purchaseRequest?.refrence ,
            }
        });

        this.criteriaData = [{
            'Refrence': this.criteria.refrence ? this.criteria.refrence : environment.emptyForExport ,
        //'Order supplier type': this.criteria.orderSupplierType?.libelle ? this.criteria.orderSupplierType?.libelle : environment.emptyForExport ,
            'Date order supplier Min': this.criteria.dateOrderSupplierFrom ? this.datePipe.transform(this.criteria.dateOrderSupplierFrom , this.dateFormat) : environment.emptyForExport ,
            'Date order supplier Max': this.criteria.dateOrderSupplierTo ? this.datePipe.transform(this.criteria.dateOrderSupplierTo , this.dateFormat) : environment.emptyForExport ,
        //'Criticality': this.criteria.criticality?.libelle ? this.criteria.criticality?.libelle : environment.emptyForExport ,
        //'Supplier': this.criteria.supplier?.reference ? this.criteria.supplier?.reference : environment.emptyForExport ,
        //'Recipient': this.criteria.recipient?.libelle ? this.criteria.recipient?.libelle : environment.emptyForExport ,
        //'Purchaser': this.criteria.purchaser?.libelle ? this.criteria.purchaser?.libelle : environment.emptyForExport ,
            'Total Min': this.criteria.totalMin ? this.criteria.totalMin : environment.emptyForExport ,
            'Total Max': this.criteria.totalMax ? this.criteria.totalMax : environment.emptyForExport ,
            'Description': this.criteria.description ? this.criteria.description : environment.emptyForExport ,
        //'Currency': this.criteria.currency?.libelle ? this.criteria.currency?.libelle : environment.emptyForExport ,
        //'Purchase order status': this.criteria.purchaseOrderStatus?.libelle ? this.criteria.purchaseOrderStatus?.libelle : environment.emptyForExport ,
        //'Purchase request': this.criteria.purchaseRequest?.refrence ? this.criteria.purchaseRequest?.refrence : environment.emptyForExport ,
        }];
      }
}
