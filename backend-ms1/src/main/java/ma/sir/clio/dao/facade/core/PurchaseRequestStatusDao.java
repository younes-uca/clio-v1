package ma.sir.clio.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.PurchaseRequestStatus;
import org.springframework.stereotype.Repository;
import ma.sir.clio.bean.core.PurchaseRequestStatus;
import java.util.List;


@Repository
public interface PurchaseRequestStatusDao extends AbstractRepository<PurchaseRequestStatus,Long>  {
    PurchaseRequestStatus findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW PurchaseRequestStatus(item.id,item.libelle) FROM PurchaseRequestStatus item")
    List<PurchaseRequestStatus> findAllOptimized();
}
