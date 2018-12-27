package cc.voox.product.dao;

import cc.voox.product.model.AbsEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IBaseDAO<T extends AbsEntity> extends JpaRepository<T, Long> {
}
