import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {PurchaseOrderService} from 'src/app/controller/service/PurchaseOrder.service';
import {PurchaseOrderDto} from 'src/app/controller/model/PurchaseOrder.model';
import {PurchaseOrderCriteria} from 'src/app/controller/criteria/PurchaseOrderCriteria.model';

import {PurchaserDto} from 'src/app/controller/model/Purchaser.model';
import {PurchaserService} from 'src/app/controller/service/Purchaser.service';
import {PurchaseOrderProductStatusDto} from 'src/app/controller/model/PurchaseOrderProductStatus.model';
import {PurchaseOrderProductStatusService} from 'src/app/controller/service/PurchaseOrderProductStatus.service';
import {OrderSupplierTypeDto} from 'src/app/controller/model/OrderSupplierType.model';
import {OrderSupplierTypeService} from 'src/app/controller/service/OrderSupplierType.service';
import {PurchaseRequestDto} from 'src/app/controller/model/PurchaseRequest.model';
import {PurchaseRequestService} from 'src/app/controller/service/PurchaseRequest.service';
import {PurchaseOrderStatusDto} from 'src/app/controller/model/PurchaseOrderStatus.model';
import {PurchaseOrderStatusService} from 'src/app/controller/service/PurchaseOrderStatus.service';
import {SupplierDto} from 'src/app/controller/model/Supplier.model';
import {SupplierService} from 'src/app/controller/service/Supplier.service';
import {ProductDto} from 'src/app/controller/model/Product.model';
import {ProductService} from 'src/app/controller/service/Product.service';
import {CurrencyDto} from 'src/app/controller/model/Currency.model';
import {CurrencyService} from 'src/app/controller/service/Currency.service';
import {CriticalityDto} from 'src/app/controller/model/Criticality.model';
import {CriticalityService} from 'src/app/controller/service/Criticality.service';
import {UnitePriceDto} from 'src/app/controller/model/UnitePrice.model';
import {UnitePriceService} from 'src/app/controller/service/UnitePrice.service';
import {RecipientDto} from 'src/app/controller/model/Recipient.model';
import {RecipientService} from 'src/app/controller/service/Recipient.service';
import {PurchaseOrderProductDto} from 'src/app/controller/model/PurchaseOrderProduct.model';
import {PurchaseOrderProductService} from 'src/app/controller/service/PurchaseOrderProduct.service';
@Component({
  selector: 'app-purchase-order-view-admin',
  templateUrl: './purchase-order-view-admin.component.html'
})
export class PurchaseOrderViewAdminComponent extends AbstractViewController<PurchaseOrderDto, PurchaseOrderCriteria, PurchaseOrderService> implements OnInit {

    PurchaseOrderProducts = new PurchaseOrderProductDto();
    PurchaseOrderProductss: Array<PurchaseOrderProductDto> = [];

    constructor(private purchaseOrderService: PurchaseOrderService, private purchaserService: PurchaserService, private purchaseOrderProductStatusService: PurchaseOrderProductStatusService, private orderSupplierTypeService: OrderSupplierTypeService, private purchaseRequestService: PurchaseRequestService, private unitePriceService: UnitePriceService, private purchaseOrderStatusService: PurchaseOrderStatusService, private supplierService: SupplierService, private recipientService: RecipientService, private productService: ProductService, private currencyService: CurrencyService, private criticalityService: CriticalityService, private purchaseOrderProductService: PurchaseOrderProductService){
        super(purchaseOrderService);
    }

    ngOnInit(): void {
        this.PurchaseOrderProducts.product = new ProductDto();
        this.productService.findAll().subscribe((data) => this.products = data);
        this.PurchaseOrderProducts.purchaseOrderProductStatus = new PurchaseOrderProductStatusDto();
        this.purchaseOrderProductStatusService.findAll().subscribe((data) => this.purchaseOrderProductStatuss = data);
        this.PurchaseOrderProducts.unitePrice = new UnitePriceDto();
        this.unitePriceService.findAll().subscribe((data) => this.unitePrices = data);
        this.orderSupplierType = new OrderSupplierTypeDto();
        this.orderSupplierTypeService.findAll().subscribe((data) => this.orderSupplierTypes = data);
        this.criticality = new CriticalityDto();
        this.criticalityService.findAll().subscribe((data) => this.criticalitys = data);
        this.supplier = new SupplierDto();
        this.supplierService.findAll().subscribe((data) => this.suppliers = data);
        this.recipient = new RecipientDto();
        this.recipientService.findAll().subscribe((data) => this.recipients = data);
        this.purchaser = new PurchaserDto();
        this.purchaserService.findAll().subscribe((data) => this.purchasers = data);
        this.currency = new CurrencyDto();
        this.currencyService.findAll().subscribe((data) => this.currencys = data);
        this.purchaseOrderStatus = new PurchaseOrderStatusDto();
        this.purchaseOrderStatusService.findAll().subscribe((data) => this.purchaseOrderStatuss = data);
        this.purchaseRequest = new PurchaseRequestDto();
        this.purchaseRequestService.findAll().subscribe((data) => this.purchaseRequests = data);
    }


