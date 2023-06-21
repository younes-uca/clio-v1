package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.Supplier;
import ma.sir.clio.bean.history.SupplierHistory;
import ma.sir.clio.dao.criteria.core.SupplierCriteria;
import ma.sir.clio.dao.criteria.history.SupplierHistoryCriteria;
import ma.sir.clio.dao.facade.core.SupplierDao;
import ma.sir.clio.dao.facade.history.SupplierHistoryDao;
import ma.sir.clio.dao.specification.core.SupplierSpecification;
import ma.sir.clio.service.facade.admin.SupplierAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;







import java.util.List;
@Service
public class SupplierAdminServiceImpl extends AbstractServiceImpl<Supplier,SupplierHistory, SupplierCriteria, SupplierHistoryCriteria, SupplierDao,
SupplierHistoryDao> implements SupplierAdminService {



    public Supplier findByReferenceEntity(Supplier t){
        return  dao.findByReference(t.getReference());
    }





    public void configure() {
        super.configure(Supplier.class,SupplierHistory.class, SupplierHistoryCriteria.class, SupplierSpecification.class);
    }


    public SupplierAdminServiceImpl(SupplierDao dao, SupplierHistoryDao historyDao) {
        super(dao, historyDao);
    }

}