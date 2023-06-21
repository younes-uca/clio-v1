package ma.sir.clio.dao.facade.history;

import ma.sir.clio.zynerator.repository.AbstractHistoryRepository;
import ma.sir.clio.bean.history.ProductHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductHistoryDao extends AbstractHistoryRepository<ProductHistory,Long> {

}
