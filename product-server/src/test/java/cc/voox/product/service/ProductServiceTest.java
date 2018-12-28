package cc.voox.product.service;

import cc.voox.product.model.Product;
import cc.voox.product.server.ProductServerApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ProductServiceTest extends ProductServerApplicationTests {

    @Autowired
    ProductService productService;
//    @Test
    public void findAllByIdIn() {
        List<Product> ps = productService.findAllByIdIn(32L, 33L);
        System.out.println(ps);
    }
}