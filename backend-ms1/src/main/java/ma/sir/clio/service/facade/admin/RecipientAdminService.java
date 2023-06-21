package ma.sir.clio.service.facade.admin;

import java.util.List;
import ma.sir.clio.bean.core.Recipient;
import ma.sir.clio.dao.criteria.core.RecipientCriteria;
import ma.sir.clio.dao.criteria.history.RecipientHistoryCriteria;
import ma.sir.clio.zynerator.service.IService;


public interface RecipientAdminService extends  IService<Recipient,RecipientCriteria, RecipientHistoryCriteria>  {




}
