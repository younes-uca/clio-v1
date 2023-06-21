package ma.sir.clio.service.facade.admin;

import java.util.List;
import ma.sir.clio.bean.core.PurchaseRequest;
import ma.sir.clio.dao.criteria.core.PurchaseRequestCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseRequestHistoryCriteria;
import ma.sir.clio.zynerator.service.IService;


public interface PurchaseRequestAdminService extends  IService<PurchaseRequest,PurchaseRequestCriteria, PurchaseRequestHistoryCriteria>  {

    List<PurchaseRequest> findBySupplierId(Long id);
    int deleteBySupplierId(Long id);
    List<PurchaseRequest> findByPurchaseRequestStatusId(Long id);
    int deleteByPurchaseRequestStatusId(Long id);



}
