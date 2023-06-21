import {PurchaseRequestProductStatusDto} from './PurchaseRequestProductStatus.model';
import {ProductDto} from './Product.model';
import {UnitePriceDto} from './UnitePrice.model';
import {PurchaseRequestDto} from './PurchaseRequest.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class PurchaseRequestProductDto  extends BaseDto{

    public id: number;
    public qantity: number;
    public qantityOrdred: number;
    public qantityDelivered: number;
    public price: number;
    public description: string;
    public qantityMax: string ;
    public qantityMin: string ;
    public qantityOrdredMax: string ;
    public qantityOrdredMin: string ;
    public qantityDeliveredMax: string ;
    public qantityDeliveredMin: string ;
    public priceMax: string ;
    public priceMin: string ;
    public product: ProductDto ;
    public purchaseRequest: PurchaseRequestDto ;
    public unitePrice: UnitePriceDto ;
    public purchaseRequestProductStatus: PurchaseRequestProductStatusDto ;

}
