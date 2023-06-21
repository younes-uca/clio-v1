package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.Purchaser;
import ma.sir.clio.bean.history.PurchaserHistory;
import ma.sir.clio.dao.criteria.core.PurchaserCriteria;
import ma.sir.clio.dao.criteria.history.PurchaserHistoryCriteria;
import ma.sir.clio.dao.facade.core.PurchaserDao;
import ma.sir.clio.dao.facade.history.PurchaserHistoryDao;
import ma.sir.clio.dao.specification.core.PurchaserSpecification;
import ma.sir.clio.service.facade.admin.PurchaserAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;







import java.util.List;
@Service
public class PurchaserAdminServiceImpl extends AbstractServiceImpl<Purchaser,PurchaserHistory, PurchaserCriteria, PurchaserHistoryCriteria, PurchaserDao,
PurchaserHistoryDao> implements PurchaserAdminService {



    public Purchaser findByReferenceEntity(Purchaser t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(Purchaser.class,PurchaserHistory.class, PurchaserHistoryCriteria.class, PurchaserSpecification.class);
    }


    public PurchaserAdminServiceImpl(PurchaserDao dao, PurchaserHistoryDao historyDao) {
        super(dao, historyDao);
    }

}