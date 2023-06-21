package ma.sir.clio.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.Criticality;
import org.springframework.stereotype.Repository;
import ma.sir.clio.bean.core.Criticality;
import java.util.List;


@Repository
public interface CriticalityDao extends AbstractRepository<Criticality,Long>  {
    Criticality findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Criticality(item.id,item.libelle) FROM Criticality item")
    List<Criticality> findAllOptimized();
}
