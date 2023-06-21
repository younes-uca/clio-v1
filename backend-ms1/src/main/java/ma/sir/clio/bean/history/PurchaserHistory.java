package ma.sir.clio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.clio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "purchaser")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="purchaser_seq",sequenceName="purchaser_seq",allocationSize=1, initialValue = 1)
public class PurchaserHistory extends HistBusinessObject  {


    public PurchaserHistory() {
    super();
    }

    public PurchaserHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="purchaser_seq")
    public Long getId() {
    return id;
    }
}

