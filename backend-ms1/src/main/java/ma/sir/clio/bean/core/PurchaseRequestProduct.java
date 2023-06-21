package ma.sir.clio.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.clio.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "purchase_request_product")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="purchase_request_product_seq",sequenceName="purchase_request_product_seq",allocationSize=1, initialValue = 1)
public class PurchaseRequestProduct   extends AuditBusinessObject     {

    private Long id;

    private BigDecimal qantity = BigDecimal.ZERO;
    private BigDecimal qantityOrdred = BigDecimal.ZERO;
    private BigDecimal qantityDelivered = BigDecimal.ZERO;
    private BigDecimal price = BigDecimal.ZERO;
    @Column(length = 500)
    private String description;

    private Product product ;
    
    private PurchaseRequest purchaseRequest ;
    
    private UnitePrice unitePrice ;
    
    private PurchaseRequestProductStatus purchaseRequestProductStatus ;
    


    public PurchaseRequestProduct(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="purchase_request_product_seq")
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
    public PurchaseRequest getPurchaseRequest(){
        return this.purchaseRequest;
    }
    public void setPurchaseRequest(PurchaseRequest purchaseRequest){
        this.purchaseRequest = purchaseRequest;
    }
    public BigDecimal getQantity(){
        return this.qantity;
    }
    public void setQantity(BigDecimal qantity){
        this.qantity = qantity;
    }
    public BigDecimal getQantityOrdred(){
        return this.qantityOrdred;
    }
    public void setQantityOrdred(BigDecimal qantityOrdred){
        this.qantityOrdred = qantityOrdred;
    }
    public BigDecimal getQantityDelivered(){
        return this.qantityDelivered;
    }
    public void setQantityDelivered(BigDecimal qantityDelivered){
        this.qantityDelivered = qantityDelivered;
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
    @ManyToOne(fetch = FetchType.LAZY)
    public PurchaseRequestProductStatus getPurchaseRequestProductStatus(){
        return this.purchaseRequestProductStatus;
    }
    public void setPurchaseRequestProductStatus(PurchaseRequestProductStatus purchaseRequestProductStatus){
        this.purchaseRequestProductStatus = purchaseRequestProductStatus;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseRequestProduct purchaseRequestProduct = (PurchaseRequestProduct) o;
        return id != null && id.equals(purchaseRequestProduct.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

