package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.PurchaseOrderDeliveryProduct;
import ma.sir.clio.bean.history.PurchaseOrderDeliveryProductHistory;
import ma.sir.clio.dao.criteria.core.PurchaseOrderDeliveryProductCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseOrderDeliveryProductHistoryCriteria;
import ma.sir.clio.dao.facade.core.PurchaseOrderDeliveryProductDao;
import ma.sir.clio.dao.facade.history.PurchaseOrderDeliveryProductHistoryDao;
import ma.sir.clio.dao.specification.core.PurchaseOrderDeliveryProductSpecification;
import ma.sir.clio.service.facade.admin.PurchaseOrderDeliveryProductAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.clio.service.facade.admin.PurchaseOrderDeliveryAdminService ;
import ma.sir.clio.service.facade.admin.StoreAdminService ;
import ma.sir.clio.service.facade.admin.ProductAdminService ;



import java.util.List;
@Service
public class PurchaseOrderDeliveryProductAdminServiceImpl extends AbstractServiceImpl<PurchaseOrderDeliveryProduct,PurchaseOrderDeliveryProductHistory, PurchaseOrderDeliveryProductCriteria, PurchaseOrderDeliveryProductHistoryCriteria, PurchaseOrderDeliveryProductDao,
PurchaseOrderDeliveryProductHistoryDao> implements PurchaseOrderDeliveryProductAdminService {




    public List<PurchaseOrderDeliveryProduct> findByProductId(Long id){
        return dao.findByProductId(id);
    }
    public int deleteByProductId(Long id){
        return dao.deleteByProductId(id);
    }
    public List<PurchaseOrderDeliveryProduct> findByPurchaseOrderDeliveryId(Long id){
        return dao.findByPurchaseOrderDeliveryId(id);
    }
    public int deleteByPurchaseOrderDeliveryId(Long id){
        return dao.deleteByPurchaseOrderDeliveryId(id);
    }
    public List<PurchaseOrderDeliveryProduct> findByStoreId(Long id){
        return dao.findByStoreId(id);
    }
    public int deleteByStoreId(Long id){
        return dao.deleteByStoreId(id);
    }




    public void configure() {
        super.configure(PurchaseOrderDeliveryProduct.class,PurchaseOrderDeliveryProductHistory.class, PurchaseOrderDeliveryProductHistoryCriteria.class, PurchaseOrderDeliveryProductSpecification.class);
    }

    @Autowired
    private PurchaseOrderDeliveryAdminService purchaseOrderDeliveryService ;
    @Autowired
    private StoreAdminService storeService ;
    @Autowired
    private ProductAdminService productService ;

    public PurchaseOrderDeliveryProductAdminServiceImpl(PurchaseOrderDeliveryProductDao dao, PurchaseOrderDeliveryProductHistoryDao historyDao) {
        super(dao, historyDao);
    }

}