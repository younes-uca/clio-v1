package  ma.sir.clio.dao.specification.core;

import ma.sir.clio.zynerator.specification.AbstractSpecification;
import ma.sir.clio.dao.criteria.core.PurchaseRequestProductCriteria;
import ma.sir.clio.bean.core.PurchaseRequestProduct;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PurchaseRequestProductSpecification extends  AbstractSpecification<PurchaseRequestProductCriteria, PurchaseRequestProduct>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBigDecimal("qantity", criteria.getQantity(), criteria.getQantityMin(), criteria.getQantityMax());
        addPredicateBigDecimal("qantityOrdred", criteria.getQantityOrdred(), criteria.getQantityOrdredMin(), criteria.getQantityOrdredMax());
        addPredicateBigDecimal("qantityDelivered", criteria.getQantityDelivered(), criteria.getQantityDeliveredMin(), criteria.getQantityDeliveredMax());
        addPredicateBigDecimal("price", criteria.getPrice(), criteria.getPriceMin(), criteria.getPriceMax());
        addPredicateFk("product","id", criteria.getProduct()==null?null:criteria.getProduct().getId());
        addPredicateFk("product","id", criteria.getProducts());
        addPredicateFk("purchaseRequest","id", criteria.getPurchaseRequest()==null?null:criteria.getPurchaseRequest().getId());
        addPredicateFk("purchaseRequest","id", criteria.getPurchaseRequests());
        addPredicateFk("purchaseRequest","refrence", criteria.getPurchaseRequest()==null?null:criteria.getPurchaseRequest().getRefrence());
        addPredicateFk("unitePrice","id", criteria.getUnitePrice()==null?null:criteria.getUnitePrice().getId());
        addPredicateFk("unitePrice","id", criteria.getUnitePrices());
        addPredicateFk("unitePrice","code", criteria.getUnitePrice()==null?null:criteria.getUnitePrice().getCode());
        addPredicateFk("purchaseRequestProductStatus","id", criteria.getPurchaseRequestProductStatus()==null?null:criteria.getPurchaseRequestProductStatus().getId());
        addPredicateFk("purchaseRequestProductStatus","id", criteria.getPurchaseRequestProductStatuss());
        addPredicateFk("purchaseRequestProductStatus","code", criteria.getPurchaseRequestProductStatus()==null?null:criteria.getPurchaseRequestProductStatus().getCode());
    }

    public PurchaseRequestProductSpecification(PurchaseRequestProductCriteria criteria) {
        super(criteria);
    }

    public PurchaseRequestProductSpecification(PurchaseRequestProductCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
