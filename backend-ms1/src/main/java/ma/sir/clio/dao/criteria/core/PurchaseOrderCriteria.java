package  ma.sir.clio.dao.criteria.core;


import ma.sir.clio.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class PurchaseOrderCriteria extends  BaseCriteria  {

    private String refrence;
    private String refrenceLike;
    private LocalDateTime dateOrderSupplier;
    private LocalDateTime dateOrderSupplierFrom;
    private LocalDateTime dateOrderSupplierTo;
    private String total;
    private String totalMin;
    private String totalMax;
    private String description;
    private String descriptionLike;

    private OrderSupplierTypeCriteria orderSupplierType ;
    private List<OrderSupplierTypeCriteria> orderSupplierTypes ;
    private CriticalityCriteria criticality ;
    private List<CriticalityCriteria> criticalitys ;
    private SupplierCriteria supplier ;
    private List<SupplierCriteria> suppliers ;
    private RecipientCriteria recipient ;
    private List<RecipientCriteria> recipients ;
    private PurchaserCriteria purchaser ;
    private List<PurchaserCriteria> purchasers ;
    private CurrencyCriteria currency ;
    private List<CurrencyCriteria> currencys ;
    private PurchaseOrderStatusCriteria purchaseOrderStatus ;
    private List<PurchaseOrderStatusCriteria> purchaseOrderStatuss ;
    private PurchaseRequestCriteria purchaseRequest ;
    private List<PurchaseRequestCriteria> purchaseRequests ;


    public PurchaseOrderCriteria(){}

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

    public LocalDateTime getDateOrderSupplier(){
        return this.dateOrderSupplier;
    }
    public void setDateOrderSupplier(LocalDateTime dateOrderSupplier){
        this.dateOrderSupplier = dateOrderSupplier;
    }
    public LocalDateTime getDateOrderSupplierFrom(){
        return this.dateOrderSupplierFrom;
    }
    public void setDateOrderSupplierFrom(LocalDateTime dateOrderSupplierFrom){
        this.dateOrderSupplierFrom = dateOrderSupplierFrom;
    }
    public LocalDateTime getDateOrderSupplierTo(){
        return this.dateOrderSupplierTo;
    }
    public void setDateOrderSupplierTo(LocalDateTime dateOrderSupplierTo){
        this.dateOrderSupplierTo = dateOrderSupplierTo;
    }
    public String getTotal(){
        return this.total;
    }
    public void setTotal(String total){
        this.total = total;
    }   
    public String getTotalMin(){
        return this.totalMin;
    }
    public void setTotalMin(String totalMin){
        this.totalMin = totalMin;
    }
    public String getTotalMax(){
        return this.totalMax;
    }
    public void setTotalMax(String totalMax){
        this.totalMax = totalMax;
    }
      
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescriptionLike(){
        return this.descriptionLike;
    }
    public void setDescriptionLike(String descriptionLike){
        this.descriptionLike = descriptionLike;
    }


    public OrderSupplierTypeCriteria getOrderSupplierType(){
        return this.orderSupplierType;
    }

    public void setOrderSupplierType(OrderSupplierTypeCriteria orderSupplierType){
        this.orderSupplierType = orderSupplierType;
    }
    public List<OrderSupplierTypeCriteria> getOrderSupplierTypes(){
        return this.orderSupplierTypes;
    }

    public void setOrderSupplierTypes(List<OrderSupplierTypeCriteria> orderSupplierTypes){
        this.orderSupplierTypes = orderSupplierTypes;
    }
    public CriticalityCriteria getCriticality(){
        return this.criticality;
    }

    public void setCriticality(CriticalityCriteria criticality){
        this.criticality = criticality;
    }
    public List<CriticalityCriteria> getCriticalitys(){
        return this.criticalitys;
    }

    public void setCriticalitys(List<CriticalityCriteria> criticalitys){
        this.criticalitys = criticalitys;
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
    public RecipientCriteria getRecipient(){
        return this.recipient;
    }

    public void setRecipient(RecipientCriteria recipient){
        this.recipient = recipient;
    }
    public List<RecipientCriteria> getRecipients(){
        return this.recipients;
    }

    public void setRecipients(List<RecipientCriteria> recipients){
        this.recipients = recipients;
    }
    public PurchaserCriteria getPurchaser(){
        return this.purchaser;
    }

    public void setPurchaser(PurchaserCriteria purchaser){
        this.purchaser = purchaser;
    }
    public List<PurchaserCriteria> getPurchasers(){
        return this.purchasers;
    }

    public void setPurchasers(List<PurchaserCriteria> purchasers){
        this.purchasers = purchasers;
    }
    public CurrencyCriteria getCurrency(){
        return this.currency;
    }

    public void setCurrency(CurrencyCriteria currency){
        this.currency = currency;
    }
    public List<CurrencyCriteria> getCurrencys(){
        return this.currencys;
    }

    public void setCurrencys(List<CurrencyCriteria> currencys){
        this.currencys = currencys;
    }
    public PurchaseOrderStatusCriteria getPurchaseOrderStatus(){
        return this.purchaseOrderStatus;
    }

    public void setPurchaseOrderStatus(PurchaseOrderStatusCriteria purchaseOrderStatus){
        this.purchaseOrderStatus = purchaseOrderStatus;
    }
    public List<PurchaseOrderStatusCriteria> getPurchaseOrderStatuss(){
        return this.purchaseOrderStatuss;
    }

    public void setPurchaseOrderStatuss(List<PurchaseOrderStatusCriteria> purchaseOrderStatuss){
        this.purchaseOrderStatuss = purchaseOrderStatuss;
    }
    public PurchaseRequestCriteria getPurchaseRequest(){
        return this.purchaseRequest;
    }

    public void setPurchaseRequest(PurchaseRequestCriteria purchaseRequest){
        this.purchaseRequest = purchaseRequest;
    }
    public List<PurchaseRequestCriteria> getPurchaseRequests(){
        return this.purchaseRequests;
    }

    public void setPurchaseRequests(List<PurchaseRequestCriteria> purchaseRequests){
        this.purchaseRequests = purchaseRequests;
    }
}
