package cc.voox.product.controller;

import cc.voox.product.service.ProductService;
import cc.voox.product.vo.ProductOutput;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("list")
    List<ProductOutput> list() {
        List<ProductOutput> list = new ArrayList<>();
        productService.getAll().forEach(p -> {
            ProductOutput po = new ProductOutput();
            BeanUtils.copyProperties(p, po);
            po.setName("Product: "+po.getName());
            list.add(po);
        });
        return list;
    }
}
