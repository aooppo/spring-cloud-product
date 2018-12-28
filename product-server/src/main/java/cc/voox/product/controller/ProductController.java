package cc.voox.product.controller;

import cc.voox.product.model.Product;
import cc.voox.product.model.ProductType;
import cc.voox.product.service.ProductService;
import cc.voox.product.service.ProductTypeService;
import cc.voox.product.utils.ResultUtils;
import cc.voox.product.vo.ProductOutput;
import cc.voox.product.vo.ProductVO;
import cc.voox.product.vo.ProductsVO;
import cc.voox.product.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private ProductTypeService productTypeService;

    @RequestMapping("list")
    public ResultVO<ProductsVO> list() {
        List<Product> ps = productService.findUpAll();
        Set<ProductType> pts = ps.stream().map(Product::getProductType).collect(Collectors.toSet());
        List<ProductsVO> productsVOS = new ArrayList<>();
        for(ProductType pt : pts) {
            ProductsVO pvo = new ProductsVO();
            pvo.setProductTypeName(pt.getName());
            pvo.setType(pt.getId());
            List<ProductVO> pvos = new ArrayList<>();
            for(Product p : ps) {
                if(p.getProductType().equals(pt)) {
                    ProductVO pro = new ProductVO();
                    pro.setPrice(p.getPrice());
                    pro.setProductId(p.getId());
                    pro.setProductName(p.getName());
                    pvos.add(pro);
                }
            }
            pvo.setProductList(pvos);
            productsVOS.add(pvo);
        }

        return ResultUtils.success(productsVOS);
    }
    @RequestMapping("msg")
    public String msg() {
        return LocalDateTime.now().toString() + " product server";
    }

    @PostMapping("findByIds")
    public List<ProductOutput> findByIds(@RequestBody List<Long> ids) {

        List<ProductOutput> list = new ArrayList<>();
        productService.findAllByIdIn(ids.toArray(new Long[ids.size()])).forEach(p -> {
            ProductOutput po = new ProductOutput();
            BeanUtils.copyProperties(p, po);
            list.add(po);
        });
        return list;
    }
}
