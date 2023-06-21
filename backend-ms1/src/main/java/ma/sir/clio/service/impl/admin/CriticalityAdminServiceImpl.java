package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.Criticality;
import ma.sir.clio.bean.history.CriticalityHistory;
import ma.sir.clio.dao.criteria.core.CriticalityCriteria;
import ma.sir.clio.dao.criteria.history.CriticalityHistoryCriteria;
import ma.sir.clio.dao.facade.core.CriticalityDao;
import ma.sir.clio.dao.facade.history.CriticalityHistoryDao;
import ma.sir.clio.dao.specification.core.CriticalitySpecification;
import ma.sir.clio.service.facade.admin.CriticalityAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;







import java.util.List;
@Service
public class CriticalityAdminServiceImpl extends AbstractServiceImpl<Criticality,CriticalityHistory, CriticalityCriteria, CriticalityHistoryCriteria, CriticalityDao,
CriticalityHistoryDao> implements CriticalityAdminService {



    public Criticality findByReferenceEntity(Criticality t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(Criticality.class,CriticalityHistory.class, CriticalityHistoryCriteria.class, CriticalitySpecification.class);
    }


    public CriticalityAdminServiceImpl(CriticalityDao dao, CriticalityHistoryDao historyDao) {
        super(dao, historyDao);
    }

}