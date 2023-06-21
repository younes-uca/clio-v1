package ma.sir.clio.dao.facade.history;

import ma.sir.clio.zynerator.repository.AbstractHistoryRepository;
import ma.sir.clio.bean.history.PurchaseOrderProductStatusHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOrderProductStatusHistoryDao extends AbstractHistoryRepository<PurchaseOrderProductStatusHistory,Long> {

}
