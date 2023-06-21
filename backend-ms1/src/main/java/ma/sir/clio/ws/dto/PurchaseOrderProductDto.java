package  ma.sir.clio.ws.dto;

import ma.sir.clio.zynerator.audit.Log;
import ma.sir.clio.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseOrderProductDto  extends AuditBaseDto {

    private BigDecimal qantity  ;
    private BigDecimal qantityDelivered  ;
    private BigDecimal price  ;
    private String description  ;

    private ProductDto product ;
    private PurchaseOrderDto purchaseOrder ;
    private PurchaseOrderProductStatusDto purchaseOrderProductStatus ;
    private UnitePriceDto unitePrice ;



    public PurchaseOrderProductDto(){
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
    public BigDecimal getQantityDelivered(){
        return this.qantityDelivered;
    }
    public void setQantityDelivered(BigDecimal qantityDelivered){
        this.qantityDelivered = qantityDelivered;
    }

    @Log
    public BigDecimal getPrice(){
        return this.price;
    }
    public void setPrice(BigDecimal price){
        this.price = price;
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
    public PurchaseOrderDto getPurchaseOrder(){
        return this.purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrderDto purchaseOrder){
        this.purchaseOrder = purchaseOrder;
    }
    public PurchaseOrderProductStatusDto getPurchaseOrderProductStatus(){
        return this.purchaseOrderProductStatus;
    }

    public void setPurchaseOrderProductStatus(PurchaseOrderProductStatusDto purchaseOrderProductStatus){
        this.purchaseOrderProductStatus = purchaseOrderProductStatus;
    }
    public UnitePriceDto getUnitePrice(){
        return this.unitePrice;
    }

    public void setUnitePrice(UnitePriceDto unitePrice){
        this.unitePrice = unitePrice;
    }




}
