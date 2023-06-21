package ma.sir.clio.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.clio.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "store_product")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="store_product_seq",sequenceName="store_product_seq",allocationSize=1, initialValue = 1)
public class StoreProduct   extends AuditBusinessObject     {

    private Long id;

    private BigDecimal qantity = BigDecimal.ZERO;

    private Store store ;
    
    private Product product ;
    


    public StoreProduct(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="store_product_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Store getStore(){
        return this.store;
    }
    public void setStore(Store store){
        this.store = store;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Product getProduct(){
        return this.product;
    }
    public void setProduct(Product product){
        this.product = product;
    }
    public BigDecimal getQantity(){
        return this.qantity;
    }
    public void setQantity(BigDecimal qantity){
        this.qantity = qantity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoreProduct storeProduct = (StoreProduct) o;
        return id != null && id.equals(storeProduct.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

