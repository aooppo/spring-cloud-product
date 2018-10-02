package cc.voox.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("msg")
    public String msg() {
        return "It's from product 2! ";
    }
}
