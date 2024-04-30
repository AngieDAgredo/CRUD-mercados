package com.codeinnova.objmercado.controllers;

import com.codeinnova.objmercado.entities.plazas;
import com.codeinnova.objmercado.repository.PlazaRepositorio;
import jakarta.persistence.Id;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;


@RestController
public class PlazasControllers {

    private final Logger log = LoggerFactory.getLogger(PlazasControllers.class);

    private PlazaRepositorio repository;
    public PlazasControllers(PlazaRepositorio repository) {
        this.repository = repository;
    }

    //    Aquí se desarrolla el CRUD de la entidad plazas.
//    C --> Create  R --> Read  U--> Update  D--> Delete

//    CREATE a new market place

    @PostMapping("/api/plazasmercado/create")
    public ResponseEntity<plazas> create (@RequestBody plazas plaza){
        if (plaza.getId() != null){
            log.warn("Intentando crear una plaza de mercado con id");
            return ResponseEntity.badRequest().build();
        }
        plazas result = repository.save(plaza);
        return ResponseEntity.ok(result); //la MP tiene una clave primaria
    }

//    READ --> Search all market places
    @GetMapping("/api/plazasmercado")//Asociar URL a cada método para acceder información -- poner api para diferenciar
    public List<plazas> busquedaplazas (){
        return repository.findAll();
    }

    //Search a single market place by id

    @GetMapping("/api/plazasmercado/{id}")
    public ResponseEntity<plazas> findOneById(@PathVariable Long id){ //Path indica a Spring el valor de id
        Optional<plazas> plazasOptional = repository.findById(id); //Se da el id y devuelve un opt
        if (plazasOptional.isPresent()) //Metodo is present comprueba que hay algo
            return ResponseEntity.ok(plazasOptional.get());
        else
            return ResponseEntity.notFound().build();
    }


//    UPDATE
    @PutMapping("/api/plazasmercado/update")
    public ResponseEntity<plazas> update(@RequestBody plazas plaza){
        if(plaza.getId()==null){ //Si no tiene ID es una creación
            log.warn("Intentas actualizar una plaza de mercado que no existe");
            return ResponseEntity.badRequest().build();
       }
        if(!repository.existsById(plaza.getId())){
            log.warn("Intentas actualizar una plaza de mercado que no existe");
            return ResponseEntity.notFound().build();
        }
        plazas result = repository.save(plaza);
        return ResponseEntity.ok(result);
    }

//DELETE

    @DeleteMapping("/api/plazasmercado/delete/{id}")
    public ResponseEntity<plazas> delete(@PathVariable Long id){
        if(!repository.existsById(id)){
            log.warn("Intentas borrar una plaza de mercado que no existe");
            return ResponseEntity.notFound().build();
        }
        repository.deleteAll();
        return ResponseEntity.noContent().build();
    }


//    FILTRO
        @GetMapping("/api/plazasmercado/Ventafrutas")
        public List<plazas> filtro1() {
        List<plazas> mercados = repository.findAll();

        // Filtrar las plazas que venden frutas
        List<plazas> plazasFrutas = mercados.stream()
                .filter(plaza -> plaza.isVentafrutas())
                .collect(Collectors.toList());

        return plazasFrutas;
    }






}
