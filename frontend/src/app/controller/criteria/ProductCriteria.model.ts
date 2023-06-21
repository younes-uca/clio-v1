import {ProductFamilyCriteria} from './ProductFamilyCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class ProductCriteria  extends   BaseCriteria  {

    public id: number;
    public partNumber: string;
    public partNumberLike: string;
  public productFamily: ProductFamilyCriteria ;
  public productFamilys: Array<ProductFamilyCriteria> ;

}
