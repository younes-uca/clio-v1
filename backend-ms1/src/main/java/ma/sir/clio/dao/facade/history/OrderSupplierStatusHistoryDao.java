package ma.sir.clio.dao.facade.history;

import ma.sir.clio.zynerator.repository.AbstractHistoryRepository;
import ma.sir.clio.bean.history.OrderSupplierStatusHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderSupplierStatusHistoryDao extends AbstractHistoryRepository<OrderSupplierStatusHistory,Long> {

}
