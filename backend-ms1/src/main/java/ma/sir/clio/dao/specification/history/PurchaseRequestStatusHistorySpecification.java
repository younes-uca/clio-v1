package  ma.sir.clio.dao.specification.history;

import ma.sir.clio.zynerator.specification.AbstractHistorySpecification;
import ma.sir.clio.dao.criteria.history.PurchaseRequestStatusHistoryCriteria;
import ma.sir.clio.bean.history.PurchaseRequestStatusHistory;


public class PurchaseRequestStatusHistorySpecification extends AbstractHistorySpecification<PurchaseRequestStatusHistoryCriteria, PurchaseRequestStatusHistory> {

    public PurchaseRequestStatusHistorySpecification(PurchaseRequestStatusHistoryCriteria criteria) {
        super(criteria);
    }

    public PurchaseRequestStatusHistorySpecification(PurchaseRequestStatusHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
