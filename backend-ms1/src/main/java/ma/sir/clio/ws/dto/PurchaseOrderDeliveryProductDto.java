package  ma.sir.clio.ws.dto;

import ma.sir.clio.zynerator.audit.Log;
import ma.sir.clio.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseOrderDeliveryProductDto  extends AuditBaseDto {

    private BigDecimal qantity  ;
    private String description  ;

    private ProductDto product ;
    private PurchaseOrderDeliveryDto purchaseOrderDelivery ;
    private StoreDto store ;



    public PurchaseOrderDeliveryProductDto(){
        super();
    }



    @Log
    public BigDecimal getQantity(){
        return this.qantity;
    }
    public void setQantity(BigDecimal qantity){
        this.qantity = qantity;
    }

    @Log
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }


    public ProductDto getProduct(){
        return this.product;
    }

    public void setProduct(ProductDto product){
        this.product = product;
    }
    public PurchaseOrderDeliveryDto getPurchaseOrderDelivery(){
        return this.purchaseOrderDelivery;
    }

    public void setPurchaseOrderDelivery(PurchaseOrderDeliveryDto purchaseOrderDelivery){
        this.purchaseOrderDelivery = purchaseOrderDelivery;
    }
    public StoreDto getStore(){
        return this.store;
    }

    public void setStore(StoreDto store){
        this.store = store;
    }




}
