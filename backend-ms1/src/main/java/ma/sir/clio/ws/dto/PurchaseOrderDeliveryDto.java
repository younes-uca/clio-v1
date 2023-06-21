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
public class PurchaseOrderDeliveryDto  extends AuditBaseDto {

    private BigDecimal total  ;
    private String description  ;
    private String dateDelivery ;
    private String invoiceAck ;
    private String invoiceAckNumber  ;
    private String invoicePrNumber  ;
    private String invoiceDate ;
    private String invoiceAckDelivery ;
    private String descriptionInvoice  ;
    private String invoiceNumber  ;

    private PurchaseOrderDto purchaseOrder ;
    private OrderSupplierStatusDto orderSupplierStatus ;
    private PurchaserDto purchaser ;
    private OrderSupplierDeliveryStatusDto orderSupplierDeliveryStatus ;

    private List<PurchaseOrderDeliveryProductDto> purchaseOrderDeliveryProducts ;


    public PurchaseOrderDeliveryDto(){
        super();
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

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateDelivery(){
        return this.dateDelivery;
    }
    public void setDateDelivery(String dateDelivery){
        this.dateDelivery = dateDelivery;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getInvoiceAck(){
        return this.invoiceAck;
    }
    public void setInvoiceAck(String invoiceAck){
        this.invoiceAck = invoiceAck;
    }

    @Log
    public String getInvoiceAckNumber(){
        return this.invoiceAckNumber;
    }
    public void setInvoiceAckNumber(String invoiceAckNumber){
        this.invoiceAckNumber = invoiceAckNumber;
    }

    @Log
    public String getInvoicePrNumber(){
        return this.invoicePrNumber;
    }
    public void setInvoicePrNumber(String invoicePrNumber){
        this.invoicePrNumber = invoicePrNumber;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getInvoiceDate(){
        return this.invoiceDate;
    }
    public void setInvoiceDate(String invoiceDate){
        this.invoiceDate = invoiceDate;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getInvoiceAckDelivery(){
        return this.invoiceAckDelivery;
    }
    public void setInvoiceAckDelivery(String invoiceAckDelivery){
        this.invoiceAckDelivery = invoiceAckDelivery;
    }

    @Log
    public String getDescriptionInvoice(){
        return this.descriptionInvoice;
    }
    public void setDescriptionInvoice(String descriptionInvoice){
        this.descriptionInvoice = descriptionInvoice;
    }

    @Log
    public String getInvoiceNumber(){
        return this.invoiceNumber;
    }
    public void setInvoiceNumber(String invoiceNumber){
        this.invoiceNumber = invoiceNumber;
    }


    public PurchaseOrderDto getPurchaseOrder(){
        return this.purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrderDto purchaseOrder){
        this.purchaseOrder = purchaseOrder;
    }
    public OrderSupplierStatusDto getOrderSupplierStatus(){
        return this.orderSupplierStatus;
    }

    public void setOrderSupplierStatus(OrderSupplierStatusDto orderSupplierStatus){
        this.orderSupplierStatus = orderSupplierStatus;
    }
    public PurchaserDto getPurchaser(){
        return this.purchaser;
    }

    public void setPurchaser(PurchaserDto purchaser){
        this.purchaser = purchaser;
    }
    public OrderSupplierDeliveryStatusDto getOrderSupplierDeliveryStatus(){
        return this.orderSupplierDeliveryStatus;
    }

    public void setOrderSupplierDeliveryStatus(OrderSupplierDeliveryStatusDto orderSupplierDeliveryStatus){
        this.orderSupplierDeliveryStatus = orderSupplierDeliveryStatus;
    }



    public List<PurchaseOrderDeliveryProductDto> getPurchaseOrderDeliveryProducts(){
        return this.purchaseOrderDeliveryProducts;
    }

    public void setPurchaseOrderDeliveryProducts(List<PurchaseOrderDeliveryProductDto> purchaseOrderDeliveryProducts){
        this.purchaseOrderDeliveryProducts = purchaseOrderDeliveryProducts;
    }

}
