import {PurchaseOrderStatusDto} from './PurchaseOrderStatus.model';
import {CurrencyDto} from './Currency.model';
import {PurchaseOrderProductDto} from './PurchaseOrderProduct.model';
import {OrderSupplierTypeDto} from './OrderSupplierType.model';
import {PurchaserDto} from './Purchaser.model';
import {RecipientDto} from './Recipient.model';
import {SupplierDto} from './Supplier.model';
import {CriticalityDto} from './Criticality.model';
import {PurchaseRequestDto} from './PurchaseRequest.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class PurchaseOrderDto  extends BaseDto{

    public id: number;
    public refrence: string;
   public dateOrderSupplier: Date;
    public total: number;
    public description: string;
    public dateOrderSupplierMax: string ;
    public dateOrderSupplierMin: string ;
    public totalMax: string ;
    public totalMin: string ;
    public orderSupplierType: OrderSupplierTypeDto ;
    public criticality: CriticalityDto ;
    public supplier: SupplierDto ;
    public recipient: RecipientDto ;
    public purchaser: PurchaserDto ;
    public currency: CurrencyDto ;
    public purchaseOrderStatus: PurchaseOrderStatusDto ;
    public purchaseRequest: PurchaseRequestDto ;
     public purchaseOrderProducts: Array<PurchaseOrderProductDto>;

}
