import {PurchaseRequestProductStatusCriteria} from './PurchaseRequestProductStatusCriteria.model';
import {ProductCriteria} from './ProductCriteria.model';
import {UnitePriceCriteria} from './UnitePriceCriteria.model';
import {PurchaseRequestCriteria} from './PurchaseRequestCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class PurchaseRequestProductCriteria  extends   BaseCriteria  {

    public id: number;
     public qantity: number;
     public qantityMin: number;
     public qantityMax: number;
     public qantityOrdred: number;
     public qantityOrdredMin: number;
     public qantityOrdredMax: number;
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
  public purchaseRequest: PurchaseRequestCriteria ;
  public purchaseRequests: Array<PurchaseRequestCriteria> ;
  public unitePrice: UnitePriceCriteria ;
  public unitePrices: Array<UnitePriceCriteria> ;
  public purchaseRequestProductStatus: PurchaseRequestProductStatusCriteria ;
  public purchaseRequestProductStatuss: Array<PurchaseRequestProductStatusCriteria> ;

}
