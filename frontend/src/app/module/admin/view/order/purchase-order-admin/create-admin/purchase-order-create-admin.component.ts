import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

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
  selector: 'app-purchase-order-create-admin',
  templateUrl: './purchase-order-create-admin.component.html'
})
export class PurchaseOrderCreateAdminComponent extends AbstractCreateController<PurchaseOrderDto, PurchaseOrderCriteria, PurchaseOrderService>  implements OnInit {

    private _PurchaseOrderProductsElement = new PurchaseOrderProductDto();


   private _validPurchaseOrderRefrence = true;
    private _validOrderSupplierTypeLibelle = true;
    private _validOrderSupplierTypeCode = true;
    private _validCriticalityLibelle = true;
    private _validCriticalityCode = true;
    private _validSupplierReference = true;
    private _validRecipientLibelle = true;
    private _validRecipientCode = true;
    private _validPurchaserLibelle = true;
    private _validPurchaserCode = true;
    private _validCurrencyLibelle = true;
    private _validCurrencyCode = true;
    private _validPurchaseOrderStatusLibelle = true;
    private _validPurchaseOrderStatusCode = true;
    private _validPurchaseRequestRefrence = true;

    constructor( private purchaseOrderService: PurchaseOrderService , private purchaserService: PurchaserService, private purchaseOrderProductStatusService: PurchaseOrderProductStatusService, private orderSupplierTypeService: OrderSupplierTypeService, private purchaseRequestService: PurchaseRequestService, private unitePriceService: UnitePriceService, private purchaseOrderStatusService: PurchaseOrderStatusService, private supplierService: SupplierService, private recipientService: RecipientService, private productService: ProductService, private currencyService: CurrencyService, private criticalityService: CriticalityService, private purchaseOrderProductService: PurchaseOrderProductService) {
        super(purchaseOrderService);
    }

    ngOnInit(): void {
        this.PurchaseOrderProductsElement.product = new ProductDto();
        this.productService.findAll().subscribe((data) => this.products = data);
        this.PurchaseOrderProductsElement.purchaseOrderProductStatus = new PurchaseOrderProductStatusDto();
        this.purchaseOrderProductStatusService.findAll().subscribe((data) => this.purchaseOrderProductStatuss = data);
        this.PurchaseOrderProductsElement.unitePrice = new UnitePriceDto();
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



    validatePurchaseOrderProducts(){
        this.errorMessages = new Array();
    }


    public setValidation(value: boolean){
        this.validPurchaseOrderRefrence = value;
    }

    public addPurchaseOrderProducts() {
        if( this.item.PurchaseOrderProducts == null )
            this.item.PurchaseOrderProducts = new Array<PurchaseOrderProductDto>();
       this.validatePurchaseOrderProducts();
       if (this.errorMessages.length === 0) {
              this.item.PurchaseOrderProducts.push({... this.PurchaseOrderProductsElement});
              this.PurchaseOrderProductsElement = new PurchaseOrderProductDto();
       }else{
            this.messageService.add({severity: 'error',summary: 'Erreurs',detail: 'Merci de corrigé les erreurs suivant : ' + this.errorMessages});
       }
    }


    public deletePurchaseOrderProduct(p: PurchaseOrderProductDto) {
        this.item.PurchaseOrderProducts.forEach((element, index) => {
            if (element === p) { this.item.PurchaseOrderProducts.splice(index, 1); }
        });
    }

    public editPurchaseOrderProduct(p: PurchaseOrderProductDto) {
        this.PurchaseOrderProductsElement = {... p};
        this.activeTab = 0;
    }


    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validatePurchaseOrderRefrence();
    }

    public validatePurchaseOrderRefrence(){
        if (this.stringUtilService.isEmpty(this.item.refrence)) {
        this.errorMessages.push('Refrence non valide');
        this.validPurchaseOrderRefrence = false;
        } else {
            this.validPurchaseOrderRefrence = true;
        }
    }



