package  ma.sir.clio.dao.specification.history;

import ma.sir.clio.zynerator.specification.AbstractHistorySpecification;
import ma.sir.clio.dao.criteria.history.PurchaseOrderDeliveryProductHistoryCriteria;
import ma.sir.clio.bean.history.PurchaseOrderDeliveryProductHistory;


public class PurchaseOrderDeliveryProductHistorySpecification extends AbstractHistorySpecification<PurchaseOrderDeliveryProductHistoryCriteria, PurchaseOrderDeliveryProductHistory> {

    public PurchaseOrderDeliveryProductHistorySpecification(PurchaseOrderDeliveryProductHistoryCriteria criteria) {
        super(criteria);
    }

    public PurchaseOrderDeliveryProductHistorySpecification(PurchaseOrderDeliveryProductHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
