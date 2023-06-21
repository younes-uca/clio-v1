package  ma.sir.clio.dao.specification.core;

import ma.sir.clio.zynerator.specification.AbstractSpecification;
import ma.sir.clio.dao.criteria.core.PurchaseRequestCriteria;
import ma.sir.clio.bean.core.PurchaseRequest;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PurchaseRequestSpecification extends  AbstractSpecification<PurchaseRequestCriteria, PurchaseRequest>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("refrence", criteria.getRefrence(),criteria.getRefrenceLike());
        addPredicateBigDecimal("montantDevis", criteria.getMontantDevis(), criteria.getMontantDevisMin(), criteria.getMontantDevisMax());
        addPredicate("datePurchaseRequest", criteria.getDatePurchaseRequest(), criteria.getDatePurchaseRequestFrom(), criteria.getDatePurchaseRequestTo());
        addPredicate("dateLivraison", criteria.getDateLivraison(), criteria.getDateLivraisonFrom(), criteria.getDateLivraisonTo());
        addPredicateBigDecimal("montantAchat", criteria.getMontantAchat(), criteria.getMontantAchatMin(), criteria.getMontantAchatMax());
        addPredicateFk("supplier","id", criteria.getSupplier()==null?null:criteria.getSupplier().getId());
        addPredicateFk("supplier","id", criteria.getSuppliers());
        addPredicateFk("supplier","reference", criteria.getSupplier()==null?null:criteria.getSupplier().getReference());
        addPredicateFk("purchaseRequestStatus","id", criteria.getPurchaseRequestStatus()==null?null:criteria.getPurchaseRequestStatus().getId());
        addPredicateFk("purchaseRequestStatus","id", criteria.getPurchaseRequestStatuss());
        addPredicateFk("purchaseRequestStatus","code", criteria.getPurchaseRequestStatus()==null?null:criteria.getPurchaseRequestStatus().getCode());
    }

    public PurchaseRequestSpecification(PurchaseRequestCriteria criteria) {
        super(criteria);
    }

    public PurchaseRequestSpecification(PurchaseRequestCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
