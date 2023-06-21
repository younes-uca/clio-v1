package ma.sir.clio.dao.facade.history;

import ma.sir.clio.zynerator.repository.AbstractHistoryRepository;
import ma.sir.clio.bean.history.ProductFamilyHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductFamilyHistoryDao extends AbstractHistoryRepository<ProductFamilyHistory,Long> {

}
