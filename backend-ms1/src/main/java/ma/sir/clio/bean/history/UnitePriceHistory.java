package ma.sir.clio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.clio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "unite_price")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="unite_price_seq",sequenceName="unite_price_seq",allocationSize=1, initialValue = 1)
public class UnitePriceHistory extends HistBusinessObject  {


    public UnitePriceHistory() {
    super();
    }

    public UnitePriceHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="unite_price_seq")
    public Long getId() {
    return id;
    }
}

