package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.Currency;
import ma.sir.clio.bean.history.CurrencyHistory;
import ma.sir.clio.dao.criteria.core.CurrencyCriteria;
import ma.sir.clio.dao.criteria.history.CurrencyHistoryCriteria;
import ma.sir.clio.dao.facade.core.CurrencyDao;
import ma.sir.clio.dao.facade.history.CurrencyHistoryDao;
import ma.sir.clio.dao.specification.core.CurrencySpecification;
import ma.sir.clio.service.facade.admin.CurrencyAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;







import java.util.List;
@Service
public class CurrencyAdminServiceImpl extends AbstractServiceImpl<Currency,CurrencyHistory, CurrencyCriteria, CurrencyHistoryCriteria, CurrencyDao,
CurrencyHistoryDao> implements CurrencyAdminService {



    public Currency findByReferenceEntity(Currency t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(Currency.class,CurrencyHistory.class, CurrencyHistoryCriteria.class, CurrencySpecification.class);
    }


    public CurrencyAdminServiceImpl(CurrencyDao dao, CurrencyHistoryDao historyDao) {
        super(dao, historyDao);
    }

}