import {ProductDto} from './Product.model';
import {StoreDto} from './Store.model';
import {PurchaseOrderDeliveryDto} from './PurchaseOrderDelivery.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class PurchaseOrderDeliveryProductDto  extends BaseDto{

    public id: number;
    public qantity: number;
    public description: string;
    public qantityMax: string ;
    public qantityMin: string ;
    public product: ProductDto ;
    public purchaseOrderDelivery: PurchaseOrderDeliveryDto ;
    public store: StoreDto ;

}
