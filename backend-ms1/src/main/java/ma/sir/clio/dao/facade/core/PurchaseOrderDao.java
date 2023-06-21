package ma.sir.clio.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.PurchaseOrder;
import org.springframework.stereotype.Repository;
import ma.sir.clio.bean.core.PurchaseOrder;
import java.util.List;


@Repository
public interface PurchaseOrderDao extends AbstractRepository<PurchaseOrder,Long>  {
    PurchaseOrder findByRefrence(String refrence);
    int deleteByRefrence(String refrence);

    List<PurchaseOrder> findByOrderSupplierTypeId(Long id);
    int deleteByOrderSupplierTypeId(Long id);
    List<PurchaseOrder> findByCriticalityId(Long id);
    int deleteByCriticalityId(Long id);
    List<PurchaseOrder> findBySupplierId(Long id);
    int deleteBySupplierId(Long id);
    List<PurchaseOrder> findByRecipientId(Long id);
    int deleteByRecipientId(Long id);
    List<PurchaseOrder> findByPurchaserId(Long id);
    int deleteByPurchaserId(Long id);
    List<PurchaseOrder> findByCurrencyId(Long id);
    int deleteByCurrencyId(Long id);
    List<PurchaseOrder> findByPurchaseOrderStatusId(Long id);
    int deleteByPurchaseOrderStatusId(Long id);
    List<PurchaseOrder> findByPurchaseRequestId(Long id);
    int deleteByPurchaseRequestId(Long id);

    @Query("SELECT NEW PurchaseOrder(item.id,item.refrence) FROM PurchaseOrder item")
    List<PurchaseOrder> findAllOptimized();
}
