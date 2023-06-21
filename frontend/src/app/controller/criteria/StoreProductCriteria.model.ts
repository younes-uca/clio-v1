import {StoreCriteria} from './StoreCriteria.model';
import {ProductCriteria} from './ProductCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class StoreProductCriteria  extends   BaseCriteria  {

    public id: number;
     public qantity: number;
     public qantityMin: number;
     public qantityMax: number;
  public store: StoreCriteria ;
  public stores: Array<StoreCriteria> ;
  public product: ProductCriteria ;
  public products: Array<ProductCriteria> ;

}
