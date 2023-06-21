package ma.sir.clio.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.Currency;
import org.springframework.stereotype.Repository;
import ma.sir.clio.bean.core.Currency;
import java.util.List;


@Repository
public interface CurrencyDao extends AbstractRepository<Currency,Long>  {
    Currency findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Currency(item.id,item.libelle) FROM Currency item")
    List<Currency> findAllOptimized();
}
