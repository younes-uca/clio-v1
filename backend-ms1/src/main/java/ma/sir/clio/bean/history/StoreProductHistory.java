package ma.sir.clio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.clio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "store_product")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="store_product_seq",sequenceName="store_product_seq",allocationSize=1, initialValue = 1)
public class StoreProductHistory extends HistBusinessObject  {


    public StoreProductHistory() {
    super();
    }

    public StoreProductHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="store_product_seq")
    public Long getId() {
    return id;
    }
}

