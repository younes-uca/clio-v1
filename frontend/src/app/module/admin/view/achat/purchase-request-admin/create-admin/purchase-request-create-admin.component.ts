import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {PurchaseRequestService} from 'src/app/controller/service/PurchaseRequest.service';
import {PurchaseRequestDto} from 'src/app/controller/model/PurchaseRequest.model';
import {PurchaseRequestCriteria} from 'src/app/controller/criteria/PurchaseRequestCriteria.model';
import {PurchaseRequestProductDto} from 'src/app/controller/model/PurchaseRequestProduct.model';
import {PurchaseRequestProductService} from 'src/app/controller/service/PurchaseRequestProduct.service';
import {UnitePriceDto} from 'src/app/controller/model/UnitePrice.model';
import {UnitePriceService} from 'src/app/controller/service/UnitePrice.service';
import {PurchaseRequestStatusDto} from 'src/app/controller/model/PurchaseRequestStatus.model';
import {PurchaseRequestStatusService} from 'src/app/controller/service/PurchaseRequestStatus.service';
import {SupplierDto} from 'src/app/controller/model/Supplier.model';
import {SupplierService} from 'src/app/controller/service/Supplier.service';
import {ProductDto} from 'src/app/controller/model/Product.model';
import {ProductService} from 'src/app/controller/service/Product.service';
import {PurchaseRequestProductStatusDto} from 'src/app/controller/model/PurchaseRequestProductStatus.model';
import {PurchaseRequestProductStatusService} from 'src/app/controller/service/PurchaseRequestProductStatus.service';
@Component({
  selector: 'app-purchase-request-create-admin',
  templateUrl: './purchase-request-create-admin.component.html'
})
export class PurchaseRequestCreateAdminComponent extends AbstractCreateController<PurchaseRequestDto, PurchaseRequestCriteria, PurchaseRequestService>  implements OnInit {

    private _purchaseRequestProductsElement = new PurchaseRequestProductDto();


   private _validPurchaseRequestRefrence = true;
    private _validSupplierReference = true;
    private _validPurchaseRequestStatusLibelle = true;
    private _validPurchaseRequestStatusCode = true;

    constructor( private purchaseRequestService: PurchaseRequestService , private purchaseRequestProductService: PurchaseRequestProductService, private unitePriceService: UnitePriceService, private purchaseRequestStatusService: PurchaseRequestStatusService, private supplierService: SupplierService, private productService: ProductService, private purchaseRequestProductStatusService: PurchaseRequestProductStatusService) {
        super(purchaseRequestService);
    }

    ngOnInit(): void {
        this.purchaseRequestProductsElement.product = new ProductDto();
        this.productService.findAll().subscribe((data) => this.products = data);
        this.purchaseRequestProductsElement.unitePrice = new UnitePriceDto();
        this.unitePriceService.findAll().subscribe((data) => this.unitePrices = data);
        this.purchaseRequestProductsElement.purchaseRequestProductStatus = new PurchaseRequestProductStatusDto();
        this.purchaseRequestProductStatusService.findAll().subscribe((data) => this.purchaseRequestProductStatuss = data);
    this.supplier = new SupplierDto();
    this.supplierService.findAll().subscribe((data) => this.suppliers = data);
    this.purchaseRequestStatus = new PurchaseRequestStatusDto();
    this.purchaseRequestStatusService.findAll().subscribe((data) => this.purchaseRequestStatuss = data);
}



    validatePurchaseRequestProducts(){
        this.errorMessages = new Array();
    }


    public setValidation(value: boolean){
        this.validPurchaseRequestRefrence = value;
    }

    public addPurchaseRequestProducts() {
        if( this.item.purchaseRequestProducts == null )
            this.item.purchaseRequestProducts = new Array<PurchaseRequestProductDto>();
       this.validatePurchaseRequestProducts();
       if (this.errorMessages.length === 0) {
              this.item.purchaseRequestProducts.push({... this.purchaseRequestProductsElement});
              this.purchaseRequestProductsElement = new PurchaseRequestProductDto();
       }else{
            this.messageService.add({severity: 'error',summary: 'Erreurs',detail: 'Merci de corrigé les erreurs suivant : ' + this.errorMessages});
       }
    }


