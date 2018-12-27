package cc.voox.product.dao;

import cc.voox.product.enums.ProductStatus;
import cc.voox.product.model.Product;
import cc.voox.product.model.ProductType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDAO extends IBaseDAO<Product> {
      List<Product> findByProductType(ProductType productType);
      List<Product> findAllByIdIn(Long ... ids);

      List<Product> findByProductStatusEquals(ProductStatus status);
}
