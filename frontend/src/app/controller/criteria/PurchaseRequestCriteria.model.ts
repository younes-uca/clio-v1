import {PurchaseRequestProductCriteria} from './PurchaseRequestProductCriteria.model';
import {PurchaseRequestStatusCriteria} from './PurchaseRequestStatusCriteria.model';
import {SupplierCriteria} from './SupplierCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class PurchaseRequestCriteria  extends   BaseCriteria  {

    public id: number;
    public refrence: string;
    public refrenceLike: string;
     public montantDevis: number;
     public montantDevisMin: number;
     public montantDevisMax: number;
    public datePurchaseRequest: Date;
    public datePurchaseRequestFrom: Date;
    public datePurchaseRequestTo: Date;
    public dateLivraison: Date;
    public dateLivraisonFrom: Date;
    public dateLivraisonTo: Date;
     public montantAchat: number;
     public montantAchatMin: number;
     public montantAchatMax: number;
  public supplier: SupplierCriteria ;
  public suppliers: Array<SupplierCriteria> ;
  public purchaseRequestStatus: PurchaseRequestStatusCriteria ;
  public purchaseRequestStatuss: Array<PurchaseRequestStatusCriteria> ;
      public purchaseRequestProducts: Array<PurchaseRequestProductCriteria>;

}
