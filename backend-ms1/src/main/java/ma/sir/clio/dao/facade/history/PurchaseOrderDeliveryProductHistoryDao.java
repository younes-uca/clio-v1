package ma.sir.clio.dao.facade.history;

import ma.sir.clio.zynerator.repository.AbstractHistoryRepository;
import ma.sir.clio.bean.history.PurchaseOrderDeliveryProductHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOrderDeliveryProductHistoryDao extends AbstractHistoryRepository<PurchaseOrderDeliveryProductHistory,Long> {

}
