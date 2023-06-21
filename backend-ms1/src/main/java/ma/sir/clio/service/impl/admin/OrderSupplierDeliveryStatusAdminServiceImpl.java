package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.OrderSupplierDeliveryStatus;
import ma.sir.clio.bean.history.OrderSupplierDeliveryStatusHistory;
import ma.sir.clio.dao.criteria.core.OrderSupplierDeliveryStatusCriteria;
import ma.sir.clio.dao.criteria.history.OrderSupplierDeliveryStatusHistoryCriteria;
import ma.sir.clio.dao.facade.core.OrderSupplierDeliveryStatusDao;
import ma.sir.clio.dao.facade.history.OrderSupplierDeliveryStatusHistoryDao;
import ma.sir.clio.dao.specification.core.OrderSupplierDeliveryStatusSpecification;
import ma.sir.clio.service.facade.admin.OrderSupplierDeliveryStatusAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;







import java.util.List;
@Service
public class OrderSupplierDeliveryStatusAdminServiceImpl extends AbstractServiceImpl<OrderSupplierDeliveryStatus,OrderSupplierDeliveryStatusHistory, OrderSupplierDeliveryStatusCriteria, OrderSupplierDeliveryStatusHistoryCriteria, OrderSupplierDeliveryStatusDao,
OrderSupplierDeliveryStatusHistoryDao> implements OrderSupplierDeliveryStatusAdminService {



    public OrderSupplierDeliveryStatus findByReferenceEntity(OrderSupplierDeliveryStatus t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(OrderSupplierDeliveryStatus.class,OrderSupplierDeliveryStatusHistory.class, OrderSupplierDeliveryStatusHistoryCriteria.class, OrderSupplierDeliveryStatusSpecification.class);
    }


    public OrderSupplierDeliveryStatusAdminServiceImpl(OrderSupplierDeliveryStatusDao dao, OrderSupplierDeliveryStatusHistoryDao historyDao) {
        super(dao, historyDao);
    }

}