package  ma.sir.clio.dao.specification.history;

import ma.sir.clio.zynerator.specification.AbstractHistorySpecification;
import ma.sir.clio.dao.criteria.history.PurchaseRequestProductHistoryCriteria;
import ma.sir.clio.bean.history.PurchaseRequestProductHistory;


public class PurchaseRequestProductHistorySpecification extends AbstractHistorySpecification<PurchaseRequestProductHistoryCriteria, PurchaseRequestProductHistory> {

    public PurchaseRequestProductHistorySpecification(PurchaseRequestProductHistoryCriteria criteria) {
        super(criteria);
    }

    public PurchaseRequestProductHistorySpecification(PurchaseRequestProductHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
