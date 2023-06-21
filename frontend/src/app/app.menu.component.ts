import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import {
  trigger,
  state,
  style,
  transition,
  animate,
} from '@angular/animations';
import { AppComponent } from './app.component';
import { AppMainComponent } from './app.main.component';

import { AuthService } from 'src/app/zynerator/security/Auth.service';
import { RoleService } from 'src/app/zynerator/security/Role.service';

@Component({
  selector: 'app-menu',
  templateUrl: './app.menu.component.html',
  animations: [
    trigger('inline', [
      state(
        'hidden',
        style({
          height: '0px',
          overflow: 'hidden',
        })
      ),
      state(
        'visible',
        style({
          height: '*',
        })
      ),
      state(
        'hiddenAnimated',
        style({
          height: '0px',
          overflow: 'hidden',
        })
      ),
      state(
        'visibleAnimated',
        style({
          height: '*',
        })
      ),
      transition(
        'visibleAnimated => hiddenAnimated',
        animate('400ms cubic-bezier(0.86, 0, 0.07, 1)')
      ),
      transition(
        'hiddenAnimated => visibleAnimated',
        animate('400ms cubic-bezier(0.86, 0, 0.07, 1)')
      ),
    ]),
  ],
})
export class AppMenuComponent implements OnInit {
  model: any[];
  modelsuperadmin:any[];
  modelanonymous: any[];
    modeladmin : any[];
  constructor(public app: AppComponent,
   public appMain: AppMainComponent,
   private roleService: RoleService,
   private authService:AuthService,
  private router: Router) {}

  ngOnInit() {


    this.modeladmin =
      [
              {
                label: 'Configuration',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste currency',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/commun/currency/list']
                    },
                    {
                      label: 'Liste order supplier type',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/commun/order-supplier-type/list']
                    },
                    {
                      label: 'Liste supplier',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/commun/supplier/list']
                    },
                    {
                      label: 'Liste recipient',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/commun/recipient/list']
                    },
                    {
                      label: 'Liste purchase request status',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/commun/purchase-request-status/list']
                    },
                    {
                      label: 'Liste store',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/commun/store/list']
                    },
                    {
                      label: 'Liste criticality',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/commun/criticality/list']
                    },
                    {
                      label: 'Liste order supplier delivery status',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/commun/order-supplier-delivery-status/list']
                    },
                    {
                      label: 'Liste product',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/commun/product/list']
                    },
                    {
                      label: 'Liste purchase request product status',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/commun/purchase-request-product-status/list']
                    },
                    {
                      label: 'Liste product family',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/commun/product-family/list']
                    },
                    {
                      label: 'Liste order supplier status',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/commun/order-supplier-status/list']
                    },
                    {
                      label: 'Liste store product',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/commun/store-product/list']
                    },
                    {
                      label: 'Liste purchaser',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/commun/purchaser/list']
                    },
                    {
                      label: 'Liste purchase order product status',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/commun/purchase-order-product-status/list']
                    },
                    {
                      label: 'Liste unite price',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/commun/unite-price/list']
                    },
                    {
                      label: 'Liste purchase order status',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/commun/purchase-order-status/list']
                    },
                ]
              },
              {
                label: 'Bon Commande',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste purchase order',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/order/purchase-order/list']
                    },
                ]
              },
              {
                label: 'Gestion Achat',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste purchase request',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/achat/purchase-request/list']
                    },
                ]
              },
    ]
        if (this.authService.authenticated) {
      if (this.authService.authenticatedUser.roles) {

        this.authService.authenticatedUser.roles.forEach(role => {
          const roleName: string = this.getRole(role);
          this.roleService._role.next(roleName.toUpperCase());
          eval('this.model = this.model' + this.getRole(role));
        })
      }

    }
  }
  getRole(text){
  const [role, ...rest] = text.split('_');
  return rest.join('').toLowerCase();
}
  onMenuClick(event) {
    this.appMain.onMenuClick(event);
  }
}
