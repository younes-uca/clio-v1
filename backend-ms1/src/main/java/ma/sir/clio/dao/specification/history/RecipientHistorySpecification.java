package  ma.sir.clio.dao.specification.history;

import ma.sir.clio.zynerator.specification.AbstractHistorySpecification;
import ma.sir.clio.dao.criteria.history.RecipientHistoryCriteria;
import ma.sir.clio.bean.history.RecipientHistory;


public class RecipientHistorySpecification extends AbstractHistorySpecification<RecipientHistoryCriteria, RecipientHistory> {

    public RecipientHistorySpecification(RecipientHistoryCriteria criteria) {
        super(criteria);
    }

    public RecipientHistorySpecification(RecipientHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
