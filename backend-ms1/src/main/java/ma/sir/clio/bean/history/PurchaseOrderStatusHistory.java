package ma.sir.clio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.clio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "purchase_order_status")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="purchase_order_status_seq",sequenceName="purchase_order_status_seq",allocationSize=1, initialValue = 1)
public class PurchaseOrderStatusHistory extends HistBusinessObject  {


    public PurchaseOrderStatusHistory() {
    super();
    }

    public PurchaseOrderStatusHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="purchase_order_status_seq")
    public Long getId() {
    return id;
    }
}

