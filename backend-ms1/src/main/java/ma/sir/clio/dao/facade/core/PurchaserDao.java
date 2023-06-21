package ma.sir.clio.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.Purchaser;
import org.springframework.stereotype.Repository;
import ma.sir.clio.bean.core.Purchaser;
import java.util.List;


@Repository
public interface PurchaserDao extends AbstractRepository<Purchaser,Long>  {
    Purchaser findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Purchaser(item.id,item.libelle) FROM Purchaser item")
    List<Purchaser> findAllOptimized();
}
