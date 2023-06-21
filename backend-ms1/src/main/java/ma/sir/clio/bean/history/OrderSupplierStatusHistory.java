package ma.sir.clio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.clio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "order_supplier_status")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="order_supplier_status_seq",sequenceName="order_supplier_status_seq",allocationSize=1, initialValue = 1)
public class OrderSupplierStatusHistory extends HistBusinessObject  {


    public OrderSupplierStatusHistory() {
    super();
    }

    public OrderSupplierStatusHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="order_supplier_status_seq")
    public Long getId() {
    return id;
    }
}

