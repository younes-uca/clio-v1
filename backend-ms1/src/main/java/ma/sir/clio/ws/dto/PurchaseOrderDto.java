package  ma.sir.clio.ws.dto;

import ma.sir.clio.zynerator.audit.Log;
import ma.sir.clio.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseOrderDto  extends AuditBaseDto {

    private String refrence  ;
    private String dateOrderSupplier ;
    private BigDecimal total  ;
    private String description  ;

    private OrderSupplierTypeDto orderSupplierType ;
    private CriticalityDto criticality ;
    private SupplierDto supplier ;
    private RecipientDto recipient ;
    private PurchaserDto purchaser ;
    private CurrencyDto currency ;
    private PurchaseOrderStatusDto purchaseOrderStatus ;
    private PurchaseRequestDto purchaseRequest ;

    private List<PurchaseOrderProductDto> PurchaseOrderProducts ;


    public PurchaseOrderDto(){
        super();
    }



    @Log
    public String getRefrence(){
        return this.refrence;
    }
    public void setRefrence(String refrence){
        this.refrence = refrence;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateOrderSupplier(){
        return this.dateOrderSupplier;
    }
    public void setDateOrderSupplier(String dateOrderSupplier){
        this.dateOrderSupplier = dateOrderSupplier;
    }

    @Log
    public BigDecimal getTotal(){
        return this.total;
    }
    public void setTotal(BigDecimal total){
        this.total = total;
    }

    @Log
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }


    public OrderSupplierTypeDto getOrderSupplierType(){
        return this.orderSupplierType;
    }

    public void setOrderSupplierType(OrderSupplierTypeDto orderSupplierType){
        this.orderSupplierType = orderSupplierType;
    }
    public CriticalityDto getCriticality(){
        return this.criticality;
    }

    public void setCriticality(CriticalityDto criticality){
        this.criticality = criticality;
    }
    public SupplierDto getSupplier(){
        return this.supplier;
    }

    public void setSupplier(SupplierDto supplier){
        this.supplier = supplier;
    }
    public RecipientDto getRecipient(){
        return this.recipient;
    }

    public void setRecipient(RecipientDto recipient){
        this.recipient = recipient;
    }
    public PurchaserDto getPurchaser(){
        return this.purchaser;
    }

    public void setPurchaser(PurchaserDto purchaser){
        this.purchaser = purchaser;
    }
    public CurrencyDto getCurrency(){
        return this.currency;
    }

    public void setCurrency(CurrencyDto currency){
        this.currency = currency;
    }
    public PurchaseOrderStatusDto getPurchaseOrderStatus(){
        return this.purchaseOrderStatus;
    }

    public void setPurchaseOrderStatus(PurchaseOrderStatusDto purchaseOrderStatus){
        this.purchaseOrderStatus = purchaseOrderStatus;
    }
    public PurchaseRequestDto getPurchaseRequest(){
        return this.purchaseRequest;
    }

    public void setPurchaseRequest(PurchaseRequestDto purchaseRequest){
        this.purchaseRequest = purchaseRequest;
    }



    public List<PurchaseOrderProductDto> getPurchaseOrderProducts(){
        return this.PurchaseOrderProducts;
    }

    public void setPurchaseOrderProducts(List<PurchaseOrderProductDto> PurchaseOrderProducts){
        this.PurchaseOrderProducts = PurchaseOrderProducts;
    }

}
