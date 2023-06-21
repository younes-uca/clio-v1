package ma.sir.clio.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.PurchaseOrderProductStatus;
import org.springframework.stereotype.Repository;
import ma.sir.clio.bean.core.PurchaseOrderProductStatus;
import java.util.List;


@Repository
public interface PurchaseOrderProductStatusDao extends AbstractRepository<PurchaseOrderProductStatus,Long>  {
    PurchaseOrderProductStatus findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW PurchaseOrderProductStatus(item.id,item.libelle) FROM PurchaseOrderProductStatus item")
    List<PurchaseOrderProductStatus> findAllOptimized();
}
