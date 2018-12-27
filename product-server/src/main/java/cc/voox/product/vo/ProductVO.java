package cc.voox.product.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductVO {

    private Long productId;

    private String productName;

    private BigDecimal price;


}
