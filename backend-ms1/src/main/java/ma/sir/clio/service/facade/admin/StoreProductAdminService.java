package ma.sir.clio.service.facade.admin;

import java.util.List;
import ma.sir.clio.bean.core.StoreProduct;
import ma.sir.clio.dao.criteria.core.StoreProductCriteria;
import ma.sir.clio.dao.criteria.history.StoreProductHistoryCriteria;
import ma.sir.clio.zynerator.service.IService;


public interface StoreProductAdminService extends  IService<StoreProduct,StoreProductCriteria, StoreProductHistoryCriteria>  {

    List<StoreProduct> findByStoreId(Long id);
    int deleteByStoreId(Long id);
    List<StoreProduct> findByProductId(Long id);
    int deleteByProductId(Long id);



}
