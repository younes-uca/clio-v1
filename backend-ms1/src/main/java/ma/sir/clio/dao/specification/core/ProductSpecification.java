package  ma.sir.clio.dao.specification.core;

import ma.sir.clio.zynerator.specification.AbstractSpecification;
import ma.sir.clio.dao.criteria.core.ProductCriteria;
import ma.sir.clio.bean.core.Product;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ProductSpecification extends  AbstractSpecification<ProductCriteria, Product>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("partNumber", criteria.getPartNumber(),criteria.getPartNumberLike());
        addPredicateFk("productFamily","id", criteria.getProductFamily()==null?null:criteria.getProductFamily().getId());
        addPredicateFk("productFamily","id", criteria.getProductFamilys());
        addPredicateFk("productFamily","code", criteria.getProductFamily()==null?null:criteria.getProductFamily().getCode());
    }

    public ProductSpecification(ProductCriteria criteria) {
        super(criteria);
    }

    public ProductSpecification(ProductCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
