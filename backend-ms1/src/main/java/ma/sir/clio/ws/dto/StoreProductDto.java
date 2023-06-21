package  ma.sir.clio.ws.dto;

import ma.sir.clio.zynerator.audit.Log;
import ma.sir.clio.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class StoreProductDto  extends AuditBaseDto {

    private BigDecimal qantity  ;

    private StoreDto store ;
    private ProductDto product ;



    public StoreProductDto(){
        super();
    }



    @Log
    public BigDecimal getQantity(){
        return this.qantity;
    }
    public void setQantity(BigDecimal qantity){
        this.qantity = qantity;
    }


    public StoreDto getStore(){
        return this.store;
    }

    public void setStore(StoreDto store){
        this.store = store;
    }
    public ProductDto getProduct(){
        return this.product;
    }

    public void setProduct(ProductDto product){
        this.product = product;
    }




}
