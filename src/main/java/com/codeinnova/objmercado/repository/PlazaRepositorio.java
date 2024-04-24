package com.codeinnova.objmercado.repository;

import com.codeinnova.objmercado.entities.plazas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlazaRepositorio extends JpaRepository<plazas,Long> {

}
