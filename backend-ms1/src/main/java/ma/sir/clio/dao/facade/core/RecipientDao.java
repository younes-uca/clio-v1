package ma.sir.clio.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.Recipient;
import org.springframework.stereotype.Repository;
import ma.sir.clio.bean.core.Recipient;
import java.util.List;


@Repository
public interface RecipientDao extends AbstractRepository<Recipient,Long>  {
    Recipient findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Recipient(item.id,item.libelle) FROM Recipient item")
    List<Recipient> findAllOptimized();
}
