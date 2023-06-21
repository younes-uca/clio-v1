package ma.sir.clio.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.clio.zynerator.repository.AbstractRepository;
import ma.sir.clio.bean.core.OrderSupplierStatus;
import org.springframework.stereotype.Repository;
import ma.sir.clio.bean.core.OrderSupplierStatus;
import java.util.List;


@Repository
public interface OrderSupplierStatusDao extends AbstractRepository<OrderSupplierStatus,Long>  {
    OrderSupplierStatus findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW OrderSupplierStatus(item.id,item.libelle) FROM OrderSupplierStatus item")
    List<OrderSupplierStatus> findAllOptimized();
}