    get recipient(): RecipientDto {
        return this.recipientService.item;
    }
    set recipient(value: RecipientDto) {
        this.recipientService.item = value;
    }
    get recipients(): Array<RecipientDto> {
        return this.recipientService.items;
    }
    set recipients(value: Array<RecipientDto>) {
        this.recipientService.items = value;
    }
    get createRecipientDialog(): boolean {
       return this.recipientService.createDialog;
    }
    set createRecipientDialog(value: boolean) {
        this.recipientService.createDialog= value;
    }
    get product(): ProductDto {
        return this.productService.item;
    }
    set product(value: ProductDto) {
        this.productService.item = value;
    }
    get products(): Array<ProductDto> {
        return this.productService.items;
    }
    set products(value: Array<ProductDto>) {
        this.productService.items = value;
    }
    get createProductDialog(): boolean {
       return this.productService.createDialog;
    }
    set createProductDialog(value: boolean) {
        this.productService.createDialog= value;
    }
    get orderSupplierType(): OrderSupplierTypeDto {
        return this.orderSupplierTypeService.item;
    }
    set orderSupplierType(value: OrderSupplierTypeDto) {
        this.orderSupplierTypeService.item = value;
    }
    get orderSupplierTypes(): Array<OrderSupplierTypeDto> {
        return this.orderSupplierTypeService.items;
    }
    set orderSupplierTypes(value: Array<OrderSupplierTypeDto>) {
        this.orderSupplierTypeService.items = value;
    }
    get createOrderSupplierTypeDialog(): boolean {
       return this.orderSupplierTypeService.createDialog;
    }
    set createOrderSupplierTypeDialog(value: boolean) {
        this.orderSupplierTypeService.createDialog= value;
    }
    get purchaser(): PurchaserDto {
        return this.purchaserService.item;
    }
    set purchaser(value: PurchaserDto) {
        this.purchaserService.item = value;
    }
    get purchasers(): Array<PurchaserDto> {
        return this.purchaserService.items;
    }
    set purchasers(value: Array<PurchaserDto>) {
        this.purchaserService.items = value;
    }
    get createPurchaserDialog(): boolean {
       return this.purchaserService.createDialog;
    }
    set createPurchaserDialog(value: boolean) {
        this.purchaserService.createDialog= value;
    }
    get purchaseRequest(): PurchaseRequestDto {
        return this.purchaseRequestService.item;
    }
    set purchaseRequest(value: PurchaseRequestDto) {
        this.purchaseRequestService.item = value;
    }
    get purchaseRequests(): Array<PurchaseRequestDto> {
        return this.purchaseRequestService.items;
    }
    set purchaseRequests(value: Array<PurchaseRequestDto>) {
        this.purchaseRequestService.items = value;
    }
    get createPurchaseRequestDialog(): boolean {
       return this.purchaseRequestService.createDialog;
    }
    set createPurchaseRequestDialog(value: boolean) {
        this.purchaseRequestService.createDialog= value;
    }
    get currency(): CurrencyDto {
        return this.currencyService.item;
    }
    set currency(value: CurrencyDto) {
        this.currencyService.item = value;
    }
    get currencys(): Array<CurrencyDto> {
        return this.currencyService.items;
    }
    set currencys(value: Array<CurrencyDto>) {
        this.currencyService.items = value;
    }
    get createCurrencyDialog(): boolean {
       return this.currencyService.createDialog;
    }
    set createCurrencyDialog(value: boolean) {
        this.currencyService.createDialog= value;
    }
    get supplier(): SupplierDto {
        return this.supplierService.item;
    }
    set supplier(value: SupplierDto) {
        this.supplierService.item = value;
    }
    get suppliers(): Array<SupplierDto> {
        return this.supplierService.items;
    }
    set suppliers(value: Array<SupplierDto>) {
        this.supplierService.items = value;
    }
    get createSupplierDialog(): boolean {
       return this.supplierService.createDialog;
    }
    set createSupplierDialog(value: boolean) {
        this.supplierService.createDialog= value;
    }
    get criticality(): CriticalityDto {
        return this.criticalityService.item;
    }
    set criticality(value: CriticalityDto) {
        this.criticalityService.item = value;
    }
    get criticalitys(): Array<CriticalityDto> {
        return this.criticalityService.items;
    }
    set criticalitys(value: Array<CriticalityDto>) {
        this.criticalityService.items = value;
    }
    get createCriticalityDialog(): boolean {
       return this.criticalityService.createDialog;
    }
    set createCriticalityDialog(value: boolean) {
        this.criticalityService.createDialog= value;
    }
    get purchaseOrderStatus(): PurchaseOrderStatusDto {
        return this.purchaseOrderStatusService.item;
    }
    set purchaseOrderStatus(value: PurchaseOrderStatusDto) {
        this.purchaseOrderStatusService.item = value;
    }
    get purchaseOrderStatuss(): Array<PurchaseOrderStatusDto> {
        return this.purchaseOrderStatusService.items;
    }
    set purchaseOrderStatuss(value: Array<PurchaseOrderStatusDto>) {
        this.purchaseOrderStatusService.items = value;
    }
    get createPurchaseOrderStatusDialog(): boolean {
       return this.purchaseOrderStatusService.createDialog;
    }
    set createPurchaseOrderStatusDialog(value: boolean) {
        this.purchaseOrderStatusService.createDialog= value;
    }
    get purchaseOrderProductStatus(): PurchaseOrderProductStatusDto {
        return this.purchaseOrderProductStatusService.item;
    }
    set purchaseOrderProductStatus(value: PurchaseOrderProductStatusDto) {
        this.purchaseOrderProductStatusService.item = value;
    }
    get purchaseOrderProductStatuss(): Array<PurchaseOrderProductStatusDto> {
        return this.purchaseOrderProductStatusService.items;
    }
    set purchaseOrderProductStatuss(value: Array<PurchaseOrderProductStatusDto>) {
        this.purchaseOrderProductStatusService.items = value;
    }
    get createPurchaseOrderProductStatusDialog(): boolean {
       return this.purchaseOrderProductStatusService.createDialog;
    }
    set createPurchaseOrderProductStatusDialog(value: boolean) {
        this.purchaseOrderProductStatusService.createDialog= value;
    }
    get unitePrice(): UnitePriceDto {
        return this.unitePriceService.item;
    }
    set unitePrice(value: UnitePriceDto) {
        this.unitePriceService.item = value;
    }
    get unitePrices(): Array<UnitePriceDto> {
        return this.unitePriceService.items;
    }
    set unitePrices(value: Array<UnitePriceDto>) {
        this.unitePriceService.items = value;
    }
    get createUnitePriceDialog(): boolean {
       return this.unitePriceService.createDialog;
    }
    set createUnitePriceDialog(value: boolean) {
        this.unitePriceService.createDialog= value;
    }



