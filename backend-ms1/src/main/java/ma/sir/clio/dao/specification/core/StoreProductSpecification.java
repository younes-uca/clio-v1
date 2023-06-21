package  ma.sir.clio.dao.specification.core;

import ma.sir.clio.zynerator.specification.AbstractSpecification;
import ma.sir.clio.dao.criteria.core.StoreProductCriteria;
import ma.sir.clio.bean.core.StoreProduct;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class StoreProductSpecification extends  AbstractSpecification<StoreProductCriteria, StoreProduct>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBigDecimal("qantity", criteria.getQantity(), criteria.getQantityMin(), criteria.getQantityMax());
        addPredicateFk("store","id", criteria.getStore()==null?null:criteria.getStore().getId());
        addPredicateFk("store","id", criteria.getStores());
        addPredicateFk("store","code", criteria.getStore()==null?null:criteria.getStore().getCode());
        addPredicateFk("product","id", criteria.getProduct()==null?null:criteria.getProduct().getId());
        addPredicateFk("product","id", criteria.getProducts());
    }

    public StoreProductSpecification(StoreProductCriteria criteria) {
        super(criteria);
    }

    public StoreProductSpecification(StoreProductCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
