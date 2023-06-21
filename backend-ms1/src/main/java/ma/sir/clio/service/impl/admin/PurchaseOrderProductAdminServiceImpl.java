package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.PurchaseOrderProduct;
import ma.sir.clio.bean.history.PurchaseOrderProductHistory;
import ma.sir.clio.dao.criteria.core.PurchaseOrderProductCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseOrderProductHistoryCriteria;
import ma.sir.clio.dao.facade.core.PurchaseOrderProductDao;
import ma.sir.clio.dao.facade.history.PurchaseOrderProductHistoryDao;
import ma.sir.clio.dao.specification.core.PurchaseOrderProductSpecification;
import ma.sir.clio.service.facade.admin.PurchaseOrderProductAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.clio.service.facade.admin.PurchaseOrderAdminService ;
import ma.sir.clio.service.facade.admin.PurchaseOrderProductStatusAdminService ;
import ma.sir.clio.service.facade.admin.UnitePriceAdminService ;
import ma.sir.clio.service.facade.admin.ProductAdminService ;



import java.util.List;
@Service
public class PurchaseOrderProductAdminServiceImpl extends AbstractServiceImpl<PurchaseOrderProduct,PurchaseOrderProductHistory, PurchaseOrderProductCriteria, PurchaseOrderProductHistoryCriteria, PurchaseOrderProductDao,
PurchaseOrderProductHistoryDao> implements PurchaseOrderProductAdminService {




    public List<PurchaseOrderProduct> findByProductId(Long id){
        return dao.findByProductId(id);
    }
    public int deleteByProductId(Long id){
        return dao.deleteByProductId(id);
    }
    public List<PurchaseOrderProduct> findByPurchaseOrderId(Long id){
        return dao.findByPurchaseOrderId(id);
    }
    public int deleteByPurchaseOrderId(Long id){
        return dao.deleteByPurchaseOrderId(id);
    }
    public List<PurchaseOrderProduct> findByPurchaseOrderProductStatusId(Long id){
        return dao.findByPurchaseOrderProductStatusId(id);
    }
    public int deleteByPurchaseOrderProductStatusId(Long id){
        return dao.deleteByPurchaseOrderProductStatusId(id);
    }
    public List<PurchaseOrderProduct> findByUnitePriceId(Long id){
        return dao.findByUnitePriceId(id);
    }
    public int deleteByUnitePriceId(Long id){
        return dao.deleteByUnitePriceId(id);
    }




    public void configure() {
        super.configure(PurchaseOrderProduct.class,PurchaseOrderProductHistory.class, PurchaseOrderProductHistoryCriteria.class, PurchaseOrderProductSpecification.class);
    }

    @Autowired
    private PurchaseOrderAdminService purchaseOrderService ;
    @Autowired
    private PurchaseOrderProductStatusAdminService purchaseOrderProductStatusService ;
    @Autowired
    private UnitePriceAdminService unitePriceService ;
    @Autowired
    private ProductAdminService productService ;

    public PurchaseOrderProductAdminServiceImpl(PurchaseOrderProductDao dao, PurchaseOrderProductHistoryDao historyDao) {
        super(dao, historyDao);
    }

}