package ma.sir.clio.dao.facade.history;

import ma.sir.clio.zynerator.repository.AbstractHistoryRepository;
import ma.sir.clio.bean.history.OrderSupplierDeliveryStatusHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderSupplierDeliveryStatusHistoryDao extends AbstractHistoryRepository<OrderSupplierDeliveryStatusHistory,Long> {

}
