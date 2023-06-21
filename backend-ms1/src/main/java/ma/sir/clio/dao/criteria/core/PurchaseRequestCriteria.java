package  ma.sir.clio.dao.criteria.core;


import ma.sir.clio.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class PurchaseRequestCriteria extends  BaseCriteria  {

    private String refrence;
    private String refrenceLike;
    private String montantDevis;
    private String montantDevisMin;
    private String montantDevisMax;
    private LocalDateTime datePurchaseRequest;
    private LocalDateTime datePurchaseRequestFrom;
    private LocalDateTime datePurchaseRequestTo;
    private LocalDateTime dateLivraison;
    private LocalDateTime dateLivraisonFrom;
    private LocalDateTime dateLivraisonTo;
    private String montantAchat;
    private String montantAchatMin;
    private String montantAchatMax;

    private SupplierCriteria supplier ;
    private List<SupplierCriteria> suppliers ;
    private PurchaseRequestStatusCriteria purchaseRequestStatus ;
    private List<PurchaseRequestStatusCriteria> purchaseRequestStatuss ;


    public PurchaseRequestCriteria(){}

    public String getRefrence(){
        return this.refrence;
    }
    public void setRefrence(String refrence){
        this.refrence = refrence;
    }
    public String getRefrenceLike(){
        return this.refrenceLike;
    }
    public void setRefrenceLike(String refrenceLike){
        this.refrenceLike = refrenceLike;
    }

    public String getMontantDevis(){
        return this.montantDevis;
    }
    public void setMontantDevis(String montantDevis){
        this.montantDevis = montantDevis;
    }   
    public String getMontantDevisMin(){
        return this.montantDevisMin;
    }
    public void setMontantDevisMin(String montantDevisMin){
        this.montantDevisMin = montantDevisMin;
    }
    public String getMontantDevisMax(){
        return this.montantDevisMax;
    }
    public void setMontantDevisMax(String montantDevisMax){
        this.montantDevisMax = montantDevisMax;
    }
      
    public LocalDateTime getDatePurchaseRequest(){
        return this.datePurchaseRequest;
    }
    public void setDatePurchaseRequest(LocalDateTime datePurchaseRequest){
        this.datePurchaseRequest = datePurchaseRequest;
    }
    public LocalDateTime getDatePurchaseRequestFrom(){
        return this.datePurchaseRequestFrom;
    }
    public void setDatePurchaseRequestFrom(LocalDateTime datePurchaseRequestFrom){
        this.datePurchaseRequestFrom = datePurchaseRequestFrom;
    }
    public LocalDateTime getDatePurchaseRequestTo(){
        return this.datePurchaseRequestTo;
    }
    public void setDatePurchaseRequestTo(LocalDateTime datePurchaseRequestTo){
        this.datePurchaseRequestTo = datePurchaseRequestTo;
    }
    public LocalDateTime getDateLivraison(){
        return this.dateLivraison;
    }
    public void setDateLivraison(LocalDateTime dateLivraison){
        this.dateLivraison = dateLivraison;
    }
    public LocalDateTime getDateLivraisonFrom(){
        return this.dateLivraisonFrom;
    }
    public void setDateLivraisonFrom(LocalDateTime dateLivraisonFrom){
        this.dateLivraisonFrom = dateLivraisonFrom;
    }
    public LocalDateTime getDateLivraisonTo(){
        return this.dateLivraisonTo;
    }
    public void setDateLivraisonTo(LocalDateTime dateLivraisonTo){
        this.dateLivraisonTo = dateLivraisonTo;
    }
    public String getMontantAchat(){
        return this.montantAchat;
    }
    public void setMontantAchat(String montantAchat){
        this.montantAchat = montantAchat;
    }   
    public String getMontantAchatMin(){
        return this.montantAchatMin;
    }
    public void setMontantAchatMin(String montantAchatMin){
        this.montantAchatMin = montantAchatMin;
    }
    public String getMontantAchatMax(){
        return this.montantAchatMax;
    }
    public void setMontantAchatMax(String montantAchatMax){
        this.montantAchatMax = montantAchatMax;
    }
      

    public SupplierCriteria getSupplier(){
        return this.supplier;
    }

    public void setSupplier(SupplierCriteria supplier){
        this.supplier = supplier;
    }
    public List<SupplierCriteria> getSuppliers(){
        return this.suppliers;
    }

    public void setSuppliers(List<SupplierCriteria> suppliers){
        this.suppliers = suppliers;
    }
    public PurchaseRequestStatusCriteria getPurchaseRequestStatus(){
        return this.purchaseRequestStatus;
    }

    public void setPurchaseRequestStatus(PurchaseRequestStatusCriteria purchaseRequestStatus){
        this.purchaseRequestStatus = purchaseRequestStatus;
    }
    public List<PurchaseRequestStatusCriteria> getPurchaseRequestStatuss(){
        return this.purchaseRequestStatuss;
    }

    public void setPurchaseRequestStatuss(List<PurchaseRequestStatusCriteria> purchaseRequestStatuss){
        this.purchaseRequestStatuss = purchaseRequestStatuss;
    }
}
