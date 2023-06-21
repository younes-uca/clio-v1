import {PurchaseOrderDto} from './PurchaseOrder.model';
import {PurchaserDto} from './Purchaser.model';
import {PurchaseOrderDeliveryProductDto} from './PurchaseOrderDeliveryProduct.model';
import {OrderSupplierStatusDto} from './OrderSupplierStatus.model';
import {OrderSupplierDeliveryStatusDto} from './OrderSupplierDeliveryStatus.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class PurchaseOrderDeliveryDto  extends BaseDto{

    public id: number;
    public total: number;
    public description: string;
   public dateDelivery: Date;
   public invoiceAck: Date;
    public invoiceAckNumber: string;
    public invoicePrNumber: string;
   public invoiceDate: Date;
   public invoiceAckDelivery: Date;
    public descriptionInvoice: string;
    public invoiceNumber: string;
    public totalMax: string ;
    public totalMin: string ;
    public dateDeliveryMax: string ;
    public dateDeliveryMin: string ;
    public invoiceAckMax: string ;
    public invoiceAckMin: string ;
    public invoiceDateMax: string ;
    public invoiceDateMin: string ;
    public invoiceAckDeliveryMax: string ;
    public invoiceAckDeliveryMin: string ;
    public purchaseOrder: PurchaseOrderDto ;
    public orderSupplierStatus: OrderSupplierStatusDto ;
    public purchaser: PurchaserDto ;
    public orderSupplierDeliveryStatus: OrderSupplierDeliveryStatusDto ;
     public purchaseOrderDeliveryProducts: Array<PurchaseOrderDeliveryProductDto>;

}
