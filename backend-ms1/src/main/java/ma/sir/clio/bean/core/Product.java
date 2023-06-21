package ma.sir.clio.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.clio.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "product")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="product_seq",sequenceName="product_seq",allocationSize=1, initialValue = 1)
public class Product   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String partNumber;

    private ProductFamily productFamily ;
    


    public Product(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="product_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getPartNumber(){
        return this.partNumber;
    }
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public ProductFamily getProductFamily(){
        return this.productFamily;
    }
    public void setProductFamily(ProductFamily productFamily){
        this.productFamily = productFamily;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id != null && id.equals(product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

