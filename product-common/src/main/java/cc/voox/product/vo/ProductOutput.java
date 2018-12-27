package cc.voox.product.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductOutput {
    private String name;
    private Long id;
    private Double qty;

    private BigDecimal price;

    /** 描述. */
    private String productDescription;

}
