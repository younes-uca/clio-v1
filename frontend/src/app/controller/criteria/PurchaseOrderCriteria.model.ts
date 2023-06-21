import {PurchaseOrderStatusCriteria} from './PurchaseOrderStatusCriteria.model';
import {CurrencyCriteria} from './CurrencyCriteria.model';
import {PurchaseOrderProductCriteria} from './PurchaseOrderProductCriteria.model';
import {OrderSupplierTypeCriteria} from './OrderSupplierTypeCriteria.model';
import {PurchaserCriteria} from './PurchaserCriteria.model';
import {RecipientCriteria} from './RecipientCriteria.model';
import {SupplierCriteria} from './SupplierCriteria.model';
import {CriticalityCriteria} from './CriticalityCriteria.model';
import {PurchaseRequestCriteria} from './PurchaseRequestCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class PurchaseOrderCriteria  extends   BaseCriteria  {

    public id: number;
    public refrence: string;
    public refrenceLike: string;
    public dateOrderSupplier: Date;
    public dateOrderSupplierFrom: Date;
    public dateOrderSupplierTo: Date;
     public total: number;
     public totalMin: number;
     public totalMax: number;
    public description: string;
    public descriptionLike: string;
  public orderSupplierType: OrderSupplierTypeCriteria ;
  public orderSupplierTypes: Array<OrderSupplierTypeCriteria> ;
  public criticality: CriticalityCriteria ;
  public criticalitys: Array<CriticalityCriteria> ;
  public supplier: SupplierCriteria ;
  public suppliers: Array<SupplierCriteria> ;
  public recipient: RecipientCriteria ;
  public recipients: Array<RecipientCriteria> ;
  public purchaser: PurchaserCriteria ;
  public purchasers: Array<PurchaserCriteria> ;
  public currency: CurrencyCriteria ;
  public currencys: Array<CurrencyCriteria> ;
  public purchaseOrderStatus: PurchaseOrderStatusCriteria ;
  public purchaseOrderStatuss: Array<PurchaseOrderStatusCriteria> ;
  public purchaseRequest: PurchaseRequestCriteria ;
  public purchaseRequests: Array<PurchaseRequestCriteria> ;
      public purchaseOrderProducts: Array<PurchaseOrderProductCriteria>;

}
