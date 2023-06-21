import {PurchaseOrderProductStatusDto} from './PurchaseOrderProductStatus.model';
import {ProductDto} from './Product.model';
import {PurchaseOrderDto} from './PurchaseOrder.model';
import {UnitePriceDto} from './UnitePrice.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class PurchaseOrderProductDto  extends BaseDto{

    public id: number;
    public qantity: number;
    public qantityDelivered: number;
    public price: number;
    public description: string;
    public qantityMax: string ;
    public qantityMin: string ;
    public qantityDeliveredMax: string ;
    public qantityDeliveredMin: string ;
    public priceMax: string ;
    public priceMin: string ;
    public product: ProductDto ;
    public purchaseOrder: PurchaseOrderDto ;
    public purchaseOrderProductStatus: PurchaseOrderProductStatusDto ;
    public unitePrice: UnitePriceDto ;

}
