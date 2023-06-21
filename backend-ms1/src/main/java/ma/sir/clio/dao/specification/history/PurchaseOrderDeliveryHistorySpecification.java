package  ma.sir.clio.dao.specification.history;

import ma.sir.clio.zynerator.specification.AbstractHistorySpecification;
import ma.sir.clio.dao.criteria.history.PurchaseOrderDeliveryHistoryCriteria;
import ma.sir.clio.bean.history.PurchaseOrderDeliveryHistory;


public class PurchaseOrderDeliveryHistorySpecification extends AbstractHistorySpecification<PurchaseOrderDeliveryHistoryCriteria, PurchaseOrderDeliveryHistory> {

    public PurchaseOrderDeliveryHistorySpecification(PurchaseOrderDeliveryHistoryCriteria criteria) {
        super(criteria);
    }

    public PurchaseOrderDeliveryHistorySpecification(PurchaseOrderDeliveryHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
