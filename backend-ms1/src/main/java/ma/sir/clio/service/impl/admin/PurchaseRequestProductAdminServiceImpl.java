package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.PurchaseRequestProduct;
import ma.sir.clio.bean.history.PurchaseRequestProductHistory;
import ma.sir.clio.dao.criteria.core.PurchaseRequestProductCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseRequestProductHistoryCriteria;
import ma.sir.clio.dao.facade.core.PurchaseRequestProductDao;
import ma.sir.clio.dao.facade.history.PurchaseRequestProductHistoryDao;
import ma.sir.clio.dao.specification.core.PurchaseRequestProductSpecification;
import ma.sir.clio.service.facade.admin.PurchaseRequestProductAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.clio.service.facade.admin.PurchaseRequestAdminService ;
import ma.sir.clio.service.facade.admin.UnitePriceAdminService ;
import ma.sir.clio.service.facade.admin.ProductAdminService ;
import ma.sir.clio.service.facade.admin.PurchaseRequestProductStatusAdminService ;



import java.util.List;
@Service
public class PurchaseRequestProductAdminServiceImpl extends AbstractServiceImpl<PurchaseRequestProduct,PurchaseRequestProductHistory, PurchaseRequestProductCriteria, PurchaseRequestProductHistoryCriteria, PurchaseRequestProductDao,
PurchaseRequestProductHistoryDao> implements PurchaseRequestProductAdminService {




    public List<PurchaseRequestProduct> findByProductId(Long id){
        return dao.findByProductId(id);
    }
    public int deleteByProductId(Long id){
        return dao.deleteByProductId(id);
    }
    public List<PurchaseRequestProduct> findByPurchaseRequestId(Long id){
        return dao.findByPurchaseRequestId(id);
    }
    public int deleteByPurchaseRequestId(Long id){
        return dao.deleteByPurchaseRequestId(id);
    }
    public List<PurchaseRequestProduct> findByUnitePriceId(Long id){
        return dao.findByUnitePriceId(id);
    }
    public int deleteByUnitePriceId(Long id){
        return dao.deleteByUnitePriceId(id);
    }
    public List<PurchaseRequestProduct> findByPurchaseRequestProductStatusId(Long id){
        return dao.findByPurchaseRequestProductStatusId(id);
    }
    public int deleteByPurchaseRequestProductStatusId(Long id){
        return dao.deleteByPurchaseRequestProductStatusId(id);
    }




    public void configure() {
        super.configure(PurchaseRequestProduct.class,PurchaseRequestProductHistory.class, PurchaseRequestProductHistoryCriteria.class, PurchaseRequestProductSpecification.class);
    }

    @Autowired
    private PurchaseRequestAdminService purchaseRequestService ;
    @Autowired
    private UnitePriceAdminService unitePriceService ;
    @Autowired
    private ProductAdminService productService ;
    @Autowired
    private PurchaseRequestProductStatusAdminService purchaseRequestProductStatusService ;

    public PurchaseRequestProductAdminServiceImpl(PurchaseRequestProductDao dao, PurchaseRequestProductHistoryDao historyDao) {
        super(dao, historyDao);
    }

}