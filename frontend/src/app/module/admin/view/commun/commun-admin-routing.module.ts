
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';



import { CurrencyListAdminComponent } from './currency-admin/list-admin/currency-list-admin.component';
import { OrderSupplierTypeListAdminComponent } from './order-supplier-type-admin/list-admin/order-supplier-type-list-admin.component';
import { SupplierListAdminComponent } from './supplier-admin/list-admin/supplier-list-admin.component';
import { RecipientListAdminComponent } from './recipient-admin/list-admin/recipient-list-admin.component';
import { PurchaseRequestStatusListAdminComponent } from './purchase-request-status-admin/list-admin/purchase-request-status-list-admin.component';
import { StoreListAdminComponent } from './store-admin/list-admin/store-list-admin.component';
import { CriticalityListAdminComponent } from './criticality-admin/list-admin/criticality-list-admin.component';
import { OrderSupplierDeliveryStatusListAdminComponent } from './order-supplier-delivery-status-admin/list-admin/order-supplier-delivery-status-list-admin.component';
import { ProductListAdminComponent } from './product-admin/list-admin/product-list-admin.component';
import { PurchaseRequestProductStatusListAdminComponent } from './purchase-request-product-status-admin/list-admin/purchase-request-product-status-list-admin.component';
import { ProductFamilyListAdminComponent } from './product-family-admin/list-admin/product-family-list-admin.component';
import { OrderSupplierStatusListAdminComponent } from './order-supplier-status-admin/list-admin/order-supplier-status-list-admin.component';
import { StoreProductListAdminComponent } from './store-product-admin/list-admin/store-product-list-admin.component';
import { PurchaserListAdminComponent } from './purchaser-admin/list-admin/purchaser-list-admin.component';
import { PurchaseOrderProductStatusListAdminComponent } from './purchase-order-product-status-admin/list-admin/purchase-order-product-status-list-admin.component';
import { UnitePriceListAdminComponent } from './unite-price-admin/list-admin/unite-price-list-admin.component';
import { PurchaseOrderStatusListAdminComponent } from './purchase-order-status-admin/list-admin/purchase-order-status-list-admin.component';
@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [


                        {

                            path: 'currency',
                            children: [
                                {
                                    path: 'list',
                                    component: CurrencyListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'order-supplier-type',
                            children: [
                                {
                                    path: 'list',
                                    component: OrderSupplierTypeListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'supplier',
                            children: [
                                {
                                    path: 'list',
                                    component: SupplierListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'recipient',
                            children: [
                                {
                                    path: 'list',
                                    component: RecipientListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'purchase-request-status',
                            children: [
                                {
                                    path: 'list',
                                    component: PurchaseRequestStatusListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'store',
                            children: [
                                {
                                    path: 'list',
                                    component: StoreListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'criticality',
                            children: [
                                {
                                    path: 'list',
                                    component: CriticalityListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'order-supplier-delivery-status',
                            children: [
                                {
                                    path: 'list',
                                    component: OrderSupplierDeliveryStatusListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'product',
                            children: [
                                {
                                    path: 'list',
                                    component: ProductListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'purchase-request-product-status',
                            children: [
                                {
                                    path: 'list',
                                    component: PurchaseRequestProductStatusListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'product-family',
                            children: [
                                {
                                    path: 'list',
                                    component: ProductFamilyListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'order-supplier-status',
                            children: [
                                {
                                    path: 'list',
                                    component: OrderSupplierStatusListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'store-product',
                            children: [
                                {
                                    path: 'list',
                                    component: StoreProductListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'purchaser',
                            children: [
                                {
                                    path: 'list',
                                    component: PurchaserListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'purchase-order-product-status',
                            children: [
                                {
                                    path: 'list',
                                    component: PurchaseOrderProductStatusListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'unite-price',
                            children: [
                                {
                                    path: 'list',
                                    component: UnitePriceListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'purchase-order-status',
                            children: [
                                {
                                    path: 'list',
                                    component: PurchaseOrderStatusListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                    ]
                },
            ]
        ),
    ],
    exports: [RouterModule],
})
export class CommunAdminRoutingModule { }
