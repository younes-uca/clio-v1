package ma.sir.clio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.clio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "order_supplier_type")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="order_supplier_type_seq",sequenceName="order_supplier_type_seq",allocationSize=1, initialValue = 1)
public class OrderSupplierTypeHistory extends HistBusinessObject  {


    public OrderSupplierTypeHistory() {
    super();
    }

    public OrderSupplierTypeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="order_supplier_type_seq")
    public Long getId() {
    return id;
    }
}

