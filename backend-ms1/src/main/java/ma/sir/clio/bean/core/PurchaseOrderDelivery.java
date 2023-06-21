package ma.sir.clio.bean.core;

import java.util.Objects;
import java.util.List;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.clio.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "purchase_order_delivery")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="purchase_order_delivery_seq",sequenceName="purchase_order_delivery_seq",allocationSize=1, initialValue = 1)
public class PurchaseOrderDelivery   extends AuditBusinessObject     {

    private Long id;

    private BigDecimal total = BigDecimal.ZERO;
    @Column(length = 500)
    private String description;
    private LocalDateTime dateDelivery ;
    private LocalDateTime invoiceAck ;
    @Column(length = 500)
    private String invoiceAckNumber;
    @Column(length = 500)
    private String invoicePrNumber;
    private LocalDateTime invoiceDate ;
    private LocalDateTime invoiceAckDelivery ;
    @Column(length = 500)
    private String descriptionInvoice;
    @Column(length = 500)
    private String invoiceNumber;

    private PurchaseOrder purchaseOrder ;
    
    private OrderSupplierStatus orderSupplierStatus ;
    
    private Purchaser purchaser ;
    
    private OrderSupplierDeliveryStatus orderSupplierDeliveryStatus ;
    

    private List<PurchaseOrderDeliveryProduct> purchaseOrderDeliveryProducts ;

    public PurchaseOrderDelivery(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="purchase_order_delivery_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public PurchaseOrder getPurchaseOrder(){
        return this.purchaseOrder;
    }
    public void setPurchaseOrder(PurchaseOrder purchaseOrder){
        this.purchaseOrder = purchaseOrder;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public OrderSupplierStatus getOrderSupplierStatus(){
        return this.orderSupplierStatus;
    }
    public void setOrderSupplierStatus(OrderSupplierStatus orderSupplierStatus){
        this.orderSupplierStatus = orderSupplierStatus;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Purchaser getPurchaser(){
        return this.purchaser;
    }
    public void setPurchaser(Purchaser purchaser){
        this.purchaser = purchaser;
    }
    public BigDecimal getTotal(){
        return this.total;
    }
    public void setTotal(BigDecimal total){
        this.total = total;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public LocalDateTime getDateDelivery(){
        return this.dateDelivery;
    }
    public void setDateDelivery(LocalDateTime dateDelivery){
        this.dateDelivery = dateDelivery;
    }
    public LocalDateTime getInvoiceAck(){
        return this.invoiceAck;
    }
    public void setInvoiceAck(LocalDateTime invoiceAck){
        this.invoiceAck = invoiceAck;
    }
    public String getInvoiceAckNumber(){
        return this.invoiceAckNumber;
    }
    public void setInvoiceAckNumber(String invoiceAckNumber){
        this.invoiceAckNumber = invoiceAckNumber;
    }
    public String getInvoicePrNumber(){
        return this.invoicePrNumber;
    }
    public void setInvoicePrNumber(String invoicePrNumber){
        this.invoicePrNumber = invoicePrNumber;
    }
    public LocalDateTime getInvoiceDate(){
        return this.invoiceDate;
    }
    public void setInvoiceDate(LocalDateTime invoiceDate){
        this.invoiceDate = invoiceDate;
    }
    public LocalDateTime getInvoiceAckDelivery(){
        return this.invoiceAckDelivery;
    }
    public void setInvoiceAckDelivery(LocalDateTime invoiceAckDelivery){
        this.invoiceAckDelivery = invoiceAckDelivery;
    }
    public String getDescriptionInvoice(){
        return this.descriptionInvoice;
    }
    public void setDescriptionInvoice(String descriptionInvoice){
        this.descriptionInvoice = descriptionInvoice;
    }
    public String getInvoiceNumber(){
        return this.invoiceNumber;
    }
    public void setInvoiceNumber(String invoiceNumber){
        this.invoiceNumber = invoiceNumber;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public OrderSupplierDeliveryStatus getOrderSupplierDeliveryStatus(){
        return this.orderSupplierDeliveryStatus;
    }
    public void setOrderSupplierDeliveryStatus(OrderSupplierDeliveryStatus orderSupplierDeliveryStatus){
        this.orderSupplierDeliveryStatus = orderSupplierDeliveryStatus;
    }
    @OneToMany(mappedBy = "purchaseOrderDelivery")
    public List<PurchaseOrderDeliveryProduct> getPurchaseOrderDeliveryProducts(){
        return this.purchaseOrderDeliveryProducts;
    }
    public void setPurchaseOrderDeliveryProducts(List<PurchaseOrderDeliveryProduct> purchaseOrderDeliveryProducts){
        this.purchaseOrderDeliveryProducts = purchaseOrderDeliveryProducts;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseOrderDelivery purchaseOrderDelivery = (PurchaseOrderDelivery) o;
        return id != null && id.equals(purchaseOrderDelivery.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

