package  ma.sir.clio.dao.specification.core;

import ma.sir.clio.zynerator.specification.AbstractSpecification;
import ma.sir.clio.dao.criteria.core.PurchaseOrderDeliveryCriteria;
import ma.sir.clio.bean.core.PurchaseOrderDelivery;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PurchaseOrderDeliverySpecification extends  AbstractSpecification<PurchaseOrderDeliveryCriteria, PurchaseOrderDelivery>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBigDecimal("total", criteria.getTotal(), criteria.getTotalMin(), criteria.getTotalMax());
        addPredicate("dateDelivery", criteria.getDateDelivery(), criteria.getDateDeliveryFrom(), criteria.getDateDeliveryTo());
        addPredicate("invoiceAck", criteria.getInvoiceAck(), criteria.getInvoiceAckFrom(), criteria.getInvoiceAckTo());
        addPredicate("invoiceAckNumber", criteria.getInvoiceAckNumber(),criteria.getInvoiceAckNumberLike());
        addPredicate("invoicePrNumber", criteria.getInvoicePrNumber(),criteria.getInvoicePrNumberLike());
        addPredicate("invoiceDate", criteria.getInvoiceDate(), criteria.getInvoiceDateFrom(), criteria.getInvoiceDateTo());
        addPredicate("invoiceAckDelivery", criteria.getInvoiceAckDelivery(), criteria.getInvoiceAckDeliveryFrom(), criteria.getInvoiceAckDeliveryTo());
        addPredicate("invoiceNumber", criteria.getInvoiceNumber(),criteria.getInvoiceNumberLike());
        addPredicateFk("purchaseOrder","id", criteria.getPurchaseOrder()==null?null:criteria.getPurchaseOrder().getId());
        addPredicateFk("purchaseOrder","id", criteria.getPurchaseOrders());
        addPredicateFk("purchaseOrder","refrence", criteria.getPurchaseOrder()==null?null:criteria.getPurchaseOrder().getRefrence());
        addPredicateFk("orderSupplierStatus","id", criteria.getOrderSupplierStatus()==null?null:criteria.getOrderSupplierStatus().getId());
        addPredicateFk("orderSupplierStatus","id", criteria.getOrderSupplierStatuss());
        addPredicateFk("orderSupplierStatus","code", criteria.getOrderSupplierStatus()==null?null:criteria.getOrderSupplierStatus().getCode());
        addPredicateFk("purchaser","id", criteria.getPurchaser()==null?null:criteria.getPurchaser().getId());
        addPredicateFk("purchaser","id", criteria.getPurchasers());
        addPredicateFk("purchaser","code", criteria.getPurchaser()==null?null:criteria.getPurchaser().getCode());
        addPredicateFk("orderSupplierDeliveryStatus","id", criteria.getOrderSupplierDeliveryStatus()==null?null:criteria.getOrderSupplierDeliveryStatus().getId());
        addPredicateFk("orderSupplierDeliveryStatus","id", criteria.getOrderSupplierDeliveryStatuss());
        addPredicateFk("orderSupplierDeliveryStatus","code", criteria.getOrderSupplierDeliveryStatus()==null?null:criteria.getOrderSupplierDeliveryStatus().getCode());
    }

    public PurchaseOrderDeliverySpecification(PurchaseOrderDeliveryCriteria criteria) {
        super(criteria);
    }

    public PurchaseOrderDeliverySpecification(PurchaseOrderDeliveryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
