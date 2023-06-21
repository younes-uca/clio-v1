package ma.sir.clio.dao.facade.history;

import ma.sir.clio.zynerator.repository.AbstractHistoryRepository;
import ma.sir.clio.bean.history.PurchaseOrderProductHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOrderProductHistoryDao extends AbstractHistoryRepository<PurchaseOrderProductHistory,Long> {

}
