package ma.sir.clio.dao.facade.core;

import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.PurchaseOrderProduct;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PurchaseOrderProductDao extends AbstractRepository<PurchaseOrderProduct,Long>  {

    List<PurchaseOrderProduct> findByProductId(Long id);
    int deleteByProductId(Long id);
    List<PurchaseOrderProduct> findByPurchaseOrderId(Long id);
    int deleteByPurchaseOrderId(Long id);
    List<PurchaseOrderProduct> findByPurchaseOrderProductStatusId(Long id);
    int deleteByPurchaseOrderProductStatusId(Long id);
    List<PurchaseOrderProduct> findByUnitePriceId(Long id);
    int deleteByUnitePriceId(Long id);

}
