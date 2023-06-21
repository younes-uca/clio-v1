package ma.sir.clio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.clio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "criticality")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="criticality_seq",sequenceName="criticality_seq",allocationSize=1, initialValue = 1)
public class CriticalityHistory extends HistBusinessObject  {


    public CriticalityHistory() {
    super();
    }

    public CriticalityHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="criticality_seq")
    public Long getId() {
    return id;
    }
}

