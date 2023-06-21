package ma.sir.clio.service.impl.admin;

import ma.sir.clio.bean.core.Recipient;
import ma.sir.clio.bean.history.RecipientHistory;
import ma.sir.clio.dao.criteria.core.RecipientCriteria;
import ma.sir.clio.dao.criteria.history.RecipientHistoryCriteria;
import ma.sir.clio.dao.facade.core.RecipientDao;
import ma.sir.clio.dao.facade.history.RecipientHistoryDao;
import ma.sir.clio.dao.specification.core.RecipientSpecification;
import ma.sir.clio.service.facade.admin.RecipientAdminService;
import ma.sir.clio.zynerator.service.AbstractServiceImpl;
import ma.sir.clio.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;







import java.util.List;
@Service
public class RecipientAdminServiceImpl extends AbstractServiceImpl<Recipient,RecipientHistory, RecipientCriteria, RecipientHistoryCriteria, RecipientDao,
RecipientHistoryDao> implements RecipientAdminService {



    public Recipient findByReferenceEntity(Recipient t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(Recipient.class,RecipientHistory.class, RecipientHistoryCriteria.class, RecipientSpecification.class);
    }


    public RecipientAdminServiceImpl(RecipientDao dao, RecipientHistoryDao historyDao) {
        super(dao, historyDao);
    }

}