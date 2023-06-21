package ma.sir.clio.dao.facade.history;

import ma.sir.clio.zynerator.repository.AbstractHistoryRepository;
import ma.sir.clio.bean.history.StoreProductHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreProductHistoryDao extends AbstractHistoryRepository<StoreProductHistory,Long> {

}
