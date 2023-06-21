package ma.sir.clio.service.facade.admin;

import java.util.List;
import ma.sir.clio.bean.core.PurchaseOrder;
import ma.sir.clio.dao.criteria.core.PurchaseOrderCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseOrderHistoryCriteria;
import ma.sir.clio.zynerator.service.IService;


public interface PurchaseOrderAdminService extends  IService<PurchaseOrder,PurchaseOrderCriteria, PurchaseOrderHistoryCriteria>  {

    List<PurchaseOrder> findByOrderSupplierTypeId(Long id);
    int deleteByOrderSupplierTypeId(Long id);
    List<PurchaseOrder> findByCriticalityId(Long id);
    int deleteByCriticalityId(Long id);
    List<PurchaseOrder> findBySupplierId(Long id);
    int deleteBySupplierId(Long id);
    List<PurchaseOrder> findByRecipientId(Long id);
    int deleteByRecipientId(Long id);
    List<PurchaseOrder> findByPurchaserId(Long id);
    int deleteByPurchaserId(Long id);
    List<PurchaseOrder> findByCurrencyId(Long id);
    int deleteByCurrencyId(Long id);
    List<PurchaseOrder> findByPurchaseOrderStatusId(Long id);
    int deleteByPurchaseOrderStatusId(Long id);
    List<PurchaseOrder> findByPurchaseRequestId(Long id);
    int deleteByPurchaseRequestId(Long id);



}
