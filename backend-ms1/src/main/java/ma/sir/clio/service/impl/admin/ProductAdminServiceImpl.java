package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.Product;
import ma.sir.clio.bean.history.ProductHistory;
import ma.sir.clio.dao.criteria.core.ProductCriteria;
import ma.sir.clio.dao.criteria.history.ProductHistoryCriteria;
import ma.sir.clio.dao.facade.core.ProductDao;
import ma.sir.clio.dao.facade.history.ProductHistoryDao;
import ma.sir.clio.dao.specification.core.ProductSpecification;
import ma.sir.clio.service.facade.admin.ProductAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.clio.service.facade.admin.ProductFamilyAdminService ;



import java.util.List;
@Service
public class ProductAdminServiceImpl extends AbstractServiceImpl<Product,ProductHistory, ProductCriteria, ProductHistoryCriteria, ProductDao,
ProductHistoryDao> implements ProductAdminService {




    public List<Product> findByProductFamilyId(Long id){
        return dao.findByProductFamilyId(id);
    }
    public int deleteByProductFamilyId(Long id){
        return dao.deleteByProductFamilyId(id);
    }




    public void configure() {
        super.configure(Product.class,ProductHistory.class, ProductHistoryCriteria.class, ProductSpecification.class);
    }

    @Autowired
    private ProductFamilyAdminService productFamilyService ;

    public ProductAdminServiceImpl(ProductDao dao, ProductHistoryDao historyDao) {
        super(dao, historyDao);
    }

}