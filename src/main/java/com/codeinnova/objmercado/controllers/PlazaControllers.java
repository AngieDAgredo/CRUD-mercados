package com.codeinnova.objmercado.controllers;

import com.codeinnova.objmercado.entities.Markets;
import com.codeinnova.objmercado.repository.MarketRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController

public class PlazaControllers {

    private final Logger log = LoggerFactory.getLogger(PlazaControllers.class);

    private MarketRepository repository;

    public PlazaControllers(MarketRepository repository) {
        this.repository = repository;
    }

    //    CREATE
    @PostMapping("/api/plazasmercado/create")
    public ResponseEntity<Markets> create(@RequestBody Markets markets) {
        if (markets.getId() != null) {
            log.warn("Intentando crear una plaza de mercado con id");
            return ResponseEntity.badRequest().build();
        }
        Markets result = repository.save(markets);
        return ResponseEntity.ok(result); //la MP tiene una clave primaria
    }

    //    READ --> Search all market places
    @GetMapping("/api/plazasmercado")//Asociar URL a cada método para acceder información -- poner api para diferenciar
    public List<Markets> readmarkets() {
        return repository.findAll();
    }

    //  UPDATE
    @PutMapping("/api/plazasmercado/update")
    public ResponseEntity<Markets> update(@RequestBody Markets markets) {
        if (markets.getId() == null) { //Si no tiene ID es una creación
            log.warn("No es actualización, es una creación");
            return ResponseEntity.badRequest().build();
        }
        Markets result = repository.save(markets);
        return ResponseEntity.ok(result);
    }

    //DELETE
    @DeleteMapping("/api/plazasmercado/{id}")
    public ResponseEntity<Markets> delete (@PathVariable Integer id){
        if (!repository.existsById(id)){
            log.warn(("No existe el id que deseas borrar"));
            return ResponseEntity.notFound().build();
        }
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/api/plazasmercado/manzanas")
    public List<Markets> filter1() {
        List<Markets> shop = repository.findAll();
        List<Markets> marketfruits = new ArrayList<>();

        for (Markets market : shop) {
            if (market.getProducts().isManzanas()) {
                marketfruits.add(market);
            }
        }
        return marketfruits;
    }

}




