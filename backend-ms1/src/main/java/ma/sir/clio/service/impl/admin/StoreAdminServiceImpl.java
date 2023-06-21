package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.Store;
import ma.sir.clio.bean.history.StoreHistory;
import ma.sir.clio.dao.criteria.core.StoreCriteria;
import ma.sir.clio.dao.criteria.history.StoreHistoryCriteria;
import ma.sir.clio.dao.facade.core.StoreDao;
import ma.sir.clio.dao.facade.history.StoreHistoryDao;
import ma.sir.clio.dao.specification.core.StoreSpecification;
import ma.sir.clio.service.facade.admin.StoreAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;







import java.util.List;
@Service
public class StoreAdminServiceImpl extends AbstractServiceImpl<Store,StoreHistory, StoreCriteria, StoreHistoryCriteria, StoreDao,
StoreHistoryDao> implements StoreAdminService {



    public Store findByReferenceEntity(Store t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(Store.class,StoreHistory.class, StoreHistoryCriteria.class, StoreSpecification.class);
    }


    public StoreAdminServiceImpl(StoreDao dao, StoreHistoryDao historyDao) {
        super(dao, historyDao);
    }

}