package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.PurchaseOrderDelivery;
import ma.sir.clio.bean.history.PurchaseOrderDeliveryHistory;
import ma.sir.clio.dao.criteria.core.PurchaseOrderDeliveryCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseOrderDeliveryHistoryCriteria;
import ma.sir.clio.dao.facade.core.PurchaseOrderDeliveryDao;
import ma.sir.clio.dao.facade.history.PurchaseOrderDeliveryHistoryDao;
import ma.sir.clio.dao.specification.core.PurchaseOrderDeliverySpecification;
import ma.sir.clio.service.facade.admin.PurchaseOrderDeliveryAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.clio.bean.core.PurchaseOrderDeliveryProduct;

import ma.sir.clio.service.facade.admin.PurchaseOrderAdminService ;
import ma.sir.clio.service.facade.admin.PurchaserAdminService ;
import ma.sir.clio.service.facade.admin.OrderSupplierStatusAdminService ;
import ma.sir.clio.service.facade.admin.PurchaseOrderDeliveryProductAdminService ;
import ma.sir.clio.service.facade.admin.OrderSupplierDeliveryStatusAdminService ;



import java.util.List;
@Service
public class PurchaseOrderDeliveryAdminServiceImpl extends AbstractServiceImpl<PurchaseOrderDelivery,PurchaseOrderDeliveryHistory, PurchaseOrderDeliveryCriteria, PurchaseOrderDeliveryHistoryCriteria, PurchaseOrderDeliveryDao,
PurchaseOrderDeliveryHistoryDao> implements PurchaseOrderDeliveryAdminService {


    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public PurchaseOrderDelivery create(PurchaseOrderDelivery t) {
        super.create(t);
        if (t.getPurchaseOrderDeliveryProducts() != null) {
                t.getPurchaseOrderDeliveryProducts().forEach(element-> {
                    element.setPurchaseOrderDelivery(t);
                    purchaseOrderDeliveryProductService.create(element);
            });
        }
        return t;
    }

    public PurchaseOrderDelivery findWithAssociatedLists(Long id){
        PurchaseOrderDelivery result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setPurchaseOrderDeliveryProducts(purchaseOrderDeliveryProductService.findByPurchaseOrderDeliveryId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        purchaseOrderDeliveryProductService.deleteByPurchaseOrderDeliveryId(id);
    }


    public void updateWithAssociatedLists(PurchaseOrderDelivery purchaseOrderDelivery){
    if(purchaseOrderDelivery !=null && purchaseOrderDelivery.getId() != null){
            List<List<PurchaseOrderDeliveryProduct>> resultPurchaseOrderDeliveryProducts= purchaseOrderDeliveryProductService.getToBeSavedAndToBeDeleted(purchaseOrderDeliveryProductService.findByPurchaseOrderDeliveryId(purchaseOrderDelivery.getId()),purchaseOrderDelivery.getPurchaseOrderDeliveryProducts());
            purchaseOrderDeliveryProductService.delete(resultPurchaseOrderDeliveryProducts.get(1));
            ListUtil.emptyIfNull(resultPurchaseOrderDeliveryProducts.get(0)).forEach(e -> e.setPurchaseOrderDelivery(purchaseOrderDelivery));
            purchaseOrderDeliveryProductService.update(resultPurchaseOrderDeliveryProducts.get(0),true);
    }
    }


    public List<PurchaseOrderDelivery> findByPurchaseOrderId(Long id){
        return dao.findByPurchaseOrderId(id);
    }
    public int deleteByPurchaseOrderId(Long id){
        return dao.deleteByPurchaseOrderId(id);
    }
    public List<PurchaseOrderDelivery> findByOrderSupplierStatusId(Long id){
        return dao.findByOrderSupplierStatusId(id);
    }
    public int deleteByOrderSupplierStatusId(Long id){
        return dao.deleteByOrderSupplierStatusId(id);
    }
    public List<PurchaseOrderDelivery> findByPurchaserId(Long id){
        return dao.findByPurchaserId(id);
    }
    public int deleteByPurchaserId(Long id){
        return dao.deleteByPurchaserId(id);
    }
    public List<PurchaseOrderDelivery> findByOrderSupplierDeliveryStatusId(Long id){
        return dao.findByOrderSupplierDeliveryStatusId(id);
    }
    public int deleteByOrderSupplierDeliveryStatusId(Long id){
        return dao.deleteByOrderSupplierDeliveryStatusId(id);
    }




    public void configure() {
        super.configure(PurchaseOrderDelivery.class,PurchaseOrderDeliveryHistory.class, PurchaseOrderDeliveryHistoryCriteria.class, PurchaseOrderDeliverySpecification.class);
    }

    @Autowired
    private PurchaseOrderAdminService purchaseOrderService ;
    @Autowired
    private PurchaserAdminService purchaserService ;
    @Autowired
    private OrderSupplierStatusAdminService orderSupplierStatusService ;
    @Autowired
    private PurchaseOrderDeliveryProductAdminService purchaseOrderDeliveryProductService ;
    @Autowired
    private OrderSupplierDeliveryStatusAdminService orderSupplierDeliveryStatusService ;

    public PurchaseOrderDeliveryAdminServiceImpl(PurchaseOrderDeliveryDao dao, PurchaseOrderDeliveryHistoryDao historyDao) {
        super(dao, historyDao);
    }

}