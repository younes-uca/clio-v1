package  ma.sir.clio.dao.specification.core;

import ma.sir.clio.zynerator.specification.AbstractSpecification;
import ma.sir.clio.dao.criteria.core.PurchaseOrderProductCriteria;
import ma.sir.clio.bean.core.PurchaseOrderProduct;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PurchaseOrderProductSpecification extends  AbstractSpecification<PurchaseOrderProductCriteria, PurchaseOrderProduct>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBigDecimal("qantity", criteria.getQantity(), criteria.getQantityMin(), criteria.getQantityMax());
        addPredicateBigDecimal("qantityDelivered", criteria.getQantityDelivered(), criteria.getQantityDeliveredMin(), criteria.getQantityDeliveredMax());
        addPredicateBigDecimal("price", criteria.getPrice(), criteria.getPriceMin(), criteria.getPriceMax());
        addPredicateFk("product","id", criteria.getProduct()==null?null:criteria.getProduct().getId());
        addPredicateFk("product","id", criteria.getProducts());
        addPredicateFk("purchaseOrder","id", criteria.getPurchaseOrder()==null?null:criteria.getPurchaseOrder().getId());
        addPredicateFk("purchaseOrder","id", criteria.getPurchaseOrders());
        addPredicateFk("purchaseOrder","refrence", criteria.getPurchaseOrder()==null?null:criteria.getPurchaseOrder().getRefrence());
        addPredicateFk("purchaseOrderProductStatus","id", criteria.getPurchaseOrderProductStatus()==null?null:criteria.getPurchaseOrderProductStatus().getId());
        addPredicateFk("purchaseOrderProductStatus","id", criteria.getPurchaseOrderProductStatuss());
        addPredicateFk("purchaseOrderProductStatus","code", criteria.getPurchaseOrderProductStatus()==null?null:criteria.getPurchaseOrderProductStatus().getCode());
        addPredicateFk("unitePrice","id", criteria.getUnitePrice()==null?null:criteria.getUnitePrice().getId());
        addPredicateFk("unitePrice","id", criteria.getUnitePrices());
        addPredicateFk("unitePrice","code", criteria.getUnitePrice()==null?null:criteria.getUnitePrice().getCode());
    }

    public PurchaseOrderProductSpecification(PurchaseOrderProductCriteria criteria) {
        super(criteria);
    }

    public PurchaseOrderProductSpecification(PurchaseOrderProductCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
