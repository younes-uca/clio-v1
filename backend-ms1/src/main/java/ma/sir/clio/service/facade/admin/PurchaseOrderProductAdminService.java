package ma.sir.clio.service.facade.admin;

import java.util.List;
import ma.sir.clio.bean.core.PurchaseOrderProduct;
import ma.sir.clio.dao.criteria.core.PurchaseOrderProductCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseOrderProductHistoryCriteria;
import ma.sir.clio.zynerator.service.IService;


public interface PurchaseOrderProductAdminService extends  IService<PurchaseOrderProduct,PurchaseOrderProductCriteria, PurchaseOrderProductHistoryCriteria>  {

    List<PurchaseOrderProduct> findByProductId(Long id);
    int deleteByProductId(Long id);
    List<PurchaseOrderProduct> findByPurchaseOrderId(Long id);
    int deleteByPurchaseOrderId(Long id);
    List<PurchaseOrderProduct> findByPurchaseOrderProductStatusId(Long id);
    int deleteByPurchaseOrderProductStatusId(Long id);
    List<PurchaseOrderProduct> findByUnitePriceId(Long id);
    int deleteByUnitePriceId(Long id);



}
