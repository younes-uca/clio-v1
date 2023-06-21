package ma.sir.clio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.clio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "recipient")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="recipient_seq",sequenceName="recipient_seq",allocationSize=1, initialValue = 1)
public class RecipientHistory extends HistBusinessObject  {


    public RecipientHistory() {
    super();
    }

    public RecipientHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="recipient_seq")
    public Long getId() {
    return id;
    }
}

