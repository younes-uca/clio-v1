package ma.sir.clio.service.facade.admin;

import java.util.List;
import ma.sir.clio.bean.core.Criticality;
import ma.sir.clio.dao.criteria.core.CriticalityCriteria;
import ma.sir.clio.dao.criteria.history.CriticalityHistoryCriteria;
import ma.sir.clio.zynerator.service.IService;


public interface CriticalityAdminService extends  IService<Criticality,CriticalityCriteria, CriticalityHistoryCriteria>  {




}
