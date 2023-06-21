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
@Table(name = "purchase_order")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="purchase_order_seq",sequenceName="purchase_order_seq",allocationSize=1, initialValue = 1)
public class PurchaseOrder   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String refrence;
    private LocalDateTime dateOrderSupplier ;
    private BigDecimal total = BigDecimal.ZERO;
    @Column(length = 500)
    private String description;

    private OrderSupplierType orderSupplierType ;
    
    private Criticality criticality ;
    
    private Supplier supplier ;
    
    private Recipient recipient ;
    
    private Purchaser purchaser ;
    
    private Currency currency ;
    
    private PurchaseOrderStatus purchaseOrderStatus ;
    
    private PurchaseRequest purchaseRequest ;
    

    private List<PurchaseOrderProduct> PurchaseOrderProducts ;

    public PurchaseOrder(){
        super();
    }

    public PurchaseOrder(Long id,String refrence){
        this.id = id;
        this.refrence = refrence ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="purchase_order_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getRefrence(){
        return this.refrence;
    }
    public void setRefrence(String refrence){
        this.refrence = refrence;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public OrderSupplierType getOrderSupplierType(){
        return this.orderSupplierType;
    }
    public void setOrderSupplierType(OrderSupplierType orderSupplierType){
        this.orderSupplierType = orderSupplierType;
    }
    public LocalDateTime getDateOrderSupplier(){
        return this.dateOrderSupplier;
    }
    public void setDateOrderSupplier(LocalDateTime dateOrderSupplier){
        this.dateOrderSupplier = dateOrderSupplier;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Criticality getCriticality(){
        return this.criticality;
    }
    public void setCriticality(Criticality criticality){
        this.criticality = criticality;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Supplier getSupplier(){
        return this.supplier;
    }
    public void setSupplier(Supplier supplier){
        this.supplier = supplier;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Recipient getRecipient(){
        return this.recipient;
    }
    public void setRecipient(Recipient recipient){
        this.recipient = recipient;
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
    @ManyToOne(fetch = FetchType.LAZY)
    public Currency getCurrency(){
        return this.currency;
    }
    public void setCurrency(Currency currency){
        this.currency = currency;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public PurchaseOrderStatus getPurchaseOrderStatus(){
        return this.purchaseOrderStatus;
    }
    public void setPurchaseOrderStatus(PurchaseOrderStatus purchaseOrderStatus){
        this.purchaseOrderStatus = purchaseOrderStatus;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public PurchaseRequest getPurchaseRequest(){
        return this.purchaseRequest;
    }
    public void setPurchaseRequest(PurchaseRequest purchaseRequest){
        this.purchaseRequest = purchaseRequest;
    }
    @OneToMany(mappedBy = "purchaseOrder")
    public List<PurchaseOrderProduct> getPurchaseOrderProducts(){
        return this.PurchaseOrderProducts;
    }
    public void setPurchaseOrderProducts(List<PurchaseOrderProduct> PurchaseOrderProducts){
        this.PurchaseOrderProducts = PurchaseOrderProducts;
    }

    @Transient
    public String getLabel() {
        label = refrence;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseOrder purchaseOrder = (PurchaseOrder) o;
        return id != null && id.equals(purchaseOrder.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

