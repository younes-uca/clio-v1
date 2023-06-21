package  ma.sir.clio.dao.specification.history;

import ma.sir.clio.zynerator.specification.AbstractHistorySpecification;
import ma.sir.clio.dao.criteria.history.SupplierHistoryCriteria;
import ma.sir.clio.bean.history.SupplierHistory;


public class SupplierHistorySpecification extends AbstractHistorySpecification<SupplierHistoryCriteria, SupplierHistory> {

    public SupplierHistorySpecification(SupplierHistoryCriteria criteria) {
        super(criteria);
    }

    public SupplierHistorySpecification(SupplierHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
