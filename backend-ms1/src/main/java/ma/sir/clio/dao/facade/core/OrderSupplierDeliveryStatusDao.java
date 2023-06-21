package ma.sir.clio.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.OrderSupplierDeliveryStatus;
import org.springframework.stereotype.Repository;
import ma.sir.clio.bean.core.OrderSupplierDeliveryStatus;
import java.util.List;


@Repository
public interface OrderSupplierDeliveryStatusDao extends AbstractRepository<OrderSupplierDeliveryStatus,Long>  {
    OrderSupplierDeliveryStatus findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW OrderSupplierDeliveryStatus(item.id,item.libelle) FROM OrderSupplierDeliveryStatus item")
    List<OrderSupplierDeliveryStatus> findAllOptimized();
}
