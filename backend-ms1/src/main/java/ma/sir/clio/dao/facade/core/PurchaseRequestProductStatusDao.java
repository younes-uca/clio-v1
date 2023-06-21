package ma.sir.clio.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.PurchaseRequestProductStatus;
import org.springframework.stereotype.Repository;
import ma.sir.clio.bean.core.PurchaseRequestProductStatus;
import java.util.List;


@Repository
public interface PurchaseRequestProductStatusDao extends AbstractRepository<PurchaseRequestProductStatus,Long>  {
    PurchaseRequestProductStatus findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW PurchaseRequestProductStatus(item.id,item.libelle) FROM PurchaseRequestProductStatus item")
    List<PurchaseRequestProductStatus> findAllOptimized();
}
