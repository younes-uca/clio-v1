package ma.sir.clio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.clio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "purchase_request_product")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="purchase_request_product_seq",sequenceName="purchase_request_product_seq",allocationSize=1, initialValue = 1)
public class PurchaseRequestProductHistory extends HistBusinessObject  {


    public PurchaseRequestProductHistory() {
    super();
    }

    public PurchaseRequestProductHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="purchase_request_product_seq")
    public Long getId() {
    return id;
    }
}

