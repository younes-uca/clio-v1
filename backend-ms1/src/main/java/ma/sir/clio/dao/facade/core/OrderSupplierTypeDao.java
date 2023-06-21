package ma.sir.clio.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.OrderSupplierType;
import org.springframework.stereotype.Repository;
import ma.sir.clio.bean.core.OrderSupplierType;
import java.util.List;


@Repository
public interface OrderSupplierTypeDao extends AbstractRepository<OrderSupplierType,Long>  {
    OrderSupplierType findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW OrderSupplierType(item.id,item.libelle) FROM OrderSupplierType item")
    List<OrderSupplierType> findAllOptimized();
}
