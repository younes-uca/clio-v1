package ma.sir.clio.service.facade.admin;

import java.util.List;
import ma.sir.clio.bean.core.PurchaseOrderDelivery;
import ma.sir.clio.dao.criteria.core.PurchaseOrderDeliveryCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseOrderDeliveryHistoryCriteria;
import ma.sir.clio.zynerator.service.IService;


public interface PurchaseOrderDeliveryAdminService extends  IService<PurchaseOrderDelivery,PurchaseOrderDeliveryCriteria, PurchaseOrderDeliveryHistoryCriteria>  {

    List<PurchaseOrderDelivery> findByPurchaseOrderId(Long id);
    int deleteByPurchaseOrderId(Long id);
    List<PurchaseOrderDelivery> findByOrderSupplierStatusId(Long id);
    int deleteByOrderSupplierStatusId(Long id);
    List<PurchaseOrderDelivery> findByPurchaserId(Long id);
    int deleteByPurchaserId(Long id);
    List<PurchaseOrderDelivery> findByOrderSupplierDeliveryStatusId(Long id);
    int deleteByOrderSupplierDeliveryStatusId(Long id);



}
