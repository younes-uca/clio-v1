package ma.sir.clio.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.Supplier;
import org.springframework.stereotype.Repository;
import ma.sir.clio.bean.core.Supplier;
import java.util.List;


@Repository
public interface SupplierDao extends AbstractRepository<Supplier,Long>  {
    Supplier findByReference(String reference);
    int deleteByReference(String reference);


    @Query("SELECT NEW Supplier(item.id,item.reference) FROM Supplier item")
    List<Supplier> findAllOptimized();
}
