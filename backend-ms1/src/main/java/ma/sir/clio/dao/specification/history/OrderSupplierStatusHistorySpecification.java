package  ma.sir.clio.dao.specification.history;

import ma.sir.clio.zynerator.specification.AbstractHistorySpecification;
import ma.sir.clio.dao.criteria.history.OrderSupplierStatusHistoryCriteria;
import ma.sir.clio.bean.history.OrderSupplierStatusHistory;


public class OrderSupplierStatusHistorySpecification extends AbstractHistorySpecification<OrderSupplierStatusHistoryCriteria, OrderSupplierStatusHistory> {

    public OrderSupplierStatusHistorySpecification(OrderSupplierStatusHistoryCriteria criteria) {
        super(criteria);
    }

    public OrderSupplierStatusHistorySpecification(OrderSupplierStatusHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
