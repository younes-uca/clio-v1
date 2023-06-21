package ma.sir.clio.dao.facade.history;

import ma.sir.clio.zynerator.repository.AbstractHistoryRepository;
import ma.sir.clio.bean.history.CurrencyHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyHistoryDao extends AbstractHistoryRepository<CurrencyHistory,Long> {

}
