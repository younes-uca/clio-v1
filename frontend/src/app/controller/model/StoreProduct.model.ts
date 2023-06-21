import {StoreDto} from './Store.model';
import {ProductDto} from './Product.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class StoreProductDto  extends BaseDto{

    public id: number;
    public qantity: number;
    public qantityMax: string ;
    public qantityMin: string ;
    public store: StoreDto ;
    public product: ProductDto ;

}
