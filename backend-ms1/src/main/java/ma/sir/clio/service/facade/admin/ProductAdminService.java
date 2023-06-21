package ma.sir.clio.service.facade.admin;

import java.util.List;
import ma.sir.clio.bean.core.Product;
import ma.sir.clio.dao.criteria.core.ProductCriteria;
import ma.sir.clio.dao.criteria.history.ProductHistoryCriteria;
import ma.sir.clio.zynerator.service.IService;


public interface ProductAdminService extends  IService<Product,ProductCriteria, ProductHistoryCriteria>  {

    List<Product> findByProductFamilyId(Long id);
    int deleteByProductFamilyId(Long id);



}
