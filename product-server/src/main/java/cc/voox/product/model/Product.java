package cc.voox.product.model;

import cc.voox.product.enums.ProductStatus;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class Product extends AbsEntity {



    private String name;

    private Double qty;

    private BigDecimal price;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 状态, 0正常1下架. */
    @Enumerated(EnumType.STRING)
    private ProductStatus productStatus;

    /** 类目编号. */
    @ManyToOne
    private ProductType productType;

    public Product() {
        setProductStatus(ProductStatus.UP);
    }
}