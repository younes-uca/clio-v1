package  ma.sir.clio.dao.specification.history;

import ma.sir.clio.zynerator.specification.AbstractHistorySpecification;
import ma.sir.clio.dao.criteria.history.StoreHistoryCriteria;
import ma.sir.clio.bean.history.StoreHistory;


public class StoreHistorySpecification extends AbstractHistorySpecification<StoreHistoryCriteria, StoreHistory> {

    public StoreHistorySpecification(StoreHistoryCriteria criteria) {
        super(criteria);
    }

    public StoreHistorySpecification(StoreHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
