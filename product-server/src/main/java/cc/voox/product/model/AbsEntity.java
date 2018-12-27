package cc.voox.product.model;

import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class AbsEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private Boolean active;

    private LocalDateTime createTime = LocalDateTime.now();

    @UpdateTimestamp
    private LocalDateTime updateTime;

    public AbsEntity() {
        setActive(true);
    }
}
