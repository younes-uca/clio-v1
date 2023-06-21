package  ma.sir.clio.dao.specification.core;

import ma.sir.clio.zynerator.specification.AbstractSpecification;
import ma.sir.clio.dao.criteria.core.OrderSupplierTypeCriteria;
import ma.sir.clio.bean.core.OrderSupplierType;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class OrderSupplierTypeSpecification extends  AbstractSpecification<OrderSupplierTypeCriteria, OrderSupplierType>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public OrderSupplierTypeSpecification(OrderSupplierTypeCriteria criteria) {
        super(criteria);
    }

    public OrderSupplierTypeSpecification(OrderSupplierTypeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
