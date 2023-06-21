package  ma.sir.clio.dao.specification.core;

import ma.sir.clio.zynerator.specification.AbstractSpecification;
import ma.sir.clio.dao.criteria.core.SupplierCriteria;
import ma.sir.clio.bean.core.Supplier;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SupplierSpecification extends  AbstractSpecification<SupplierCriteria, Supplier>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("prenom", criteria.getPrenom(),criteria.getPrenomLike());
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicate("email", criteria.getEmail(),criteria.getEmailLike());
    }

    public SupplierSpecification(SupplierCriteria criteria) {
        super(criteria);
    }

    public SupplierSpecification(SupplierCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
