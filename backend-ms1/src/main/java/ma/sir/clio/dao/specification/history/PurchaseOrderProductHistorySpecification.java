package  ma.sir.clio.dao.specification.history;

import ma.sir.clio.zynerator.specification.AbstractHistorySpecification;
import ma.sir.clio.dao.criteria.history.PurchaseOrderProductHistoryCriteria;
import ma.sir.clio.bean.history.PurchaseOrderProductHistory;


public class PurchaseOrderProductHistorySpecification extends AbstractHistorySpecification<PurchaseOrderProductHistoryCriteria, PurchaseOrderProductHistory> {

    public PurchaseOrderProductHistorySpecification(PurchaseOrderProductHistoryCriteria criteria) {
        super(criteria);
    }

    public PurchaseOrderProductHistorySpecification(PurchaseOrderProductHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
