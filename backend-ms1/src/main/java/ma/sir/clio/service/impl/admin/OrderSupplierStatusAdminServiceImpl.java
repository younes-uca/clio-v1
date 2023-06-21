package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.OrderSupplierStatus;
import ma.sir.clio.bean.history.OrderSupplierStatusHistory;
import ma.sir.clio.dao.criteria.core.OrderSupplierStatusCriteria;
import ma.sir.clio.dao.criteria.history.OrderSupplierStatusHistoryCriteria;
import ma.sir.clio.dao.facade.core.OrderSupplierStatusDao;
import ma.sir.clio.dao.facade.history.OrderSupplierStatusHistoryDao;
import ma.sir.clio.dao.specification.core.OrderSupplierStatusSpecification;
import ma.sir.clio.service.facade.admin.OrderSupplierStatusAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;







import java.util.List;
@Service
public class OrderSupplierStatusAdminServiceImpl extends AbstractServiceImpl<OrderSupplierStatus,OrderSupplierStatusHistory, OrderSupplierStatusCriteria, OrderSupplierStatusHistoryCriteria, OrderSupplierStatusDao,
OrderSupplierStatusHistoryDao> implements OrderSupplierStatusAdminService {



    public OrderSupplierStatus findByReferenceEntity(OrderSupplierStatus t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(OrderSupplierStatus.class,OrderSupplierStatusHistory.class, OrderSupplierStatusHistoryCriteria.class, OrderSupplierStatusSpecification.class);
    }


    public OrderSupplierStatusAdminServiceImpl(OrderSupplierStatusDao dao, OrderSupplierStatusHistoryDao historyDao) {
        super(dao, historyDao);
    }

}