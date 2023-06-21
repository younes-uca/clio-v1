package  ma.sir.clio.dao.specification.core;

import ma.sir.clio.zynerator.specification.AbstractSpecification;
import ma.sir.clio.dao.criteria.core.PurchaseOrderCriteria;
import ma.sir.clio.bean.core.PurchaseOrder;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PurchaseOrderSpecification extends  AbstractSpecification<PurchaseOrderCriteria, PurchaseOrder>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("refrence", criteria.getRefrence(),criteria.getRefrenceLike());
        addPredicate("dateOrderSupplier", criteria.getDateOrderSupplier(), criteria.getDateOrderSupplierFrom(), criteria.getDateOrderSupplierTo());
        addPredicateBigDecimal("total", criteria.getTotal(), criteria.getTotalMin(), criteria.getTotalMax());
        addPredicateFk("orderSupplierType","id", criteria.getOrderSupplierType()==null?null:criteria.getOrderSupplierType().getId());
        addPredicateFk("orderSupplierType","id", criteria.getOrderSupplierTypes());
        addPredicateFk("orderSupplierType","code", criteria.getOrderSupplierType()==null?null:criteria.getOrderSupplierType().getCode());
        addPredicateFk("criticality","id", criteria.getCriticality()==null?null:criteria.getCriticality().getId());
        addPredicateFk("criticality","id", criteria.getCriticalitys());
        addPredicateFk("criticality","code", criteria.getCriticality()==null?null:criteria.getCriticality().getCode());
        addPredicateFk("supplier","id", criteria.getSupplier()==null?null:criteria.getSupplier().getId());
        addPredicateFk("supplier","id", criteria.getSuppliers());
        addPredicateFk("supplier","reference", criteria.getSupplier()==null?null:criteria.getSupplier().getReference());
        addPredicateFk("recipient","id", criteria.getRecipient()==null?null:criteria.getRecipient().getId());
        addPredicateFk("recipient","id", criteria.getRecipients());
        addPredicateFk("recipient","code", criteria.getRecipient()==null?null:criteria.getRecipient().getCode());
        addPredicateFk("purchaser","id", criteria.getPurchaser()==null?null:criteria.getPurchaser().getId());
        addPredicateFk("purchaser","id", criteria.getPurchasers());
        addPredicateFk("purchaser","code", criteria.getPurchaser()==null?null:criteria.getPurchaser().getCode());
        addPredicateFk("currency","id", criteria.getCurrency()==null?null:criteria.getCurrency().getId());
        addPredicateFk("currency","id", criteria.getCurrencys());
        addPredicateFk("currency","code", criteria.getCurrency()==null?null:criteria.getCurrency().getCode());
        addPredicateFk("purchaseOrderStatus","id", criteria.getPurchaseOrderStatus()==null?null:criteria.getPurchaseOrderStatus().getId());
        addPredicateFk("purchaseOrderStatus","id", criteria.getPurchaseOrderStatuss());
        addPredicateFk("purchaseOrderStatus","code", criteria.getPurchaseOrderStatus()==null?null:criteria.getPurchaseOrderStatus().getCode());
        addPredicateFk("purchaseRequest","id", criteria.getPurchaseRequest()==null?null:criteria.getPurchaseRequest().getId());
        addPredicateFk("purchaseRequest","id", criteria.getPurchaseRequests());
        addPredicateFk("purchaseRequest","refrence", criteria.getPurchaseRequest()==null?null:criteria.getPurchaseRequest().getRefrence());
    }

    public PurchaseOrderSpecification(PurchaseOrderCriteria criteria) {
        super(criteria);
    }

    public PurchaseOrderSpecification(PurchaseOrderCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
