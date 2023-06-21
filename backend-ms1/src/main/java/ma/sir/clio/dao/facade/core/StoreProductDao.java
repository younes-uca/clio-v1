package ma.sir.clio.dao.facade.core;

import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.StoreProduct;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface StoreProductDao extends AbstractRepository<StoreProduct,Long>  {

    List<StoreProduct> findByStoreId(Long id);
    int deleteByStoreId(Long id);
    List<StoreProduct> findByProductId(Long id);
    int deleteByProductId(Long id);

}
