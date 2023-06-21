package  ma.sir.clio.dao.specification.history;

import ma.sir.clio.zynerator.specification.AbstractHistorySpecification;
import ma.sir.clio.dao.criteria.history.CriticalityHistoryCriteria;
import ma.sir.clio.bean.history.CriticalityHistory;


public class CriticalityHistorySpecification extends AbstractHistorySpecification<CriticalityHistoryCriteria, CriticalityHistory> {

    public CriticalityHistorySpecification(CriticalityHistoryCriteria criteria) {
        super(criteria);
    }

    public CriticalityHistorySpecification(CriticalityHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
