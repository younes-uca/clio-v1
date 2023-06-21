package  ma.sir.clio.dao.specification.history;

import ma.sir.clio.zynerator.specification.AbstractHistorySpecification;
import ma.sir.clio.dao.criteria.history.PurchaseRequestHistoryCriteria;
import ma.sir.clio.bean.history.PurchaseRequestHistory;


public class PurchaseRequestHistorySpecification extends AbstractHistorySpecification<PurchaseRequestHistoryCriteria, PurchaseRequestHistory> {

    public PurchaseRequestHistorySpecification(PurchaseRequestHistoryCriteria criteria) {
        super(criteria);
    }

    public PurchaseRequestHistorySpecification(PurchaseRequestHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
