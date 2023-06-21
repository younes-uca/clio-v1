package ma.sir.clio.service.facade.admin;

import java.util.List;
import ma.sir.clio.bean.core.Currency;
import ma.sir.clio.dao.criteria.core.CurrencyCriteria;
import ma.sir.clio.dao.criteria.history.CurrencyHistoryCriteria;
import ma.sir.clio.zynerator.service.IService;


public interface CurrencyAdminService extends  IService<Currency,CurrencyCriteria, CurrencyHistoryCriteria>  {




}
