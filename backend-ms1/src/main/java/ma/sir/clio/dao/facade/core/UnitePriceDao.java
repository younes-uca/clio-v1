package ma.sir.clio.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.UnitePrice;
import org.springframework.stereotype.Repository;
import ma.sir.clio.bean.core.UnitePrice;
import java.util.List;


@Repository
public interface UnitePriceDao extends AbstractRepository<UnitePrice,Long>  {
    UnitePrice findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW UnitePrice(item.id,item.libelle) FROM UnitePrice item")
    List<UnitePrice> findAllOptimized();
}
