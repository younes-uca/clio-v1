package ma.sir.clio.dao.facade.core;

import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.PurchaseOrderDeliveryProduct;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PurchaseOrderDeliveryProductDao extends AbstractRepository<PurchaseOrderDeliveryProduct,Long>  {

    List<PurchaseOrderDeliveryProduct> findByProductId(Long id);
    int deleteByProductId(Long id);
    List<PurchaseOrderDeliveryProduct> findByPurchaseOrderDeliveryId(Long id);
    int deleteByPurchaseOrderDeliveryId(Long id);
    List<PurchaseOrderDeliveryProduct> findByStoreId(Long id);
    int deleteByStoreId(Long id);

}
