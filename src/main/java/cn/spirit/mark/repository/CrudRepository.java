package cn.spirit.mark.repository;

import cn.spirit.mark.entity.Crud;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudRepository extends JpaRepository<Crud,Integer> {

    Page<Crud> findAll(Pageable pageable);
}
