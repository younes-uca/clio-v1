package ma.sir.clio.dao.facade.history;

import ma.sir.clio.zynerator.repository.AbstractHistoryRepository;
import ma.sir.clio.bean.history.PurchaseRequestProductHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRequestProductHistoryDao extends AbstractHistoryRepository<PurchaseRequestProductHistory,Long> {

}
