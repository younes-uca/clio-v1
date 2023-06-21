import {PurchaseRequestProductDto} from './PurchaseRequestProduct.model';
import {PurchaseRequestStatusDto} from './PurchaseRequestStatus.model';
import {SupplierDto} from './Supplier.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class PurchaseRequestDto  extends BaseDto{

    public id: number;
    public refrence: string;
    public montantDevis: number;
   public datePurchaseRequest: Date;
   public dateLivraison: Date;
    public montantAchat: number;
    public montantDevisMax: string ;
    public montantDevisMin: string ;
    public datePurchaseRequestMax: string ;
    public datePurchaseRequestMin: string ;
    public dateLivraisonMax: string ;
    public dateLivraisonMin: string ;
    public montantAchatMax: string ;
    public montantAchatMin: string ;
    public supplier: SupplierDto ;
    public purchaseRequestStatus: PurchaseRequestStatusDto ;
     public purchaseRequestProducts: Array<PurchaseRequestProductDto>;

}
