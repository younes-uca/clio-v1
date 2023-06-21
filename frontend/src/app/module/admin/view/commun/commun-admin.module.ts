import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import {ToastModule} from 'primeng/toast';
import {ToolbarModule} from 'primeng/toolbar';
import {TableModule} from 'primeng/table';
import {DropdownModule} from 'primeng/dropdown';
import {InputSwitchModule} from 'primeng/inputswitch';
import {InputTextareaModule} from 'primeng/inputtextarea';

import { ConfirmDialogModule } from 'primeng/confirmdialog';
import { DialogModule } from 'primeng/dialog';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {CalendarModule} from 'primeng/calendar';
import {PanelModule} from 'primeng/panel';
import {InputNumberModule} from 'primeng/inputnumber';
import {BadgeModule} from 'primeng/badge';
import { MultiSelectModule } from 'primeng/multiselect';
import {TranslateModule} from '@ngx-translate/core';
import {FileUploadModule} from "primeng/fileupload";

import { CurrencyCreateAdminComponent } from './currency-admin/create-admin/currency-create-admin.component';
import { CurrencyEditAdminComponent } from './currency-admin/edit-admin/currency-edit-admin.component';
import { CurrencyViewAdminComponent } from './currency-admin/view-admin/currency-view-admin.component';
import { CurrencyListAdminComponent } from './currency-admin/list-admin/currency-list-admin.component';
import { OrderSupplierTypeCreateAdminComponent } from './order-supplier-type-admin/create-admin/order-supplier-type-create-admin.component';
import { OrderSupplierTypeEditAdminComponent } from './order-supplier-type-admin/edit-admin/order-supplier-type-edit-admin.component';
import { OrderSupplierTypeViewAdminComponent } from './order-supplier-type-admin/view-admin/order-supplier-type-view-admin.component';
import { OrderSupplierTypeListAdminComponent } from './order-supplier-type-admin/list-admin/order-supplier-type-list-admin.component';
import { SupplierCreateAdminComponent } from './supplier-admin/create-admin/supplier-create-admin.component';
import { SupplierEditAdminComponent } from './supplier-admin/edit-admin/supplier-edit-admin.component';
import { SupplierViewAdminComponent } from './supplier-admin/view-admin/supplier-view-admin.component';
import { SupplierListAdminComponent } from './supplier-admin/list-admin/supplier-list-admin.component';
import { RecipientCreateAdminComponent } from './recipient-admin/create-admin/recipient-create-admin.component';
import { RecipientEditAdminComponent } from './recipient-admin/edit-admin/recipient-edit-admin.component';
import { RecipientViewAdminComponent } from './recipient-admin/view-admin/recipient-view-admin.component';
import { RecipientListAdminComponent } from './recipient-admin/list-admin/recipient-list-admin.component';
import { PurchaseRequestStatusCreateAdminComponent } from './purchase-request-status-admin/create-admin/purchase-request-status-create-admin.component';
import { PurchaseRequestStatusEditAdminComponent } from './purchase-request-status-admin/edit-admin/purchase-request-status-edit-admin.component';
import { PurchaseRequestStatusViewAdminComponent } from './purchase-request-status-admin/view-admin/purchase-request-status-view-admin.component';
import { PurchaseRequestStatusListAdminComponent } from './purchase-request-status-admin/list-admin/purchase-request-status-list-admin.component';
import { StoreCreateAdminComponent } from './store-admin/create-admin/store-create-admin.component';
import { StoreEditAdminComponent } from './store-admin/edit-admin/store-edit-admin.component';
import { StoreViewAdminComponent } from './store-admin/view-admin/store-view-admin.component';
import { StoreListAdminComponent } from './store-admin/list-admin/store-list-admin.component';
import { CriticalityCreateAdminComponent } from './criticality-admin/create-admin/criticality-create-admin.component';
import { CriticalityEditAdminComponent } from './criticality-admin/edit-admin/criticality-edit-admin.component';
import { CriticalityViewAdminComponent } from './criticality-admin/view-admin/criticality-view-admin.component';
import { CriticalityListAdminComponent } from './criticality-admin/list-admin/criticality-list-admin.component';
import { OrderSupplierDeliveryStatusCreateAdminComponent } from './order-supplier-delivery-status-admin/create-admin/order-supplier-delivery-status-create-admin.component';
import { OrderSupplierDeliveryStatusEditAdminComponent } from './order-supplier-delivery-status-admin/edit-admin/order-supplier-delivery-status-edit-admin.component';
import { OrderSupplierDeliveryStatusViewAdminComponent } from './order-supplier-delivery-status-admin/view-admin/order-supplier-delivery-status-view-admin.component';
import { OrderSupplierDeliveryStatusListAdminComponent } from './order-supplier-delivery-status-admin/list-admin/order-supplier-delivery-status-list-admin.component';
import { ProductCreateAdminComponent } from './product-admin/create-admin/product-create-admin.component';
import { ProductEditAdminComponent } from './product-admin/edit-admin/product-edit-admin.component';
import { ProductViewAdminComponent } from './product-admin/view-admin/product-view-admin.component';
import { ProductListAdminComponent } from './product-admin/list-admin/product-list-admin.component';
import { PurchaseRequestProductStatusCreateAdminComponent } from './purchase-request-product-status-admin/create-admin/purchase-request-product-status-create-admin.component';
import { PurchaseRequestProductStatusEditAdminComponent } from './purchase-request-product-status-admin/edit-admin/purchase-request-product-status-edit-admin.component';
import { PurchaseRequestProductStatusViewAdminComponent } from './purchase-request-product-status-admin/view-admin/purchase-request-product-status-view-admin.component';
import { PurchaseRequestProductStatusListAdminComponent } from './purchase-request-product-status-admin/list-admin/purchase-request-product-status-list-admin.component';
import { ProductFamilyCreateAdminComponent } from './product-family-admin/create-admin/product-family-create-admin.component';
import { ProductFamilyEditAdminComponent } from './product-family-admin/edit-admin/product-family-edit-admin.component';
import { ProductFamilyViewAdminComponent } from './product-family-admin/view-admin/product-family-view-admin.component';
import { ProductFamilyListAdminComponent } from './product-family-admin/list-admin/product-family-list-admin.component';
import { OrderSupplierStatusCreateAdminComponent } from './order-supplier-status-admin/create-admin/order-supplier-status-create-admin.component';
import { OrderSupplierStatusEditAdminComponent } from './order-supplier-status-admin/edit-admin/order-supplier-status-edit-admin.component';
import { OrderSupplierStatusViewAdminComponent } from './order-supplier-status-admin/view-admin/order-supplier-status-view-admin.component';
import { OrderSupplierStatusListAdminComponent } from './order-supplier-status-admin/list-admin/order-supplier-status-list-admin.component';
import { StoreProductCreateAdminComponent } from './store-product-admin/create-admin/store-product-create-admin.component';
import { StoreProductEditAdminComponent } from './store-product-admin/edit-admin/store-product-edit-admin.component';
import { StoreProductViewAdminComponent } from './store-product-admin/view-admin/store-product-view-admin.component';
import { StoreProductListAdminComponent } from './store-product-admin/list-admin/store-product-list-admin.component';
import { PurchaserCreateAdminComponent } from './purchaser-admin/create-admin/purchaser-create-admin.component';
import { PurchaserEditAdminComponent } from './purchaser-admin/edit-admin/purchaser-edit-admin.component';
import { PurchaserViewAdminComponent } from './purchaser-admin/view-admin/purchaser-view-admin.component';
import { PurchaserListAdminComponent } from './purchaser-admin/list-admin/purchaser-list-admin.component';
import { PurchaseOrderProductStatusCreateAdminComponent } from './purchase-order-product-status-admin/create-admin/purchase-order-product-status-create-admin.component';
import { PurchaseOrderProductStatusEditAdminComponent } from './purchase-order-product-status-admin/edit-admin/purchase-order-product-status-edit-admin.component';
import { PurchaseOrderProductStatusViewAdminComponent } from './purchase-order-product-status-admin/view-admin/purchase-order-product-status-view-admin.component';
import { PurchaseOrderProductStatusListAdminComponent } from './purchase-order-product-status-admin/list-admin/purchase-order-product-status-list-admin.component';
import { UnitePriceCreateAdminComponent } from './unite-price-admin/create-admin/unite-price-create-admin.component';
import { UnitePriceEditAdminComponent } from './unite-price-admin/edit-admin/unite-price-edit-admin.component';
import { UnitePriceViewAdminComponent } from './unite-price-admin/view-admin/unite-price-view-admin.component';
import { UnitePriceListAdminComponent } from './unite-price-admin/list-admin/unite-price-list-admin.component';
import { PurchaseOrderStatusCreateAdminComponent } from './purchase-order-status-admin/create-admin/purchase-order-status-create-admin.component';
import { PurchaseOrderStatusEditAdminComponent } from './purchase-order-status-admin/edit-admin/purchase-order-status-edit-admin.component';
import { PurchaseOrderStatusViewAdminComponent } from './purchase-order-status-admin/view-admin/purchase-order-status-view-admin.component';
import { PurchaseOrderStatusListAdminComponent } from './purchase-order-status-admin/list-admin/purchase-order-status-list-admin.component';

