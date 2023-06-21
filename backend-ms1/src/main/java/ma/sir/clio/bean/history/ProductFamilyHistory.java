package ma.sir.clio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.clio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "product_family")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="product_family_seq",sequenceName="product_family_seq",allocationSize=1, initialValue = 1)
public class ProductFamilyHistory extends HistBusinessObject  {


    public ProductFamilyHistory() {
    super();
    }

    public ProductFamilyHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="product_family_seq")
    public Long getId() {
    return id;
    }
}

