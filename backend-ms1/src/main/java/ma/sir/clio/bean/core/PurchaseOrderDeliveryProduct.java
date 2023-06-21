package ma.sir.clio.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.clio.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "purchase_order_delivery_product")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="purchase_order_delivery_product_seq",sequenceName="purchase_order_delivery_product_seq",allocationSize=1, initialValue = 1)
public class PurchaseOrderDeliveryProduct   extends AuditBusinessObject     {

    private Long id;

    private BigDecimal qantity = BigDecimal.ZERO;
    @Column(length = 500)
    private String description;

    private Product product ;
    
    private PurchaseOrderDelivery purchaseOrderDelivery ;
    
    private Store store ;
    


    public PurchaseOrderDeliveryProduct(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="purchase_order_delivery_product_seq")
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
    public PurchaseOrderDelivery getPurchaseOrderDelivery(){
        return this.purchaseOrderDelivery;
    }
    public void setPurchaseOrderDelivery(PurchaseOrderDelivery purchaseOrderDelivery){
        this.purchaseOrderDelivery = purchaseOrderDelivery;
    }
    public BigDecimal getQantity(){
        return this.qantity;
    }
    public void setQantity(BigDecimal qantity){
        this.qantity = qantity;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Store getStore(){
        return this.store;
    }
    public void setStore(Store store){
        this.store = store;
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
        PurchaseOrderDeliveryProduct purchaseOrderDeliveryProduct = (PurchaseOrderDeliveryProduct) o;
        return id != null && id.equals(purchaseOrderDeliveryProduct.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

