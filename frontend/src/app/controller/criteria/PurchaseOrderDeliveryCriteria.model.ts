import {PurchaseOrderCriteria} from './PurchaseOrderCriteria.model';
import {PurchaserCriteria} from './PurchaserCriteria.model';
import {PurchaseOrderDeliveryProductCriteria} from './PurchaseOrderDeliveryProductCriteria.model';
import {OrderSupplierStatusCriteria} from './OrderSupplierStatusCriteria.model';
import {OrderSupplierDeliveryStatusCriteria} from './OrderSupplierDeliveryStatusCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class PurchaseOrderDeliveryCriteria  extends   BaseCriteria  {

    public id: number;
     public total: number;
     public totalMin: number;
     public totalMax: number;
    public description: string;
    public descriptionLike: string;
    public dateDelivery: Date;
    public dateDeliveryFrom: Date;
    public dateDeliveryTo: Date;
    public invoiceAck: Date;
    public invoiceAckFrom: Date;
    public invoiceAckTo: Date;
    public invoiceAckNumber: string;
    public invoiceAckNumberLike: string;
    public invoicePrNumber: string;
    public invoicePrNumberLike: string;
    public invoiceDate: Date;
    public invoiceDateFrom: Date;
    public invoiceDateTo: Date;
    public invoiceAckDelivery: Date;
    public invoiceAckDeliveryFrom: Date;
    public invoiceAckDeliveryTo: Date;
    public descriptionInvoice: string;
    public descriptionInvoiceLike: string;
    public invoiceNumber: string;
    public invoiceNumberLike: string;
  public purchaseOrder: PurchaseOrderCriteria ;
  public purchaseOrders: Array<PurchaseOrderCriteria> ;
  public orderSupplierStatus: OrderSupplierStatusCriteria ;
  public orderSupplierStatuss: Array<OrderSupplierStatusCriteria> ;
  public purchaser: PurchaserCriteria ;
  public purchasers: Array<PurchaserCriteria> ;
  public orderSupplierDeliveryStatus: OrderSupplierDeliveryStatusCriteria ;
  public orderSupplierDeliveryStatuss: Array<OrderSupplierDeliveryStatusCriteria> ;
      public purchaseOrderDeliveryProducts: Array<PurchaseOrderDeliveryProductCriteria>;

}
