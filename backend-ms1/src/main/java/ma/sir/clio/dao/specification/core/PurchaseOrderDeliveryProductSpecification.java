package  ma.sir.clio.dao.specification.core;

import ma.sir.clio.zynerator.specification.AbstractSpecification;
import ma.sir.clio.dao.criteria.core.PurchaseOrderDeliveryProductCriteria;
import ma.sir.clio.bean.core.PurchaseOrderDeliveryProduct;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PurchaseOrderDeliveryProductSpecification extends  AbstractSpecification<PurchaseOrderDeliveryProductCriteria, PurchaseOrderDeliveryProduct>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBigDecimal("qantity", criteria.getQantity(), criteria.getQantityMin(), criteria.getQantityMax());
        addPredicateFk("product","id", criteria.getProduct()==null?null:criteria.getProduct().getId());
        addPredicateFk("product","id", criteria.getProducts());
        addPredicateFk("purchaseOrderDelivery","id", criteria.getPurchaseOrderDelivery()==null?null:criteria.getPurchaseOrderDelivery().getId());
        addPredicateFk("purchaseOrderDelivery","id", criteria.getPurchaseOrderDeliverys());
        addPredicateFk("store","id", criteria.getStore()==null?null:criteria.getStore().getId());
        addPredicateFk("store","id", criteria.getStores());
        addPredicateFk("store","code", criteria.getStore()==null?null:criteria.getStore().getCode());
    }

    public PurchaseOrderDeliveryProductSpecification(PurchaseOrderDeliveryProductCriteria criteria) {
        super(criteria);
    }

    public PurchaseOrderDeliveryProductSpecification(PurchaseOrderDeliveryProductCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
