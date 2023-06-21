package  ma.sir.clio.dao.specification.history;

import ma.sir.clio.zynerator.specification.AbstractHistorySpecification;
import ma.sir.clio.dao.criteria.history.UnitePriceHistoryCriteria;
import ma.sir.clio.bean.history.UnitePriceHistory;


public class UnitePriceHistorySpecification extends AbstractHistorySpecification<UnitePriceHistoryCriteria, UnitePriceHistory> {

    public UnitePriceHistorySpecification(UnitePriceHistoryCriteria criteria) {
        super(criteria);
    }

    public UnitePriceHistorySpecification(UnitePriceHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
