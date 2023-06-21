package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.PurchaseOrder;
import ma.sir.clio.bean.history.PurchaseOrderHistory;
import ma.sir.clio.dao.criteria.core.PurchaseOrderCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseOrderHistoryCriteria;
import ma.sir.clio.dao.facade.core.PurchaseOrderDao;
import ma.sir.clio.dao.facade.history.PurchaseOrderHistoryDao;
import ma.sir.clio.dao.specification.core.PurchaseOrderSpecification;
import ma.sir.clio.service.facade.admin.PurchaseOrderAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.clio.bean.core.PurchaseOrderProduct;

import ma.sir.clio.service.facade.admin.PurchaserAdminService ;
import ma.sir.clio.service.facade.admin.PurchaseRequestAdminService ;
import ma.sir.clio.service.facade.admin.PurchaseOrderStatusAdminService ;
import ma.sir.clio.service.facade.admin.SupplierAdminService ;
import ma.sir.clio.service.facade.admin.OrderSupplierTypeAdminService ;
import ma.sir.clio.service.facade.admin.CurrencyAdminService ;
import ma.sir.clio.service.facade.admin.PurchaseOrderProductAdminService ;
import ma.sir.clio.service.facade.admin.RecipientAdminService ;
import ma.sir.clio.service.facade.admin.CriticalityAdminService ;



import java.util.List;
@Service
public class PurchaseOrderAdminServiceImpl extends AbstractServiceImpl<PurchaseOrder,PurchaseOrderHistory, PurchaseOrderCriteria, PurchaseOrderHistoryCriteria, PurchaseOrderDao,
PurchaseOrderHistoryDao> implements PurchaseOrderAdminService {


    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public PurchaseOrder create(PurchaseOrder t) {
        super.create(t);
        if (t.getPurchaseOrderProducts() != null) {
                t.getPurchaseOrderProducts().forEach(element-> {
                    element.setPurchaseOrder(t);
                    purchaseOrderProductService.create(element);
            });
        }
        return t;
    }

    public PurchaseOrder findWithAssociatedLists(Long id){
        PurchaseOrder result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setPurchaseOrderProducts(purchaseOrderProductService.findByPurchaseOrderId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        purchaseOrderProductService.deleteByPurchaseOrderId(id);
    }


    public void updateWithAssociatedLists(PurchaseOrder purchaseOrder){
    if(purchaseOrder !=null && purchaseOrder.getId() != null){
            List<List<PurchaseOrderProduct>> resultPurchaseOrderProducts= purchaseOrderProductService.getToBeSavedAndToBeDeleted(purchaseOrderProductService.findByPurchaseOrderId(purchaseOrder.getId()),purchaseOrder.getPurchaseOrderProducts());
            purchaseOrderProductService.delete(resultPurchaseOrderProducts.get(1));
            ListUtil.emptyIfNull(resultPurchaseOrderProducts.get(0)).forEach(e -> e.setPurchaseOrder(purchaseOrder));
            purchaseOrderProductService.update(resultPurchaseOrderProducts.get(0),true);
    }
    }

    public PurchaseOrder findByReferenceEntity(PurchaseOrder t){
        return  dao.findByRefrence(t.getRefrence());
    }

    public List<PurchaseOrder> findByOrderSupplierTypeId(Long id){
        return dao.findByOrderSupplierTypeId(id);
    }
    public int deleteByOrderSupplierTypeId(Long id){
        return dao.deleteByOrderSupplierTypeId(id);
    }
    public List<PurchaseOrder> findByCriticalityId(Long id){
        return dao.findByCriticalityId(id);
    }
    public int deleteByCriticalityId(Long id){
        return dao.deleteByCriticalityId(id);
    }
    public List<PurchaseOrder> findBySupplierId(Long id){
        return dao.findBySupplierId(id);
    }
    public int deleteBySupplierId(Long id){
        return dao.deleteBySupplierId(id);
    }
    public List<PurchaseOrder> findByRecipientId(Long id){
        return dao.findByRecipientId(id);
    }
    public int deleteByRecipientId(Long id){
        return dao.deleteByRecipientId(id);
    }
    public List<PurchaseOrder> findByPurchaserId(Long id){
        return dao.findByPurchaserId(id);
    }
    public int deleteByPurchaserId(Long id){
        return dao.deleteByPurchaserId(id);
    }
    public List<PurchaseOrder> findByCurrencyId(Long id){
        return dao.findByCurrencyId(id);
    }
    public int deleteByCurrencyId(Long id){
        return dao.deleteByCurrencyId(id);
    }
    public List<PurchaseOrder> findByPurchaseOrderStatusId(Long id){
        return dao.findByPurchaseOrderStatusId(id);
    }
    public int deleteByPurchaseOrderStatusId(Long id){
        return dao.deleteByPurchaseOrderStatusId(id);
    }
    public List<PurchaseOrder> findByPurchaseRequestId(Long id){
        return dao.findByPurchaseRequestId(id);
    }
    public int deleteByPurchaseRequestId(Long id){
        return dao.deleteByPurchaseRequestId(id);
    }




    public void configure() {
        super.configure(PurchaseOrder.class,PurchaseOrderHistory.class, PurchaseOrderHistoryCriteria.class, PurchaseOrderSpecification.class);
    }

    @Autowired
    private PurchaserAdminService purchaserService ;
    @Autowired
    private PurchaseRequestAdminService purchaseRequestService ;
    @Autowired
    private PurchaseOrderStatusAdminService purchaseOrderStatusService ;
    @Autowired
    private SupplierAdminService supplierService ;
    @Autowired
    private OrderSupplierTypeAdminService orderSupplierTypeService ;
    @Autowired
    private CurrencyAdminService currencyService ;
    @Autowired
    private PurchaseOrderProductAdminService purchaseOrderProductService ;
    @Autowired
    private RecipientAdminService recipientService ;
    @Autowired
    private CriticalityAdminService criticalityService ;

    public PurchaseOrderAdminServiceImpl(PurchaseOrderDao dao, PurchaseOrderHistoryDao historyDao) {
        super(dao, historyDao);
    }

}