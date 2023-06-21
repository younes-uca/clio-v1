package  ma.sir.clio.dao.specification.core;

import ma.sir.clio.zynerator.specification.AbstractSpecification;
import ma.sir.clio.dao.criteria.core.UnitePriceCriteria;
import ma.sir.clio.bean.core.UnitePrice;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class UnitePriceSpecification extends  AbstractSpecification<UnitePriceCriteria, UnitePrice>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public UnitePriceSpecification(UnitePriceCriteria criteria) {
        super(criteria);
    }

    public UnitePriceSpecification(UnitePriceCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
