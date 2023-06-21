package  ma.sir.clio.dao.specification.history;

import ma.sir.clio.zynerator.specification.AbstractHistorySpecification;
import ma.sir.clio.dao.criteria.history.OrderSupplierTypeHistoryCriteria;
import ma.sir.clio.bean.history.OrderSupplierTypeHistory;


public class OrderSupplierTypeHistorySpecification extends AbstractHistorySpecification<OrderSupplierTypeHistoryCriteria, OrderSupplierTypeHistory> {

    public OrderSupplierTypeHistorySpecification(OrderSupplierTypeHistoryCriteria criteria) {
        super(criteria);
    }

    public OrderSupplierTypeHistorySpecification(OrderSupplierTypeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
