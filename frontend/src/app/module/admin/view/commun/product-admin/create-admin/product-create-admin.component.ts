import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {ProductService} from 'src/app/controller/service/Product.service';
import {ProductDto} from 'src/app/controller/model/Product.model';
import {ProductCriteria} from 'src/app/controller/criteria/ProductCriteria.model';
import {ProductFamilyDto} from 'src/app/controller/model/ProductFamily.model';
import {ProductFamilyService} from 'src/app/controller/service/ProductFamily.service';
@Component({
  selector: 'app-product-create-admin',
  templateUrl: './product-create-admin.component.html'
})
export class ProductCreateAdminComponent extends AbstractCreateController<ProductDto, ProductCriteria, ProductService>  implements OnInit {



    private _validProductFamilyLibelle = true;
    private _validProductFamilyCode = true;

    constructor( private productService: ProductService , private productFamilyService: ProductFamilyService) {
        super(productService);
    }

    ngOnInit(): void {
    this.productFamily = new ProductFamilyDto();
    this.productFamilyService.findAll().subscribe((data) => this.productFamilys = data);
}





    public setValidation(value: boolean){
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }



    public async openCreateProductFamily(productFamily: string) {
    const isPermistted = await this.roleService.isPermitted('ProductFamily', 'add');
    if(isPermistted) {
         this.productFamily = new ProductFamilyDto();
         this.createProductFamilyDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
    }

    get productFamily(): ProductFamilyDto {
        return this.productFamilyService.item;
    }
    set productFamily(value: ProductFamilyDto) {
        this.productFamilyService.item = value;
    }
    get productFamilys(): Array<ProductFamilyDto> {
        return this.productFamilyService.items;
    }
    set productFamilys(value: Array<ProductFamilyDto>) {
        this.productFamilyService.items = value;
    }
    get createProductFamilyDialog(): boolean {
       return this.productFamilyService.createDialog;
    }
    set createProductFamilyDialog(value: boolean) {
        this.productFamilyService.createDialog= value;
    }




    get validProductFamilyLibelle(): boolean {
        return this._validProductFamilyLibelle;
    }
    set validProductFamilyLibelle(value: boolean) {
        this._validProductFamilyLibelle = value;
    }
    get validProductFamilyCode(): boolean {
        return this._validProductFamilyCode;
    }
    set validProductFamilyCode(value: boolean) {
        this._validProductFamilyCode = value;
    }


}
