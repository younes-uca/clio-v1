package ma.sir.clio.service.facade.admin;

import java.util.List;
import ma.sir.clio.bean.core.Store;
import ma.sir.clio.dao.criteria.core.StoreCriteria;
import ma.sir.clio.dao.criteria.history.StoreHistoryCriteria;
import ma.sir.clio.zynerator.service.IService;


public interface StoreAdminService extends  IService<Store,StoreCriteria, StoreHistoryCriteria>  {




}
