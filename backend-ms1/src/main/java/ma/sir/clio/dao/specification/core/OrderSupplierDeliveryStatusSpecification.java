package  ma.sir.clio.dao.specification.core;

import ma.sir.clio.zynerator.specification.AbstractSpecification;
import ma.sir.clio.dao.criteria.core.OrderSupplierDeliveryStatusCriteria;
import ma.sir.clio.bean.core.OrderSupplierDeliveryStatus;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class OrderSupplierDeliveryStatusSpecification extends  AbstractSpecification<OrderSupplierDeliveryStatusCriteria, OrderSupplierDeliveryStatus>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public OrderSupplierDeliveryStatusSpecification(OrderSupplierDeliveryStatusCriteria criteria) {
        super(criteria);
    }

    public OrderSupplierDeliveryStatusSpecification(OrderSupplierDeliveryStatusCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