import { PasswordModule } from 'primeng/password';
import { InputTextModule } from 'primeng/inputtext';
import {ButtonModule} from 'primeng/button';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
import {TabViewModule} from 'primeng/tabview';
import { SplitButtonModule } from 'primeng/splitbutton';
import { MessageModule } from 'primeng/message';
import {MessagesModule} from 'primeng/messages';
import {PaginatorModule} from 'primeng/paginator';



@NgModule({
  declarations: [

    CurrencyCreateAdminComponent,
    CurrencyListAdminComponent,
    CurrencyViewAdminComponent,
    CurrencyEditAdminComponent,
    OrderSupplierTypeCreateAdminComponent,
    OrderSupplierTypeListAdminComponent,
    OrderSupplierTypeViewAdminComponent,
    OrderSupplierTypeEditAdminComponent,
    SupplierCreateAdminComponent,
    SupplierListAdminComponent,
    SupplierViewAdminComponent,
    SupplierEditAdminComponent,
    RecipientCreateAdminComponent,
    RecipientListAdminComponent,
    RecipientViewAdminComponent,
    RecipientEditAdminComponent,
    PurchaseRequestStatusCreateAdminComponent,
    PurchaseRequestStatusListAdminComponent,
    PurchaseRequestStatusViewAdminComponent,
    PurchaseRequestStatusEditAdminComponent,
    StoreCreateAdminComponent,
    StoreListAdminComponent,
    StoreViewAdminComponent,
    StoreEditAdminComponent,
    CriticalityCreateAdminComponent,
    CriticalityListAdminComponent,
    CriticalityViewAdminComponent,
    CriticalityEditAdminComponent,
    OrderSupplierDeliveryStatusCreateAdminComponent,
    OrderSupplierDeliveryStatusListAdminComponent,
    OrderSupplierDeliveryStatusViewAdminComponent,
    OrderSupplierDeliveryStatusEditAdminComponent,
    ProductCreateAdminComponent,
    ProductListAdminComponent,
    ProductViewAdminComponent,
    ProductEditAdminComponent,
    PurchaseRequestProductStatusCreateAdminComponent,
    PurchaseRequestProductStatusListAdminComponent,
    PurchaseRequestProductStatusViewAdminComponent,
    PurchaseRequestProductStatusEditAdminComponent,
    ProductFamilyCreateAdminComponent,
    ProductFamilyListAdminComponent,
    ProductFamilyViewAdminComponent,
    ProductFamilyEditAdminComponent,
    OrderSupplierStatusCreateAdminComponent,
    OrderSupplierStatusListAdminComponent,
    OrderSupplierStatusViewAdminComponent,
    OrderSupplierStatusEditAdminComponent,
    StoreProductCreateAdminComponent,
    StoreProductListAdminComponent,
    StoreProductViewAdminComponent,
    StoreProductEditAdminComponent,
    PurchaserCreateAdminComponent,
    PurchaserListAdminComponent,
    PurchaserViewAdminComponent,
    PurchaserEditAdminComponent,
    PurchaseOrderProductStatusCreateAdminComponent,
    PurchaseOrderProductStatusListAdminComponent,
    PurchaseOrderProductStatusViewAdminComponent,
    PurchaseOrderProductStatusEditAdminComponent,
    UnitePriceCreateAdminComponent,
    UnitePriceListAdminComponent,
    UnitePriceViewAdminComponent,
    UnitePriceEditAdminComponent,
    PurchaseOrderStatusCreateAdminComponent,
    PurchaseOrderStatusListAdminComponent,
    PurchaseOrderStatusViewAdminComponent,
    PurchaseOrderStatusEditAdminComponent,
  ],
  imports: [
    CommonModule,
    ToastModule,
    ToolbarModule,
    TableModule,
    ConfirmDialogModule,
    DialogModule,
    PasswordModule,
    InputTextModule,
    ButtonModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
    SplitButtonModule,
    BrowserAnimationsModule,
    DropdownModule,
    TabViewModule,
    InputSwitchModule,
    InputTextareaModule,
    CalendarModule,
    PanelModule,
    MessageModule,
    MessagesModule,
    InputNumberModule,
    BadgeModule,
    MultiSelectModule,
    PaginatorModule,
    TranslateModule,
    FileUploadModule,
  ],
  exports: [
  CurrencyCreateAdminComponent,
  CurrencyListAdminComponent,
  CurrencyViewAdminComponent,
  CurrencyEditAdminComponent,
  OrderSupplierTypeCreateAdminComponent,
  OrderSupplierTypeListAdminComponent,
  OrderSupplierTypeViewAdminComponent,
  OrderSupplierTypeEditAdminComponent,
  SupplierCreateAdminComponent,
  SupplierListAdminComponent,
  SupplierViewAdminComponent,
  SupplierEditAdminComponent,
  RecipientCreateAdminComponent,
  RecipientListAdminComponent,
  RecipientViewAdminComponent,
  RecipientEditAdminComponent,
  PurchaseRequestStatusCreateAdminComponent,
  PurchaseRequestStatusListAdminComponent,
  PurchaseRequestStatusViewAdminComponent,
  PurchaseRequestStatusEditAdminComponent,
  StoreCreateAdminComponent,
  StoreListAdminComponent,
  StoreViewAdminComponent,
  StoreEditAdminComponent,
  CriticalityCreateAdminComponent,
  CriticalityListAdminComponent,
  CriticalityViewAdminComponent,
  CriticalityEditAdminComponent,
  OrderSupplierDeliveryStatusCreateAdminComponent,
  OrderSupplierDeliveryStatusListAdminComponent,
  OrderSupplierDeliveryStatusViewAdminComponent,
  OrderSupplierDeliveryStatusEditAdminComponent,
  ProductCreateAdminComponent,
  ProductListAdminComponent,
  ProductViewAdminComponent,
  ProductEditAdminComponent,
  PurchaseRequestProductStatusCreateAdminComponent,
  PurchaseRequestProductStatusListAdminComponent,
  PurchaseRequestProductStatusViewAdminComponent,
  PurchaseRequestProductStatusEditAdminComponent,
  ProductFamilyCreateAdminComponent,
  ProductFamilyListAdminComponent,
  ProductFamilyViewAdminComponent,
  ProductFamilyEditAdminComponent,
  OrderSupplierStatusCreateAdminComponent,
  OrderSupplierStatusListAdminComponent,
  OrderSupplierStatusViewAdminComponent,
  OrderSupplierStatusEditAdminComponent,
  StoreProductCreateAdminComponent,
  StoreProductListAdminComponent,
  StoreProductViewAdminComponent,
  StoreProductEditAdminComponent,
  PurchaserCreateAdminComponent,
  PurchaserListAdminComponent,
  PurchaserViewAdminComponent,
  PurchaserEditAdminComponent,
  PurchaseOrderProductStatusCreateAdminComponent,
  PurchaseOrderProductStatusListAdminComponent,
  PurchaseOrderProductStatusViewAdminComponent,
  PurchaseOrderProductStatusEditAdminComponent,
  UnitePriceCreateAdminComponent,
  UnitePriceListAdminComponent,
  UnitePriceViewAdminComponent,
  UnitePriceEditAdminComponent,
  PurchaseOrderStatusCreateAdminComponent,
  PurchaseOrderStatusListAdminComponent,
  PurchaseOrderStatusViewAdminComponent,
  PurchaseOrderStatusEditAdminComponent,
  ],
  entryComponents: [],
})
export class CommunAdminModule { }