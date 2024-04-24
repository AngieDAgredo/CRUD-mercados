package com.codeinnova.objmercado.controllers;

import com.codeinnova.objmercado.entities.plazas;
import com.codeinnova.objmercado.repository.PlazaRepositorio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlazasControllers {

    private PlazaRepositorio repository;

    public PlazasControllers(PlazaRepositorio repository) {
        this.repository = repository;
    }

    //    Aquí se desarrolla el CRUD de la entidad plazas.
//    C --> Create  R --> Read  U--> Update  D--> Delete

//    CREATE

    @PostMapping("/api/plazasmercado/create")
    public plazas create (@RequestBody plazas plaza){
        return repository.save(plaza);
    }


//    READ --> Search all plazas
    @GetMapping("/api/plazasmercado")//Asociar URL a cada método para acceder información -- poner api para diferenciar
    public List<plazas> busquedaplazas (){
        return repository.findAll();
    }



/*  FILTRO
    @GetMapping ("/api/plazasmercado/filtro")
    public List<plazas> filtro(@RequestParam Ventafrutas) {
        return repository.findBy(Ventafrutas==true);
    } */







}
