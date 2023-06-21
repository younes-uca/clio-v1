package ma.sir.clio.dao.facade.core;

import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.PurchaseOrderDelivery;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PurchaseOrderDeliveryDao extends AbstractRepository<PurchaseOrderDelivery,Long>  {

    List<PurchaseOrderDelivery> findByPurchaseOrderId(Long id);
    int deleteByPurchaseOrderId(Long id);
    List<PurchaseOrderDelivery> findByOrderSupplierStatusId(Long id);
    int deleteByOrderSupplierStatusId(Long id);
    List<PurchaseOrderDelivery> findByPurchaserId(Long id);
    int deleteByPurchaserId(Long id);
    List<PurchaseOrderDelivery> findByOrderSupplierDeliveryStatusId(Long id);
    int deleteByOrderSupplierDeliveryStatusId(Long id);

}
