package ma.sir.clio.dao.facade.core;

import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.PurchaseRequestProduct;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PurchaseRequestProductDao extends AbstractRepository<PurchaseRequestProduct,Long>  {

    List<PurchaseRequestProduct> findByProductId(Long id);
    int deleteByProductId(Long id);
    List<PurchaseRequestProduct> findByPurchaseRequestId(Long id);
    int deleteByPurchaseRequestId(Long id);
    List<PurchaseRequestProduct> findByUnitePriceId(Long id);
    int deleteByUnitePriceId(Long id);
    List<PurchaseRequestProduct> findByPurchaseRequestProductStatusId(Long id);
    int deleteByPurchaseRequestProductStatusId(Long id);

}
