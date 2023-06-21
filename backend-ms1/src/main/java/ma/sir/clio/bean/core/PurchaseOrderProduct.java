package ma.sir.clio.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.clio.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "purchase_order_product")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="purchase_order_product_seq",sequenceName="purchase_order_product_seq",allocationSize=1, initialValue = 1)
public class PurchaseOrderProduct   extends AuditBusinessObject     {

    private Long id;

    private BigDecimal qantity = BigDecimal.ZERO;
    private BigDecimal qantityDelivered = BigDecimal.ZERO;
    private BigDecimal price = BigDecimal.ZERO;
    @Column(length = 500)
    private String description;

    private Product product ;
    
    private PurchaseOrder purchaseOrder ;
    
    private PurchaseOrderProductStatus purchaseOrderProductStatus ;
    
    private UnitePrice unitePrice ;
    


    public PurchaseOrderProduct(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="purchase_order_product_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Product getProduct(){
        return this.product;
    }
    public void setProduct(Product product){
        this.product = product;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public PurchaseOrder getPurchaseOrder(){
        return this.purchaseOrder;
    }
    public void setPurchaseOrder(PurchaseOrder purchaseOrder){
        this.purchaseOrder = purchaseOrder;
    }
    public BigDecimal getQantity(){
        return this.qantity;
    }
    public void setQantity(BigDecimal qantity){
        this.qantity = qantity;
    }
    public BigDecimal getQantityDelivered(){
        return this.qantityDelivered;
    }
    public void setQantityDelivered(BigDecimal qantityDelivered){
        this.qantityDelivered = qantityDelivered;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public PurchaseOrderProductStatus getPurchaseOrderProductStatus(){
        return this.purchaseOrderProductStatus;
    }
    public void setPurchaseOrderProductStatus(PurchaseOrderProductStatus purchaseOrderProductStatus){
        this.purchaseOrderProductStatus = purchaseOrderProductStatus;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public UnitePrice getUnitePrice(){
        return this.unitePrice;
    }
    public void setUnitePrice(UnitePrice unitePrice){
        this.unitePrice = unitePrice;
    }
    public BigDecimal getPrice(){
        return this.price;
    }
    public void setPrice(BigDecimal price){
        this.price = price;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseOrderProduct purchaseOrderProduct = (PurchaseOrderProduct) o;
        return id != null && id.equals(purchaseOrderProduct.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

