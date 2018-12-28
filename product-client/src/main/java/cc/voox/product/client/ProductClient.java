package cc.voox.product.client;

import cc.voox.product.vo.ProductOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "product")
public interface ProductClient {

    @PostMapping("findByIds")
    public List<ProductOutput> findByIds(@RequestBody List<Long> ids);

    @RequestMapping("msg")
    public String hello();
}
