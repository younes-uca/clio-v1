package ma.sir.clio.dao.facade.history;

import ma.sir.clio.zynerator.repository.AbstractHistoryRepository;
import ma.sir.clio.bean.history.StoreHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreHistoryDao extends AbstractHistoryRepository<StoreHistory,Long> {

}
