package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.ProductFamily;
import ma.sir.clio.bean.history.ProductFamilyHistory;
import ma.sir.clio.dao.criteria.core.ProductFamilyCriteria;
import ma.sir.clio.dao.criteria.history.ProductFamilyHistoryCriteria;
import ma.sir.clio.dao.facade.core.ProductFamilyDao;
import ma.sir.clio.dao.facade.history.ProductFamilyHistoryDao;
import ma.sir.clio.dao.specification.core.ProductFamilySpecification;
import ma.sir.clio.service.facade.admin.ProductFamilyAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;







import java.util.List;
@Service
public class ProductFamilyAdminServiceImpl extends AbstractServiceImpl<ProductFamily,ProductFamilyHistory, ProductFamilyCriteria, ProductFamilyHistoryCriteria, ProductFamilyDao,
ProductFamilyHistoryDao> implements ProductFamilyAdminService {



    public ProductFamily findByReferenceEntity(ProductFamily t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(ProductFamily.class,ProductFamilyHistory.class, ProductFamilyHistoryCriteria.class, ProductFamilySpecification.class);
    }


    public ProductFamilyAdminServiceImpl(ProductFamilyDao dao, ProductFamilyHistoryDao historyDao) {
        super(dao, historyDao);
    }

}