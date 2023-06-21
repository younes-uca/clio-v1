package  ma.sir.clio.dao.criteria.core;


import ma.sir.clio.zynerator.criteria.BaseCriteria;
import java.util.List;

public class PurchaseOrderDeliveryProductCriteria extends  BaseCriteria  {

    private String qantity;
    private String qantityMin;
    private String qantityMax;
    private String description;
    private String descriptionLike;

    private ProductCriteria product ;
    private List<ProductCriteria> products ;
    private PurchaseOrderDeliveryCriteria purchaseOrderDelivery ;
    private List<PurchaseOrderDeliveryCriteria> purchaseOrderDeliverys ;
    private StoreCriteria store ;
    private List<StoreCriteria> stores ;


    public PurchaseOrderDeliveryProductCriteria(){}

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
    public PurchaseOrderDeliveryCriteria getPurchaseOrderDelivery(){
        return this.purchaseOrderDelivery;
    }

    public void setPurchaseOrderDelivery(PurchaseOrderDeliveryCriteria purchaseOrderDelivery){
        this.purchaseOrderDelivery = purchaseOrderDelivery;
    }
    public List<PurchaseOrderDeliveryCriteria> getPurchaseOrderDeliverys(){
        return this.purchaseOrderDeliverys;
    }

    public void setPurchaseOrderDeliverys(List<PurchaseOrderDeliveryCriteria> purchaseOrderDeliverys){
        this.purchaseOrderDeliverys = purchaseOrderDeliverys;
    }
    public StoreCriteria getStore(){
        return this.store;
    }

    public void setStore(StoreCriteria store){
        this.store = store;
    }
    public List<StoreCriteria> getStores(){
        return this.stores;
    }

    public void setStores(List<StoreCriteria> stores){
        this.stores = stores;
    }
}