    get recipient(): RecipientDto {
       return this.recipientService.item;
    }
    set recipient(value: RecipientDto) {
        this.recipientService.item = value;
    }
    get recipients():Array<RecipientDto> {
       return this.recipientService.items;
    }
    set recipients(value: Array<RecipientDto>) {
        this.recipientService.items = value;
    }
    get product(): ProductDto {
       return this.productService.item;
    }
    set product(value: ProductDto) {
        this.productService.item = value;
    }
    get products():Array<ProductDto> {
       return this.productService.items;
    }
    set products(value: Array<ProductDto>) {
        this.productService.items = value;
    }
    get orderSupplierType(): OrderSupplierTypeDto {
       return this.orderSupplierTypeService.item;
    }
    set orderSupplierType(value: OrderSupplierTypeDto) {
        this.orderSupplierTypeService.item = value;
    }
    get orderSupplierTypes():Array<OrderSupplierTypeDto> {
       return this.orderSupplierTypeService.items;
    }
    set orderSupplierTypes(value: Array<OrderSupplierTypeDto>) {
        this.orderSupplierTypeService.items = value;
    }
    get purchaser(): PurchaserDto {
       return this.purchaserService.item;
    }
    set purchaser(value: PurchaserDto) {
        this.purchaserService.item = value;
    }
    get purchasers():Array<PurchaserDto> {
       return this.purchaserService.items;
    }
    set purchasers(value: Array<PurchaserDto>) {
        this.purchaserService.items = value;
    }
    get purchaseRequest(): PurchaseRequestDto {
       return this.purchaseRequestService.item;
    }
    set purchaseRequest(value: PurchaseRequestDto) {
        this.purchaseRequestService.item = value;
    }
    get purchaseRequests():Array<PurchaseRequestDto> {
       return this.purchaseRequestService.items;
    }
    set purchaseRequests(value: Array<PurchaseRequestDto>) {
        this.purchaseRequestService.items = value;
    }
    get currency(): CurrencyDto {
       return this.currencyService.item;
    }
    set currency(value: CurrencyDto) {
        this.currencyService.item = value;
    }
    get currencys():Array<CurrencyDto> {
       return this.currencyService.items;
    }
    set currencys(value: Array<CurrencyDto>) {
        this.currencyService.items = value;
    }
    get supplier(): SupplierDto {
       return this.supplierService.item;
    }
    set supplier(value: SupplierDto) {
        this.supplierService.item = value;
    }
    get suppliers():Array<SupplierDto> {
       return this.supplierService.items;
    }
    set suppliers(value: Array<SupplierDto>) {
        this.supplierService.items = value;
    }
    get criticality(): CriticalityDto {
       return this.criticalityService.item;
    }
    set criticality(value: CriticalityDto) {
        this.criticalityService.item = value;
    }
    get criticalitys():Array<CriticalityDto> {
       return this.criticalityService.items;
    }
    set criticalitys(value: Array<CriticalityDto>) {
        this.criticalityService.items = value;
    }
    get purchaseOrderStatus(): PurchaseOrderStatusDto {
       return this.purchaseOrderStatusService.item;
    }
    set purchaseOrderStatus(value: PurchaseOrderStatusDto) {
        this.purchaseOrderStatusService.item = value;
    }
    get purchaseOrderStatuss():Array<PurchaseOrderStatusDto> {
       return this.purchaseOrderStatusService.items;
    }
    set purchaseOrderStatuss(value: Array<PurchaseOrderStatusDto>) {
        this.purchaseOrderStatusService.items = value;
    }
    get purchaseOrderProductStatus(): PurchaseOrderProductStatusDto {
       return this.purchaseOrderProductStatusService.item;
    }
    set purchaseOrderProductStatus(value: PurchaseOrderProductStatusDto) {
        this.purchaseOrderProductStatusService.item = value;
    }
    get purchaseOrderProductStatuss():Array<PurchaseOrderProductStatusDto> {
       return this.purchaseOrderProductStatusService.items;
    }
    set purchaseOrderProductStatuss(value: Array<PurchaseOrderProductStatusDto>) {
        this.purchaseOrderProductStatusService.items = value;
    }
    get unitePrice(): UnitePriceDto {
       return this.unitePriceService.item;
    }
    set unitePrice(value: UnitePriceDto) {
        this.unitePriceService.item = value;
    }
    get unitePrices():Array<UnitePriceDto> {
       return this.unitePriceService.items;
    }
    set unitePrices(value: Array<UnitePriceDto>) {
        this.unitePriceService.items = value;
    }


}
