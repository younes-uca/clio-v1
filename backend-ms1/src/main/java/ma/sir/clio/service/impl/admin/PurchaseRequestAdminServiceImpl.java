package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.PurchaseRequest;
import ma.sir.clio.bean.history.PurchaseRequestHistory;
import ma.sir.clio.dao.criteria.core.PurchaseRequestCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseRequestHistoryCriteria;
import ma.sir.clio.dao.facade.core.PurchaseRequestDao;
import ma.sir.clio.dao.facade.history.PurchaseRequestHistoryDao;
import ma.sir.clio.dao.specification.core.PurchaseRequestSpecification;
import ma.sir.clio.service.facade.admin.PurchaseRequestAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.clio.bean.core.PurchaseRequestProduct;

import ma.sir.clio.service.facade.admin.SupplierAdminService ;
import ma.sir.clio.service.facade.admin.PurchaseRequestStatusAdminService ;
import ma.sir.clio.service.facade.admin.PurchaseRequestProductAdminService ;



import java.util.List;
@Service
public class PurchaseRequestAdminServiceImpl extends AbstractServiceImpl<PurchaseRequest,PurchaseRequestHistory, PurchaseRequestCriteria, PurchaseRequestHistoryCriteria, PurchaseRequestDao,
PurchaseRequestHistoryDao> implements PurchaseRequestAdminService {


    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public PurchaseRequest create(PurchaseRequest t) {
        super.create(t);
        if (t.getPurchaseRequestProducts() != null) {
                t.getPurchaseRequestProducts().forEach(element-> {
                    element.setPurchaseRequest(t);
                    purchaseRequestProductService.create(element);
            });
        }
        return t;
    }

    public PurchaseRequest findWithAssociatedLists(Long id){
        PurchaseRequest result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setPurchaseRequestProducts(purchaseRequestProductService.findByPurchaseRequestId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        purchaseRequestProductService.deleteByPurchaseRequestId(id);
    }


    public void updateWithAssociatedLists(PurchaseRequest purchaseRequest){
    if(purchaseRequest !=null && purchaseRequest.getId() != null){
            List<List<PurchaseRequestProduct>> resultPurchaseRequestProducts= purchaseRequestProductService.getToBeSavedAndToBeDeleted(purchaseRequestProductService.findByPurchaseRequestId(purchaseRequest.getId()),purchaseRequest.getPurchaseRequestProducts());
            purchaseRequestProductService.delete(resultPurchaseRequestProducts.get(1));
            ListUtil.emptyIfNull(resultPurchaseRequestProducts.get(0)).forEach(e -> e.setPurchaseRequest(purchaseRequest));
            purchaseRequestProductService.update(resultPurchaseRequestProducts.get(0),true);
    }
    }

    public PurchaseRequest findByReferenceEntity(PurchaseRequest t){
        return  dao.findByRefrence(t.getRefrence());
    }

    public List<PurchaseRequest> findBySupplierId(Long id){
        return dao.findBySupplierId(id);
    }
    public int deleteBySupplierId(Long id){
        return dao.deleteBySupplierId(id);
    }
    public List<PurchaseRequest> findByPurchaseRequestStatusId(Long id){
        return dao.findByPurchaseRequestStatusId(id);
    }
    public int deleteByPurchaseRequestStatusId(Long id){
        return dao.deleteByPurchaseRequestStatusId(id);
    }




    public void configure() {
        super.configure(PurchaseRequest.class,PurchaseRequestHistory.class, PurchaseRequestHistoryCriteria.class, PurchaseRequestSpecification.class);
    }

    @Autowired
    private SupplierAdminService supplierService ;
    @Autowired
    private PurchaseRequestStatusAdminService purchaseRequestStatusService ;
    @Autowired
    private PurchaseRequestProductAdminService purchaseRequestProductService ;

    public PurchaseRequestAdminServiceImpl(PurchaseRequestDao dao, PurchaseRequestHistoryDao historyDao) {
        super(dao, historyDao);
    }

}