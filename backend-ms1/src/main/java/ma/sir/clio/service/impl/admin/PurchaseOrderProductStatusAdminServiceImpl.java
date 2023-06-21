package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.PurchaseOrderProductStatus;
import ma.sir.clio.bean.history.PurchaseOrderProductStatusHistory;
import ma.sir.clio.dao.criteria.core.PurchaseOrderProductStatusCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseOrderProductStatusHistoryCriteria;
import ma.sir.clio.dao.facade.core.PurchaseOrderProductStatusDao;
import ma.sir.clio.dao.facade.history.PurchaseOrderProductStatusHistoryDao;
import ma.sir.clio.dao.specification.core.PurchaseOrderProductStatusSpecification;
import ma.sir.clio.service.facade.admin.PurchaseOrderProductStatusAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;







import java.util.List;
@Service
public class PurchaseOrderProductStatusAdminServiceImpl extends AbstractServiceImpl<PurchaseOrderProductStatus,PurchaseOrderProductStatusHistory, PurchaseOrderProductStatusCriteria, PurchaseOrderProductStatusHistoryCriteria, PurchaseOrderProductStatusDao,
PurchaseOrderProductStatusHistoryDao> implements PurchaseOrderProductStatusAdminService {



    public PurchaseOrderProductStatus findByReferenceEntity(PurchaseOrderProductStatus t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(PurchaseOrderProductStatus.class,PurchaseOrderProductStatusHistory.class, PurchaseOrderProductStatusHistoryCriteria.class, PurchaseOrderProductStatusSpecification.class);
    }


    public PurchaseOrderProductStatusAdminServiceImpl(PurchaseOrderProductStatusDao dao, PurchaseOrderProductStatusHistoryDao historyDao) {
        super(dao, historyDao);
    }

}