package  ma.sir.clio.dao.criteria.core;


import ma.sir.clio.zynerator.criteria.BaseCriteria;
import java.util.List;

public class StoreProductCriteria extends  BaseCriteria  {

    private String qantity;
    private String qantityMin;
    private String qantityMax;

    private StoreCriteria store ;
    private List<StoreCriteria> stores ;
    private ProductCriteria product ;
    private List<ProductCriteria> products ;


    public StoreProductCriteria(){}

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
}
