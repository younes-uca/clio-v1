package ma.sir.clio.service.facade.admin;

import java.util.List;
import ma.sir.clio.bean.core.PurchaseOrderDeliveryProduct;
import ma.sir.clio.dao.criteria.core.PurchaseOrderDeliveryProductCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseOrderDeliveryProductHistoryCriteria;
import ma.sir.clio.zynerator.service.IService;


public interface PurchaseOrderDeliveryProductAdminService extends  IService<PurchaseOrderDeliveryProduct,PurchaseOrderDeliveryProductCriteria, PurchaseOrderDeliveryProductHistoryCriteria>  {

    List<PurchaseOrderDeliveryProduct> findByProductId(Long id);
    int deleteByProductId(Long id);
    List<PurchaseOrderDeliveryProduct> findByPurchaseOrderDeliveryId(Long id);
    int deleteByPurchaseOrderDeliveryId(Long id);
    List<PurchaseOrderDeliveryProduct> findByStoreId(Long id);
    int deleteByStoreId(Long id);



}
