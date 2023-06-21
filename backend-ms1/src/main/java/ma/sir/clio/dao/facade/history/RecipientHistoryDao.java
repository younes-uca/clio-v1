package ma.sir.clio.dao.facade.history;

import ma.sir.clio.zynerator.repository.AbstractHistoryRepository;
import ma.sir.clio.bean.history.RecipientHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipientHistoryDao extends AbstractHistoryRepository<RecipientHistory,Long> {

}
