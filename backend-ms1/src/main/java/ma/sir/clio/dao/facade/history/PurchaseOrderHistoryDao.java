package ma.sir.clio.dao.facade.history;

import ma.sir.clio.zynerator.repository.AbstractHistoryRepository;
import ma.sir.clio.bean.history.PurchaseOrderHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOrderHistoryDao extends AbstractHistoryRepository<PurchaseOrderHistory,Long> {

}
