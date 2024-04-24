package com.codeinnova.objmercado;

import com.codeinnova.objmercado.entities.plazas;
import com.codeinnova.objmercado.repository.PlazaRepositorio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObjMercadoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObjMercadoApplication.class, args);
		PlazaRepositorio repositorio = context.getBean(PlazaRepositorio.class);

//		CRUD
//		Crear una plaza (Crear un objeto)
		plazas plaza1 = new plazas(null,"Galería la 13","Cra 7 13 08",true,true,true);
		plazas plaza2 = new plazas(null,"Galería Barrio Bolivar","Calle 8 Nte 3 35",true, false, false);
		plazas plaza3 = new plazas(null,"Galería La Esmeralda","Calle 5 21 12",false,true,true);
//		Almacenar en base de datos
		repositorio.save(plaza1);
        repositorio.save(plaza2);
        repositorio.save(plaza3);

//		Recuperar todas las plazas (Para saber si se han guardado) READ
		repositorio.findAll();


//		Borrar plaza
	    // repositorio.deleteById(1L); Borrar
	}

}
