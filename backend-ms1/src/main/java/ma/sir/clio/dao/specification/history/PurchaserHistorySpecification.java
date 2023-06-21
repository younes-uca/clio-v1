package  ma.sir.clio.dao.specification.history;

import ma.sir.clio.zynerator.specification.AbstractHistorySpecification;
import ma.sir.clio.dao.criteria.history.PurchaserHistoryCriteria;
import ma.sir.clio.bean.history.PurchaserHistory;


public class PurchaserHistorySpecification extends AbstractHistorySpecification<PurchaserHistoryCriteria, PurchaserHistory> {

    public PurchaserHistorySpecification(PurchaserHistoryCriteria criteria) {
        super(criteria);
    }

    public PurchaserHistorySpecification(PurchaserHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
