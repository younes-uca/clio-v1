package ma.sir.clio.dao.facade.history;

import ma.sir.clio.zynerator.repository.AbstractHistoryRepository;
import ma.sir.clio.bean.history.PurchaserHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaserHistoryDao extends AbstractHistoryRepository<PurchaserHistory,Long> {

}
