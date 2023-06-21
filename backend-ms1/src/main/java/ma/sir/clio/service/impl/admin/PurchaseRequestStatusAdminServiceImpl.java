package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.PurchaseRequestStatus;
import ma.sir.clio.bean.history.PurchaseRequestStatusHistory;
import ma.sir.clio.dao.criteria.core.PurchaseRequestStatusCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseRequestStatusHistoryCriteria;
import ma.sir.clio.dao.facade.core.PurchaseRequestStatusDao;
import ma.sir.clio.dao.facade.history.PurchaseRequestStatusHistoryDao;
import ma.sir.clio.dao.specification.core.PurchaseRequestStatusSpecification;
import ma.sir.clio.service.facade.admin.PurchaseRequestStatusAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;







import java.util.List;
@Service
public class PurchaseRequestStatusAdminServiceImpl extends AbstractServiceImpl<PurchaseRequestStatus,PurchaseRequestStatusHistory, PurchaseRequestStatusCriteria, PurchaseRequestStatusHistoryCriteria, PurchaseRequestStatusDao,
PurchaseRequestStatusHistoryDao> implements PurchaseRequestStatusAdminService {



    public PurchaseRequestStatus findByReferenceEntity(PurchaseRequestStatus t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(PurchaseRequestStatus.class,PurchaseRequestStatusHistory.class, PurchaseRequestStatusHistoryCriteria.class, PurchaseRequestStatusSpecification.class);
    }


    public PurchaseRequestStatusAdminServiceImpl(PurchaseRequestStatusDao dao, PurchaseRequestStatusHistoryDao historyDao) {
        super(dao, historyDao);
    }

}