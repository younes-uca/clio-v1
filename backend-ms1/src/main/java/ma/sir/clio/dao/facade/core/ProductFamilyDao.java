package ma.sir.clio.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.ProductFamily;
import org.springframework.stereotype.Repository;
import ma.sir.clio.bean.core.ProductFamily;
import java.util.List;


@Repository
public interface ProductFamilyDao extends AbstractRepository<ProductFamily,Long>  {
    ProductFamily findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW ProductFamily(item.id,item.libelle) FROM ProductFamily item")
    List<ProductFamily> findAllOptimized();
}
