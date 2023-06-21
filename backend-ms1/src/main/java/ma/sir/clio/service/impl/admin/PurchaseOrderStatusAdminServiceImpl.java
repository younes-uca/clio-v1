package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.PurchaseOrderStatus;
import ma.sir.clio.bean.history.PurchaseOrderStatusHistory;
import ma.sir.clio.dao.criteria.core.PurchaseOrderStatusCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseOrderStatusHistoryCriteria;
import ma.sir.clio.dao.facade.core.PurchaseOrderStatusDao;
import ma.sir.clio.dao.facade.history.PurchaseOrderStatusHistoryDao;
import ma.sir.clio.dao.specification.core.PurchaseOrderStatusSpecification;
import ma.sir.clio.service.facade.admin.PurchaseOrderStatusAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;







import java.util.List;
@Service
public class PurchaseOrderStatusAdminServiceImpl extends AbstractServiceImpl<PurchaseOrderStatus,PurchaseOrderStatusHistory, PurchaseOrderStatusCriteria, PurchaseOrderStatusHistoryCriteria, PurchaseOrderStatusDao,
PurchaseOrderStatusHistoryDao> implements PurchaseOrderStatusAdminService {



    public PurchaseOrderStatus findByReferenceEntity(PurchaseOrderStatus t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(PurchaseOrderStatus.class,PurchaseOrderStatusHistory.class, PurchaseOrderStatusHistoryCriteria.class, PurchaseOrderStatusSpecification.class);
    }


    public PurchaseOrderStatusAdminServiceImpl(PurchaseOrderStatusDao dao, PurchaseOrderStatusHistoryDao historyDao) {
        super(dao, historyDao);
    }

}