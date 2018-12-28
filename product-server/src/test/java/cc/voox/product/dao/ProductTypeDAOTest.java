package cc.voox.product.dao;

import cc.voox.product.model.ProductType;
import cc.voox.product.server.ProductServerApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.Assert.*;

public class ProductTypeDAOTest extends ProductServerApplicationTests {
    @Autowired
    private ProductTypeDAO productTypeDAO;
//    @Test
    public void saveTypes() {

        ProductType pt = new ProductType();
        pt.setName("computer");

        ProductType pt2 = new ProductType();
        pt2.setName("fruit");


        ProductType pt3 = new ProductType();
        pt3.setName("shoes");


        productTypeDAO.save(pt);
        productTypeDAO.save(pt2);
        productTypeDAO.save(pt3);

    }
//    @Test
    public void update() {
        Optional<ProductType> pt = productTypeDAO.findById(17L);
        pt.get().setName("compu");
        productTypeDAO.save(pt.get());
    }
}