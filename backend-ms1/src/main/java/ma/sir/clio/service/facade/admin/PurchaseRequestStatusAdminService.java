package ma.sir.clio.service.facade.admin;

import java.util.List;
import ma.sir.clio.bean.core.PurchaseRequestStatus;
import ma.sir.clio.dao.criteria.core.PurchaseRequestStatusCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseRequestStatusHistoryCriteria;
import ma.sir.clio.zynerator.service.IService;


public interface PurchaseRequestStatusAdminService extends  IService<PurchaseRequestStatus,PurchaseRequestStatusCriteria, PurchaseRequestStatusHistoryCriteria>  {




}
