package ma.sir.clio.service.facade.admin;

import java.util.List;
import ma.sir.clio.bean.core.PurchaseRequestProduct;
import ma.sir.clio.dao.criteria.core.PurchaseRequestProductCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseRequestProductHistoryCriteria;
import ma.sir.clio.zynerator.service.IService;


public interface PurchaseRequestProductAdminService extends  IService<PurchaseRequestProduct,PurchaseRequestProductCriteria, PurchaseRequestProductHistoryCriteria>  {

    List<PurchaseRequestProduct> findByProductId(Long id);
    int deleteByProductId(Long id);
    List<PurchaseRequestProduct> findByPurchaseRequestId(Long id);
    int deleteByPurchaseRequestId(Long id);
    List<PurchaseRequestProduct> findByUnitePriceId(Long id);
    int deleteByUnitePriceId(Long id);
    List<PurchaseRequestProduct> findByPurchaseRequestProductStatusId(Long id);
    int deleteByPurchaseRequestProductStatusId(Long id);



}
