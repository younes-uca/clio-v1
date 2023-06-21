package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.OrderSupplierType;
import ma.sir.clio.bean.history.OrderSupplierTypeHistory;
import ma.sir.clio.dao.criteria.core.OrderSupplierTypeCriteria;
import ma.sir.clio.dao.criteria.history.OrderSupplierTypeHistoryCriteria;
import ma.sir.clio.dao.facade.core.OrderSupplierTypeDao;
import ma.sir.clio.dao.facade.history.OrderSupplierTypeHistoryDao;
import ma.sir.clio.dao.specification.core.OrderSupplierTypeSpecification;
import ma.sir.clio.service.facade.admin.OrderSupplierTypeAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;







import java.util.List;
@Service
public class OrderSupplierTypeAdminServiceImpl extends AbstractServiceImpl<OrderSupplierType,OrderSupplierTypeHistory, OrderSupplierTypeCriteria, OrderSupplierTypeHistoryCriteria, OrderSupplierTypeDao,
OrderSupplierTypeHistoryDao> implements OrderSupplierTypeAdminService {



    public OrderSupplierType findByReferenceEntity(OrderSupplierType t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(OrderSupplierType.class,OrderSupplierTypeHistory.class, OrderSupplierTypeHistoryCriteria.class, OrderSupplierTypeSpecification.class);
    }


    public OrderSupplierTypeAdminServiceImpl(OrderSupplierTypeDao dao, OrderSupplierTypeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}