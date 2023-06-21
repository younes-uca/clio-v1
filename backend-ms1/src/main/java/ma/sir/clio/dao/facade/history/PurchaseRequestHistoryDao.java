package ma.sir.clio.dao.facade.history;

import ma.sir.clio.zynerator.repository.AbstractHistoryRepository;
import ma.sir.clio.bean.history.PurchaseRequestHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRequestHistoryDao extends AbstractHistoryRepository<PurchaseRequestHistory,Long> {

}
