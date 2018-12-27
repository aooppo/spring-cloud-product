package cc.voox.product.dao;

import cc.voox.product.enums.ProductStatus;
import cc.voox.product.model.Product;
import cc.voox.product.model.ProductType;
import cc.voox.product.server.ProductServerApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class ProductDAOTest extends ProductServerApplicationTests {
    @Autowired
    private ProductDAO productDAO;

    @Autowired
    private ProductTypeDAO productTypeDAO;

    @Test
    public void init() {
        ProductType pt1 = productTypeDAO.findByNameContaining("compu");
        Product p1 = new Product();
        p1.setName("apple");
        p1.setProductType(pt1);
        p1.setQty(100D);
        p1.setPrice(new BigDecimal(100.5d));

        Product p2 = new Product();
        p2.setName("mi");
        p2.setProductType(pt1);
        p2.setQty(200D);
        p2.setPrice(new BigDecimal(200.3d));

        Product p3 = new Product();
        p3.setName("dell");
        p3.setProductType(pt1);
        p3.setQty(300D);
        p3.setPrice(new BigDecimal(300));

        ProductType pt2 = productTypeDAO.findByNameContaining("shoes");

        Product p4 = new Product();
        p4.setName("adidas");
        p4.setProductType(pt2);
        p4.setQty(500D);
        p4.setPrice(new BigDecimal(10.2));

        Product p5 = new Product();
        p5.setName("nike");
        p5.setProductType(pt2);
        p5.setQty(600D);
        p5.setPrice(new BigDecimal(1.1));

        productDAO.save(p1);
        productDAO.save(p2);
        productDAO.save(p3);
        productDAO.save(p4);
        productDAO.save(p5);
    }

    @Test
    public void findAllByIdIn() {
        List<Product> ps = productDAO.findAllByIdIn(32L, 33L);
        Assert.assertNotNull(ps);
        System.out.println(ps);
    }
}