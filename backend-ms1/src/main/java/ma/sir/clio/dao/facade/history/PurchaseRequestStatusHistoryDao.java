package ma.sir.clio.dao.facade.history;

import ma.sir.clio.zynerator.repository.AbstractHistoryRepository;
import ma.sir.clio.bean.history.PurchaseRequestStatusHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRequestStatusHistoryDao extends AbstractHistoryRepository<PurchaseRequestStatusHistory,Long> {

}
