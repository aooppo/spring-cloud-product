package cc.voox.product.service;

import cc.voox.product.dao.ProductTypeDAO;
import cc.voox.product.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeService {
    @Autowired
    private ProductTypeDAO productTypeDAO;

    public List<ProductType> findAll() {
        return productTypeDAO.findAll();
    }

    public List<ProductType> findByIdIn(List<Long> ids) {
        return productTypeDAO.findByIdIn(ids);
    }

}
