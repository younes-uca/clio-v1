package  ma.sir.clio.dao.criteria.core;


import ma.sir.clio.zynerator.criteria.BaseCriteria;
import java.util.List;

public class PurchaseRequestProductCriteria extends  BaseCriteria  {

    private String qantity;
    private String qantityMin;
    private String qantityMax;
    private String qantityOrdred;
    private String qantityOrdredMin;
    private String qantityOrdredMax;
    private String qantityDelivered;
    private String qantityDeliveredMin;
    private String qantityDeliveredMax;
    private String price;
    private String priceMin;
    private String priceMax;
    private String description;
    private String descriptionLike;

    private ProductCriteria product ;
    private List<ProductCriteria> products ;
    private PurchaseRequestCriteria purchaseRequest ;
    private List<PurchaseRequestCriteria> purchaseRequests ;
    private UnitePriceCriteria unitePrice ;
    private List<UnitePriceCriteria> unitePrices ;
    private PurchaseRequestProductStatusCriteria purchaseRequestProductStatus ;
    private List<PurchaseRequestProductStatusCriteria> purchaseRequestProductStatuss ;


    public PurchaseRequestProductCriteria(){}

    public String getQantity(){
        return this.qantity;
    }
    public void setQantity(String qantity){
        this.qantity = qantity;
    }   
    public String getQantityMin(){
        return this.qantityMin;
    }
    public void setQantityMin(String qantityMin){
        this.qantityMin = qantityMin;
    }
    public String getQantityMax(){
        return this.qantityMax;
    }
    public void setQantityMax(String qantityMax){
        this.qantityMax = qantityMax;
    }
      
    public String getQantityOrdred(){
        return this.qantityOrdred;
    }
    public void setQantityOrdred(String qantityOrdred){
        this.qantityOrdred = qantityOrdred;
    }   
    public String getQantityOrdredMin(){
        return this.qantityOrdredMin;
    }
    public void setQantityOrdredMin(String qantityOrdredMin){
        this.qantityOrdredMin = qantityOrdredMin;
    }
    public String getQantityOrdredMax(){
        return this.qantityOrdredMax;
    }
    public void setQantityOrdredMax(String qantityOrdredMax){
        this.qantityOrdredMax = qantityOrdredMax;
    }
      
    public String getQantityDelivered(){
        return this.qantityDelivered;
    }
    public void setQantityDelivered(String qantityDelivered){
        this.qantityDelivered = qantityDelivered;
    }   
    public String getQantityDeliveredMin(){
        return this.qantityDeliveredMin;
    }
    public void setQantityDeliveredMin(String qantityDeliveredMin){
        this.qantityDeliveredMin = qantityDeliveredMin;
    }
    public String getQantityDeliveredMax(){
        return this.qantityDeliveredMax;
    }
    public void setQantityDeliveredMax(String qantityDeliveredMax){
        this.qantityDeliveredMax = qantityDeliveredMax;
    }
      
    public String getPrice(){
        return this.price;
    }
    public void setPrice(String price){
        this.price = price;
    }   
    public String getPriceMin(){
        return this.priceMin;
    }
    public void setPriceMin(String priceMin){
        this.priceMin = priceMin;
    }
    public String getPriceMax(){
        return this.priceMax;
    }
    public void setPriceMax(String priceMax){
        this.priceMax = priceMax;
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


    public ProductCriteria getProduct(){
        return this.product;
    }

    public void setProduct(ProductCriteria product){
        this.product = product;
    }
    public List<ProductCriteria> getProducts(){
        return this.products;
    }

    public void setProducts(List<ProductCriteria> products){
        this.products = products;
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
    public UnitePriceCriteria getUnitePrice(){
        return this.unitePrice;
    }

    public void setUnitePrice(UnitePriceCriteria unitePrice){
        this.unitePrice = unitePrice;
    }
    public List<UnitePriceCriteria> getUnitePrices(){
        return this.unitePrices;
    }

    public void setUnitePrices(List<UnitePriceCriteria> unitePrices){
        this.unitePrices = unitePrices;
    }
    public PurchaseRequestProductStatusCriteria getPurchaseRequestProductStatus(){
        return this.purchaseRequestProductStatus;
    }

    public void setPurchaseRequestProductStatus(PurchaseRequestProductStatusCriteria purchaseRequestProductStatus){
        this.purchaseRequestProductStatus = purchaseRequestProductStatus;
    }
    public List<PurchaseRequestProductStatusCriteria> getPurchaseRequestProductStatuss(){
        return this.purchaseRequestProductStatuss;
    }

    public void setPurchaseRequestProductStatuss(List<PurchaseRequestProductStatusCriteria> purchaseRequestProductStatuss){
        this.purchaseRequestProductStatuss = purchaseRequestProductStatuss;
    }
}
