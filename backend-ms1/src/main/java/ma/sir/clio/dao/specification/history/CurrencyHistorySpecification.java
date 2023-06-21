package  ma.sir.clio.dao.specification.history;

import ma.sir.clio.zynerator.specification.AbstractHistorySpecification;
import ma.sir.clio.dao.criteria.history.CurrencyHistoryCriteria;
import ma.sir.clio.bean.history.CurrencyHistory;


public class CurrencyHistorySpecification extends AbstractHistorySpecification<CurrencyHistoryCriteria, CurrencyHistory> {

    public CurrencyHistorySpecification(CurrencyHistoryCriteria criteria) {
        super(criteria);
    }

    public CurrencyHistorySpecification(CurrencyHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
