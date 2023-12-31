package ma.sir.clio.zynerator.service;

import ma.sir.clio.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.sir.clio.zynerator.criteria.BaseCriteria;
import ma.sir.clio.zynerator.history.HistBusinessObject;
import ma.sir.clio.zynerator.history.HistCriteria;
import ma.sir.clio.zynerator.repository.AbstractHistoryRepository;
import ma.sir.clio.zynerator.repository.AbstractRepository;

public abstract class AbstractReferentielServiceImpl<T extends AuditBusinessObjectEnhanced, H extends HistBusinessObject, CRITERIA extends BaseCriteria, HC extends HistCriteria, REPO extends AbstractRepository<T, Long>, HISTREPO extends AbstractHistoryRepository<H, Long>> extends AbstractServiceImpl<T, H, CRITERIA, HC, REPO, HISTREPO> {

    public AbstractReferentielServiceImpl(REPO dao, HISTREPO historyRepository) {
    super(dao, historyRepository);
    }

}