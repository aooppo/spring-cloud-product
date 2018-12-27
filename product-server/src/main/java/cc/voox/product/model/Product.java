package cc.voox.product.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
public class Product implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Double qty;

}