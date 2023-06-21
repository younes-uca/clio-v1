package  ma.sir.clio.dao.specification.core;

import ma.sir.clio.zynerator.specification.AbstractSpecification;
import ma.sir.clio.dao.criteria.core.CurrencyCriteria;
import ma.sir.clio.bean.core.Currency;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class CurrencySpecification extends  AbstractSpecification<CurrencyCriteria, Currency>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public CurrencySpecification(CurrencyCriteria criteria) {
        super(criteria);
    }

    public CurrencySpecification(CurrencyCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
