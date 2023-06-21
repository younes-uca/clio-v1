package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.StoreProduct;
import ma.sir.clio.bean.history.StoreProductHistory;
import ma.sir.clio.dao.criteria.core.StoreProductCriteria;
import ma.sir.clio.dao.criteria.history.StoreProductHistoryCriteria;
import ma.sir.clio.dao.facade.core.StoreProductDao;
import ma.sir.clio.dao.facade.history.StoreProductHistoryDao;
import ma.sir.clio.dao.specification.core.StoreProductSpecification;
import ma.sir.clio.service.facade.admin.StoreProductAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.clio.service.facade.admin.StoreAdminService ;
import ma.sir.clio.service.facade.admin.ProductAdminService ;



import java.util.List;
@Service
public class StoreProductAdminServiceImpl extends AbstractServiceImpl<StoreProduct,StoreProductHistory, StoreProductCriteria, StoreProductHistoryCriteria, StoreProductDao,
StoreProductHistoryDao> implements StoreProductAdminService {




    public List<StoreProduct> findByStoreId(Long id){
        return dao.findByStoreId(id);
    }
    public int deleteByStoreId(Long id){
        return dao.deleteByStoreId(id);
    }
    public List<StoreProduct> findByProductId(Long id){
        return dao.findByProductId(id);
    }
    public int deleteByProductId(Long id){
        return dao.deleteByProductId(id);
    }




    public void configure() {
        super.configure(StoreProduct.class,StoreProductHistory.class, StoreProductHistoryCriteria.class, StoreProductSpecification.class);
    }

    @Autowired
    private StoreAdminService storeService ;
    @Autowired
    private ProductAdminService productService ;

    public StoreProductAdminServiceImpl(StoreProductDao dao, StoreProductHistoryDao historyDao) {
        super(dao, historyDao);
    }

}