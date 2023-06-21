package  ma.sir.clio.dao.specification.history;

import ma.sir.clio.zynerator.specification.AbstractHistorySpecification;
import ma.sir.clio.dao.criteria.history.PurchaseOrderHistoryCriteria;
import ma.sir.clio.bean.history.PurchaseOrderHistory;


public class PurchaseOrderHistorySpecification extends AbstractHistorySpecification<PurchaseOrderHistoryCriteria, PurchaseOrderHistory> {

    public PurchaseOrderHistorySpecification(PurchaseOrderHistoryCriteria criteria) {
        super(criteria);
    }

    public PurchaseOrderHistorySpecification(PurchaseOrderHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
