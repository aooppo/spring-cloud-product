package cc.voox.product.service;

import cc.voox.product.dao.ProductDAO;
import cc.voox.product.enums.ProductStatus;
import cc.voox.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductDAO productDAO;

    public List<Product> findAllByIdIn(Long... ids) {
        return productDAO.findAllByIdIn(ids);
    }

    public List<Product> getAll() {
        return productDAO.findAll();
    }

    public List<Product> findUpAll() {
        return productDAO.findByProductStatusEquals(ProductStatus.UP);
    }
}
