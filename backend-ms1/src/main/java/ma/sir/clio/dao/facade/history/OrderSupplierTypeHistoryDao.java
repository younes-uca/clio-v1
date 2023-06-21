package ma.sir.clio.dao.facade.history;

import ma.sir.clio.zynerator.repository.AbstractHistoryRepository;
import ma.sir.clio.bean.history.OrderSupplierTypeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderSupplierTypeHistoryDao extends AbstractHistoryRepository<OrderSupplierTypeHistory,Long> {

}
