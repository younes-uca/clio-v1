package  ma.sir.clio.dao.criteria.core;


import ma.sir.clio.zynerator.criteria.BaseCriteria;
import java.util.List;

public class ProductCriteria extends  BaseCriteria  {

    private String partNumber;
    private String partNumberLike;

    private ProductFamilyCriteria productFamily ;
    private List<ProductFamilyCriteria> productFamilys ;


    public ProductCriteria(){}

    public String getPartNumber(){
        return this.partNumber;
    }
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }
    public String getPartNumberLike(){
        return this.partNumberLike;
    }
    public void setPartNumberLike(String partNumberLike){
        this.partNumberLike = partNumberLike;
    }


    public ProductFamilyCriteria getProductFamily(){
        return this.productFamily;
    }

    public void setProductFamily(ProductFamilyCriteria productFamily){
        this.productFamily = productFamily;
    }
    public List<ProductFamilyCriteria> getProductFamilys(){
        return this.productFamilys;
    }

    public void setProductFamilys(List<ProductFamilyCriteria> productFamilys){
        this.productFamilys = productFamilys;
    }
}
