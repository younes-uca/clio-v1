package ma.sir.clio.dao.facade.core;

import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.Product;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ProductDao extends AbstractRepository<Product,Long>  {

    List<Product> findByProductFamilyId(Long id);
    int deleteByProductFamilyId(Long id);

}
