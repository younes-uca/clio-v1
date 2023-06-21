package ma.sir.clio.dao.facade.history;

import ma.sir.clio.zynerator.repository.AbstractHistoryRepository;
import ma.sir.clio.bean.history.CriticalityHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CriticalityHistoryDao extends AbstractHistoryRepository<CriticalityHistory,Long> {

}
