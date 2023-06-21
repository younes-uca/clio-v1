package ma.sir.clio.dao.facade.history;

import ma.sir.clio.zynerator.repository.AbstractHistoryRepository;
import ma.sir.clio.bean.history.UnitePriceHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitePriceHistoryDao extends AbstractHistoryRepository<UnitePriceHistory,Long> {

}
