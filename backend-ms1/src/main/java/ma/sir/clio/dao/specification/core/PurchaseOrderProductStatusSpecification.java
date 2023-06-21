package  ma.sir.clio.dao.specification.core;

import ma.sir.clio.zynerator.specification.AbstractSpecification;
import ma.sir.clio.dao.criteria.core.PurchaseOrderProductStatusCriteria;
import ma.sir.clio.bean.core.PurchaseOrderProductStatus;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PurchaseOrderProductStatusSpecification extends  AbstractSpecification<PurchaseOrderProductStatusCriteria, PurchaseOrderProductStatus>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public PurchaseOrderProductStatusSpecification(PurchaseOrderProductStatusCriteria criteria) {
        super(criteria);
    }

    public PurchaseOrderProductStatusSpecification(PurchaseOrderProductStatusCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
