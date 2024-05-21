package com.codeinnova.objmercado.repository;

import com.codeinnova.objmercado.entities.Markets;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface MarketRepository extends JpaRepository<Markets,Integer> {


    void deleteById(Long id);

    boolean existsById(Long id);
}
