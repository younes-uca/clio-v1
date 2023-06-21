package  ma.sir.clio.dao.specification.history;

import ma.sir.clio.zynerator.specification.AbstractHistorySpecification;
import ma.sir.clio.dao.criteria.history.PurchaseOrderStatusHistoryCriteria;
import ma.sir.clio.bean.history.PurchaseOrderStatusHistory;


public class PurchaseOrderStatusHistorySpecification extends AbstractHistorySpecification<PurchaseOrderStatusHistoryCriteria, PurchaseOrderStatusHistory> {

    public PurchaseOrderStatusHistorySpecification(PurchaseOrderStatusHistoryCriteria criteria) {
        super(criteria);
    }

    public PurchaseOrderStatusHistorySpecification(PurchaseOrderStatusHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
