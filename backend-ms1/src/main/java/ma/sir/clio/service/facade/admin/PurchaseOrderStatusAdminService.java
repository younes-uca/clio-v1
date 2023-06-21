package ma.sir.clio.service.facade.admin;

import java.util.List;
import ma.sir.clio.bean.core.PurchaseOrderStatus;
import ma.sir.clio.dao.criteria.core.PurchaseOrderStatusCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseOrderStatusHistoryCriteria;
import ma.sir.clio.zynerator.service.IService;


public interface PurchaseOrderStatusAdminService extends  IService<PurchaseOrderStatus,PurchaseOrderStatusCriteria, PurchaseOrderStatusHistoryCriteria>  {




}
