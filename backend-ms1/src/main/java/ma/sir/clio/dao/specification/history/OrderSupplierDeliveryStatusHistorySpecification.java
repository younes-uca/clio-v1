package  ma.sir.clio.dao.specification.history;

import ma.sir.clio.zynerator.specification.AbstractHistorySpecification;
import ma.sir.clio.dao.criteria.history.OrderSupplierDeliveryStatusHistoryCriteria;
import ma.sir.clio.bean.history.OrderSupplierDeliveryStatusHistory;


public class OrderSupplierDeliveryStatusHistorySpecification extends AbstractHistorySpecification<OrderSupplierDeliveryStatusHistoryCriteria, OrderSupplierDeliveryStatusHistory> {

    public OrderSupplierDeliveryStatusHistorySpecification(OrderSupplierDeliveryStatusHistoryCriteria criteria) {
        super(criteria);
    }

    public OrderSupplierDeliveryStatusHistorySpecification(OrderSupplierDeliveryStatusHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
