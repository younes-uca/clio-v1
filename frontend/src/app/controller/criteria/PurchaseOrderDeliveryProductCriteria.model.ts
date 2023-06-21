import {ProductCriteria} from './ProductCriteria.model';
import {StoreCriteria} from './StoreCriteria.model';
import {PurchaseOrderDeliveryCriteria} from './PurchaseOrderDeliveryCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class PurchaseOrderDeliveryProductCriteria  extends   BaseCriteria  {

    public id: number;
     public qantity: number;
     public qantityMin: number;
     public qantityMax: number;
    public description: string;
    public descriptionLike: string;
  public product: ProductCriteria ;
  public products: Array<ProductCriteria> ;
  public purchaseOrderDelivery: PurchaseOrderDeliveryCriteria ;
  public purchaseOrderDeliverys: Array<PurchaseOrderDeliveryCriteria> ;
  public store: StoreCriteria ;
  public stores: Array<StoreCriteria> ;

}
