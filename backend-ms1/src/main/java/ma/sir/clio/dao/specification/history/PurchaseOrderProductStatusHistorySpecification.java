package  ma.sir.clio.dao.specification.history;

import ma.sir.clio.zynerator.specification.AbstractHistorySpecification;
import ma.sir.clio.dao.criteria.history.PurchaseOrderProductStatusHistoryCriteria;
import ma.sir.clio.bean.history.PurchaseOrderProductStatusHistory;


public class PurchaseOrderProductStatusHistorySpecification extends AbstractHistorySpecification<PurchaseOrderProductStatusHistoryCriteria, PurchaseOrderProductStatusHistory> {

    public PurchaseOrderProductStatusHistorySpecification(PurchaseOrderProductStatusHistoryCriteria criteria) {
        super(criteria);
    }

    public PurchaseOrderProductStatusHistorySpecification(PurchaseOrderProductStatusHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
