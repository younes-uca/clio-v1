package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.UnitePrice;
import ma.sir.clio.bean.history.UnitePriceHistory;
import ma.sir.clio.dao.criteria.core.UnitePriceCriteria;
import ma.sir.clio.dao.criteria.history.UnitePriceHistoryCriteria;
import ma.sir.clio.dao.facade.core.UnitePriceDao;
import ma.sir.clio.dao.facade.history.UnitePriceHistoryDao;
import ma.sir.clio.dao.specification.core.UnitePriceSpecification;
import ma.sir.clio.service.facade.admin.UnitePriceAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;







import java.util.List;
@Service
public class UnitePriceAdminServiceImpl extends AbstractServiceImpl<UnitePrice,UnitePriceHistory, UnitePriceCriteria, UnitePriceHistoryCriteria, UnitePriceDao,
UnitePriceHistoryDao> implements UnitePriceAdminService {



    public UnitePrice findByReferenceEntity(UnitePrice t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(UnitePrice.class,UnitePriceHistory.class, UnitePriceHistoryCriteria.class, UnitePriceSpecification.class);
    }


    public UnitePriceAdminServiceImpl(UnitePriceDao dao, UnitePriceHistoryDao historyDao) {
        super(dao, historyDao);
    }

}