    get validPurchaseOrderRefrence(): boolean {
        return this._validPurchaseOrderRefrence;
    }

    set validPurchaseOrderRefrence(value: boolean) {
         this._validPurchaseOrderRefrence = value;
    }

    get validOrderSupplierTypeLibelle(): boolean {
        return this._validOrderSupplierTypeLibelle;
    }
    set validOrderSupplierTypeLibelle(value: boolean) {
        this._validOrderSupplierTypeLibelle = value;
    }
    get validOrderSupplierTypeCode(): boolean {
        return this._validOrderSupplierTypeCode;
    }
    set validOrderSupplierTypeCode(value: boolean) {
        this._validOrderSupplierTypeCode = value;
    }
    get validCriticalityLibelle(): boolean {
        return this._validCriticalityLibelle;
    }
    set validCriticalityLibelle(value: boolean) {
        this._validCriticalityLibelle = value;
    }
    get validCriticalityCode(): boolean {
        return this._validCriticalityCode;
    }
    set validCriticalityCode(value: boolean) {
        this._validCriticalityCode = value;
    }
    get validSupplierReference(): boolean {
        return this._validSupplierReference;
    }
    set validSupplierReference(value: boolean) {
        this._validSupplierReference = value;
    }
    get validRecipientLibelle(): boolean {
        return this._validRecipientLibelle;
    }
    set validRecipientLibelle(value: boolean) {
        this._validRecipientLibelle = value;
    }
    get validRecipientCode(): boolean {
        return this._validRecipientCode;
    }
    set validRecipientCode(value: boolean) {
        this._validRecipientCode = value;
    }
    get validPurchaserLibelle(): boolean {
        return this._validPurchaserLibelle;
    }
    set validPurchaserLibelle(value: boolean) {
        this._validPurchaserLibelle = value;
    }
    get validPurchaserCode(): boolean {
        return this._validPurchaserCode;
    }
    set validPurchaserCode(value: boolean) {
        this._validPurchaserCode = value;
    }
    get validCurrencyLibelle(): boolean {
        return this._validCurrencyLibelle;
    }
    set validCurrencyLibelle(value: boolean) {
        this._validCurrencyLibelle = value;
    }
    get validCurrencyCode(): boolean {
        return this._validCurrencyCode;
    }
    set validCurrencyCode(value: boolean) {
        this._validCurrencyCode = value;
    }
    get validPurchaseOrderStatusLibelle(): boolean {
        return this._validPurchaseOrderStatusLibelle;
    }
    set validPurchaseOrderStatusLibelle(value: boolean) {
        this._validPurchaseOrderStatusLibelle = value;
    }
    get validPurchaseOrderStatusCode(): boolean {
        return this._validPurchaseOrderStatusCode;
    }
    set validPurchaseOrderStatusCode(value: boolean) {
        this._validPurchaseOrderStatusCode = value;
    }
    get validPurchaseRequestRefrence(): boolean {
        return this._validPurchaseRequestRefrence;
    }
    set validPurchaseRequestRefrence(value: boolean) {
        this._validPurchaseRequestRefrence = value;
    }

    get PurchaseOrderProductsElement(): PurchaseOrderProductDto {
        if( this._PurchaseOrderProductsElement == null )
            this._PurchaseOrderProductsElement = new PurchaseOrderProductDto();
        return this._PurchaseOrderProductsElement;
    }

    set PurchaseOrderProductsElement(value: PurchaseOrderProductDto) {
        this._PurchaseOrderProductsElement = value;
    }

}
