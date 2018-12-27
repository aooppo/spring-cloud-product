package cc.voox.product.model;


import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class ProductType extends AbsEntity {
    private String name;



    public ProductType() {
    }

}
