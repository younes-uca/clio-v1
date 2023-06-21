import {PurchaseOrderProductStatusCriteria} from './PurchaseOrderProductStatusCriteria.model';
import {ProductCriteria} from './ProductCriteria.model';
import {PurchaseOrderCriteria} from './PurchaseOrderCriteria.model';
import {UnitePriceCriteria} from './UnitePriceCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class PurchaseOrderProductCriteria  extends   BaseCriteria  {

    public id: number;
     public qantity: number;
     public qantityMin: number;
     public qantityMax: number;
     public qantityDelivered: number;
     public qantityDeliveredMin: number;
     public qantityDeliveredMax: number;
     public price: number;
     public priceMin: number;
     public priceMax: number;
    public description: string;
    public descriptionLike: string;
  public product: ProductCriteria ;
  public products: Array<ProductCriteria> ;
  public purchaseOrder: PurchaseOrderCriteria ;
  public purchaseOrders: Array<PurchaseOrderCriteria> ;
  public purchaseOrderProductStatus: PurchaseOrderProductStatusCriteria ;
  public purchaseOrderProductStatuss: Array<PurchaseOrderProductStatusCriteria> ;
  public unitePrice: UnitePriceCriteria ;
  public unitePrices: Array<UnitePriceCriteria> ;

}
