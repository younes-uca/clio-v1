package  ma.sir.clio.dao.criteria.core;


import ma.sir.clio.zynerator.criteria.BaseCriteria;
import java.util.List;

public class PurchaseOrderProductCriteria extends  BaseCriteria  {

    private String qantity;
    private String qantityMin;
    private String qantityMax;
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
    private PurchaseOrderCriteria purchaseOrder ;
    private List<PurchaseOrderCriteria> purchaseOrders ;
    private PurchaseOrderProductStatusCriteria purchaseOrderProductStatus ;
    private List<PurchaseOrderProductStatusCriteria> purchaseOrderProductStatuss ;
    private UnitePriceCriteria unitePrice ;
    private List<UnitePriceCriteria> unitePrices ;


    public PurchaseOrderProductCriteria(){}

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
    public PurchaseOrderCriteria getPurchaseOrder(){
        return this.purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrderCriteria purchaseOrder){
        this.purchaseOrder = purchaseOrder;
    }
    public List<PurchaseOrderCriteria> getPurchaseOrders(){
        return this.purchaseOrders;
    }

    public void setPurchaseOrders(List<PurchaseOrderCriteria> purchaseOrders){
        this.purchaseOrders = purchaseOrders;
    }
    public PurchaseOrderProductStatusCriteria getPurchaseOrderProductStatus(){
        return this.purchaseOrderProductStatus;
    }

    public void setPurchaseOrderProductStatus(PurchaseOrderProductStatusCriteria purchaseOrderProductStatus){
        this.purchaseOrderProductStatus = purchaseOrderProductStatus;
    }
    public List<PurchaseOrderProductStatusCriteria> getPurchaseOrderProductStatuss(){
        return this.purchaseOrderProductStatuss;
    }

    public void setPurchaseOrderProductStatuss(List<PurchaseOrderProductStatusCriteria> purchaseOrderProductStatuss){
        this.purchaseOrderProductStatuss = purchaseOrderProductStatuss;
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
}
