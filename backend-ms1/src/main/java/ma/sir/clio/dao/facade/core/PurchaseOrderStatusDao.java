package ma.sir.clio.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.PurchaseOrderStatus;
import org.springframework.stereotype.Repository;
import ma.sir.clio.bean.core.PurchaseOrderStatus;
import java.util.List;


@Repository
public interface PurchaseOrderStatusDao extends AbstractRepository<PurchaseOrderStatus,Long>  {
    PurchaseOrderStatus findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW PurchaseOrderStatus(item.id,item.libelle) FROM PurchaseOrderStatus item")
    List<PurchaseOrderStatus> findAllOptimized();
}
