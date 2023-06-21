package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.PurchaseRequestProductStatus;
import ma.sir.clio.bean.history.PurchaseRequestProductStatusHistory;
import ma.sir.clio.dao.criteria.core.PurchaseRequestProductStatusCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseRequestProductStatusHistoryCriteria;
import ma.sir.clio.dao.facade.core.PurchaseRequestProductStatusDao;
import ma.sir.clio.dao.facade.history.PurchaseRequestProductStatusHistoryDao;
import ma.sir.clio.dao.specification.core.PurchaseRequestProductStatusSpecification;
import ma.sir.clio.service.facade.admin.PurchaseRequestProductStatusAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;







import java.util.List;
@Service
public class PurchaseRequestProductStatusAdminServiceImpl extends AbstractServiceImpl<PurchaseRequestProductStatus,PurchaseRequestProductStatusHistory, PurchaseRequestProductStatusCriteria, PurchaseRequestProductStatusHistoryCriteria, PurchaseRequestProductStatusDao,
PurchaseRequestProductStatusHistoryDao> implements PurchaseRequestProductStatusAdminService {



    public PurchaseRequestProductStatus findByReferenceEntity(PurchaseRequestProductStatus t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(PurchaseRequestProductStatus.class,PurchaseRequestProductStatusHistory.class, PurchaseRequestProductStatusHistoryCriteria.class, PurchaseRequestProductStatusSpecification.class);
    }


    public PurchaseRequestProductStatusAdminServiceImpl(PurchaseRequestProductStatusDao dao, PurchaseRequestProductStatusHistoryDao historyDao) {
        super(dao, historyDao);
    }

}