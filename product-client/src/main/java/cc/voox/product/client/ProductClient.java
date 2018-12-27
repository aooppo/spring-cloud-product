package cc.voox.product.client;

import cc.voox.product.vo.ProductOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "product")
public interface ProductClient {

    @PostMapping("findByIds")
    List<ProductOutput> findByIds(@RequestBody List<String> ids);
}
