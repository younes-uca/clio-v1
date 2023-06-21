import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

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
  selector: 'app-purchase-request-view-admin',
  templateUrl: './purchase-request-view-admin.component.html'
})
export class PurchaseRequestViewAdminComponent extends AbstractViewController<PurchaseRequestDto, PurchaseRequestCriteria, PurchaseRequestService> implements OnInit {

    purchaseRequestProducts = new PurchaseRequestProductDto();
    purchaseRequestProductss: Array<PurchaseRequestProductDto> = [];

    constructor(private purchaseRequestService: PurchaseRequestService, private purchaseRequestProductService: PurchaseRequestProductService, private unitePriceService: UnitePriceService, private purchaseRequestStatusService: PurchaseRequestStatusService, private supplierService: SupplierService, private productService: ProductService, private purchaseRequestProductStatusService: PurchaseRequestProductStatusService){
        super(purchaseRequestService);
    }

    ngOnInit(): void {
        this.purchaseRequestProducts.product = new ProductDto();
        this.productService.findAll().subscribe((data) => this.products = data);
        this.purchaseRequestProducts.unitePrice = new UnitePriceDto();
        this.unitePriceService.findAll().subscribe((data) => this.unitePrices = data);
        this.purchaseRequestProducts.purchaseRequestProductStatus = new PurchaseRequestProductStatusDto();
        this.purchaseRequestProductStatusService.findAll().subscribe((data) => this.purchaseRequestProductStatuss = data);
        this.supplier = new SupplierDto();
        this.supplierService.findAll().subscribe((data) => this.suppliers = data);
        this.purchaseRequestStatus = new PurchaseRequestStatusDto();
        this.purchaseRequestStatusService.findAll().subscribe((data) => this.purchaseRequestStatuss = data);
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
    get purchaseRequestProductStatus(): PurchaseRequestProductStatusDto {
       return this.purchaseRequestProductStatusService.item;
    }
    set purchaseRequestProductStatus(value: PurchaseRequestProductStatusDto) {
        this.purchaseRequestProductStatusService.item = value;
    }
    get purchaseRequestProductStatuss():Array<PurchaseRequestProductStatusDto> {
       return this.purchaseRequestProductStatusService.items;
    }
    set purchaseRequestProductStatuss(value: Array<PurchaseRequestProductStatusDto>) {
        this.purchaseRequestProductStatusService.items = value;
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
    get purchaseRequestStatus(): PurchaseRequestStatusDto {
       return this.purchaseRequestStatusService.item;
    }
    set purchaseRequestStatus(value: PurchaseRequestStatusDto) {
        this.purchaseRequestStatusService.item = value;
    }
    get purchaseRequestStatuss():Array<PurchaseRequestStatusDto> {
       return this.purchaseRequestStatusService.items;
    }
    set purchaseRequestStatuss(value: Array<PurchaseRequestStatusDto>) {
        this.purchaseRequestStatusService.items = value;
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