    public deletePurchaseRequestProduct(p: PurchaseRequestProductDto) {
        this.item.purchaseRequestProducts.forEach((element, index) => {
            if (element === p) { this.item.purchaseRequestProducts.splice(index, 1); }
        });
    }

    public editPurchaseRequestProduct(p: PurchaseRequestProductDto) {
        this.purchaseRequestProductsElement = {... p};
        this.activeTab = 0;
    }


    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validatePurchaseRequestRefrence();
    }

    public validatePurchaseRequestRefrence(){
        if (this.stringUtilService.isEmpty(this.item.refrence)) {
        this.errorMessages.push('Refrence non valide');
        this.validPurchaseRequestRefrence = false;
        } else {
            this.validPurchaseRequestRefrence = true;
        }
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
    get purchaseRequestProductStatus(): PurchaseRequestProductStatusDto {
        return this.purchaseRequestProductStatusService.item;
    }
    set purchaseRequestProductStatus(value: PurchaseRequestProductStatusDto) {
        this.purchaseRequestProductStatusService.item = value;
    }
    get purchaseRequestProductStatuss(): Array<PurchaseRequestProductStatusDto> {
        return this.purchaseRequestProductStatusService.items;
    }
    set purchaseRequestProductStatuss(value: Array<PurchaseRequestProductStatusDto>) {
        this.purchaseRequestProductStatusService.items = value;
    }
    get createPurchaseRequestProductStatusDialog(): boolean {
       return this.purchaseRequestProductStatusService.createDialog;
    }
    set createPurchaseRequestProductStatusDialog(value: boolean) {
        this.purchaseRequestProductStatusService.createDialog= value;
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
    get purchaseRequestStatus(): PurchaseRequestStatusDto {
        return this.purchaseRequestStatusService.item;
    }
    set purchaseRequestStatus(value: PurchaseRequestStatusDto) {
        this.purchaseRequestStatusService.item = value;
    }
    get purchaseRequestStatuss(): Array<PurchaseRequestStatusDto> {
        return this.purchaseRequestStatusService.items;
    }
    set purchaseRequestStatuss(value: Array<PurchaseRequestStatusDto>) {
        this.purchaseRequestStatusService.items = value;
    }
    get createPurchaseRequestStatusDialog(): boolean {
       return this.purchaseRequestStatusService.createDialog;
    }
    set createPurchaseRequestStatusDialog(value: boolean) {
        this.purchaseRequestStatusService.createDialog= value;
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



    get validPurchaseRequestRefrence(): boolean {
        return this._validPurchaseRequestRefrence;
    }

    set validPurchaseRequestRefrence(value: boolean) {
         this._validPurchaseRequestRefrence = value;
    }

    get validSupplierReference(): boolean {
        return this._validSupplierReference;
    }
    set validSupplierReference(value: boolean) {
        this._validSupplierReference = value;
    }
    get validPurchaseRequestStatusLibelle(): boolean {
        return this._validPurchaseRequestStatusLibelle;
    }
    set validPurchaseRequestStatusLibelle(value: boolean) {
        this._validPurchaseRequestStatusLibelle = value;
    }
    get validPurchaseRequestStatusCode(): boolean {
        return this._validPurchaseRequestStatusCode;
    }
    set validPurchaseRequestStatusCode(value: boolean) {
        this._validPurchaseRequestStatusCode = value;
    }

    get purchaseRequestProductsElement(): PurchaseRequestProductDto {
        if( this._purchaseRequestProductsElement == null )
            this._purchaseRequestProductsElement = new PurchaseRequestProductDto();
        return this._purchaseRequestProductsElement;
    }

    set purchaseRequestProductsElement(value: PurchaseRequestProductDto) {
        this._purchaseRequestProductsElement = value;
    }

}
