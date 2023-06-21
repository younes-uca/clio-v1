package ma.sir.clio.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.PurchaseRequest;
import org.springframework.stereotype.Repository;
import ma.sir.clio.bean.core.PurchaseRequest;
import java.util.List;


@Repository
public interface PurchaseRequestDao extends AbstractRepository<PurchaseRequest,Long>  {
    PurchaseRequest findByRefrence(String refrence);
    int deleteByRefrence(String refrence);

    List<PurchaseRequest> findBySupplierId(Long id);
    int deleteBySupplierId(Long id);
    List<PurchaseRequest> findByPurchaseRequestStatusId(Long id);
    int deleteByPurchaseRequestStatusId(Long id);

    @Query("SELECT NEW PurchaseRequest(item.id,item.refrence) FROM PurchaseRequest item")
    List<PurchaseRequest> findAllOptimized();
}
