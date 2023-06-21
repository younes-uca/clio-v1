package ma.sir.clio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.clio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "currency")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="currency_seq",sequenceName="currency_seq",allocationSize=1, initialValue = 1)
public class CurrencyHistory extends HistBusinessObject  {


    public CurrencyHistory() {
    super();
    }

    public CurrencyHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="currency_seq")
    public Long getId() {
    return id;
    }
}

