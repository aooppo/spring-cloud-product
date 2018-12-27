package cc.voox.product.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProductsVO {
    @JsonProperty("name")
    private String productTypeName;

    private Long type;

    @JsonProperty("products")
    private List<ProductVO> productList;
}
