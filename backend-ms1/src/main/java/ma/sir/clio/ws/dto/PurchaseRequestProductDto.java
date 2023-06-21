package  ma.sir.clio.ws.dto;

import ma.sir.clio.zynerator.audit.Log;
import ma.sir.clio.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseRequestProductDto  extends AuditBaseDto {

    private BigDecimal qantity  ;
    private BigDecimal qantityOrdred  ;
    private BigDecimal qantityDelivered  ;
    private BigDecimal price  ;
    private String description  ;

    private ProductDto product ;
    private PurchaseRequestDto purchaseRequest ;
    private UnitePriceDto unitePrice ;
    private PurchaseRequestProductStatusDto purchaseRequestProductStatus ;



    public PurchaseRequestProductDto(){
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
    public BigDecimal getQantityOrdred(){
        return this.qantityOrdred;
    }
    public void setQantityOrdred(BigDecimal qantityOrdred){
        this.qantityOrdred = qantityOrdred;
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
    public PurchaseRequestDto getPurchaseRequest(){
        return this.purchaseRequest;
    }

    public void setPurchaseRequest(PurchaseRequestDto purchaseRequest){
        this.purchaseRequest = purchaseRequest;
    }
    public UnitePriceDto getUnitePrice(){
        return this.unitePrice;
    }

    public void setUnitePrice(UnitePriceDto unitePrice){
        this.unitePrice = unitePrice;
    }
    public PurchaseRequestProductStatusDto getPurchaseRequestProductStatus(){
        return this.purchaseRequestProductStatus;
    }

    public void setPurchaseRequestProductStatus(PurchaseRequestProductStatusDto purchaseRequestProductStatus){
        this.purchaseRequestProductStatus = purchaseRequestProductStatus;
    }




}
