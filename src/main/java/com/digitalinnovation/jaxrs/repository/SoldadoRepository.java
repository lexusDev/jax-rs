package com.digitalinnovation.jaxrs.repository;

import com.digitalinnovation.jaxrs.entity.SoldadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoldadoRepository extends JpaRepository<SoldadoEntity, Long> {

}
