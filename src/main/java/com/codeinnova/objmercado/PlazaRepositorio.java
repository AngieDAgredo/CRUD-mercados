package com.codeinnova.objmercado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlazaRepositorio extends JpaRepository<plazas,Long> {

}
