package  ma.sir.clio.dao.specification.history;

import ma.sir.clio.zynerator.specification.AbstractHistorySpecification;
import ma.sir.clio.dao.criteria.history.ProductFamilyHistoryCriteria;
import ma.sir.clio.bean.history.ProductFamilyHistory;


public class ProductFamilyHistorySpecification extends AbstractHistorySpecification<ProductFamilyHistoryCriteria, ProductFamilyHistory> {

    public ProductFamilyHistorySpecification(ProductFamilyHistoryCriteria criteria) {
        super(criteria);
    }

    public ProductFamilyHistorySpecification(ProductFamilyHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
