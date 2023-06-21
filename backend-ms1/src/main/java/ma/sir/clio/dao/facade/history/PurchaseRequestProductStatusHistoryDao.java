package ma.sir.clio.dao.facade.history;

import ma.sir.clio.zynerator.repository.AbstractHistoryRepository;
import ma.sir.clio.bean.history.PurchaseRequestProductStatusHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRequestProductStatusHistoryDao extends AbstractHistoryRepository<PurchaseRequestProductStatusHistory,Long> {

}
