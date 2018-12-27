package cc.voox.product.dao;

import cc.voox.product.model.ProductType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductTypeDAO extends IBaseDAO<ProductType> {
    ProductType findByNameContaining(String name);

    List<ProductType> findByIdIn(List<Long> ids);

}
