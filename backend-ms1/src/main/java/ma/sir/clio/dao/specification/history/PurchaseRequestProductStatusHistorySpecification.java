package  ma.sir.clio.dao.specification.history;

import ma.sir.clio.zynerator.specification.AbstractHistorySpecification;
import ma.sir.clio.dao.criteria.history.PurchaseRequestProductStatusHistoryCriteria;
import ma.sir.clio.bean.history.PurchaseRequestProductStatusHistory;


public class PurchaseRequestProductStatusHistorySpecification extends AbstractHistorySpecification<PurchaseRequestProductStatusHistoryCriteria, PurchaseRequestProductStatusHistory> {

    public PurchaseRequestProductStatusHistorySpecification(PurchaseRequestProductStatusHistoryCriteria criteria) {
        super(criteria);
    }

    public PurchaseRequestProductStatusHistorySpecification(PurchaseRequestProductStatusHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
