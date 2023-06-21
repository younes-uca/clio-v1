package ma.sir.clio.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.Store;
import org.springframework.stereotype.Repository;
import ma.sir.clio.bean.core.Store;
import java.util.List;


@Repository
public interface StoreDao extends AbstractRepository<Store,Long>  {
    Store findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Store(item.id,item.libelle) FROM Store item")
    List<Store> findAllOptimized();
}
