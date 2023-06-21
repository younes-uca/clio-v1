package  ma.sir.clio.dao.specification.core;

import ma.sir.clio.zynerator.specification.AbstractSpecification;
import ma.sir.clio.dao.criteria.core.PurchaserCriteria;
import ma.sir.clio.bean.core.Purchaser;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PurchaserSpecification extends  AbstractSpecification<PurchaserCriteria, Purchaser>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public PurchaserSpecification(PurchaserCriteria criteria) {
        super(criteria);
    }

    public PurchaserSpecification(PurchaserCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
