package  ma.sir.clio.dao.specification.history;

import ma.sir.clio.zynerator.specification.AbstractHistorySpecification;
import ma.sir.clio.dao.criteria.history.StoreProductHistoryCriteria;
import ma.sir.clio.bean.history.StoreProductHistory;


public class StoreProductHistorySpecification extends AbstractHistorySpecification<StoreProductHistoryCriteria, StoreProductHistory> {

    public StoreProductHistorySpecification(StoreProductHistoryCriteria criteria) {
        super(criteria);
    }

    public StoreProductHistorySpecification(StoreProductHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
