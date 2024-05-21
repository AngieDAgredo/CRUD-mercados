package com.codeinnova.objmercado;

import com.codeinnova.objmercado.entities.Markets;
import com.codeinnova.objmercado.entities.Markets.Location;
import com.codeinnova.objmercado.repository.MarketRepository;
import jakarta.persistence.Embeddable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalTime;


@SpringBootApplication
public class ObjMercadoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObjMercadoApplication.class, args);
		MarketRepository repository = context.getBean(MarketRepository.class);

		//		Crear una plaza (Crear un objeto)

		Location location1 =new Location(1024L,200L,"Cra 17 b 11 b 16");

		LocalTime opening = LocalTime.of(8,30);
		LocalTime closing = LocalTime.of(18,0);

		Markets.OperatingHours operatingHours1 = new Markets.OperatingHours(null,null,opening,closing,opening,closing,opening,closing,opening,closing,opening,closing,null,null);
		Markets.Products products1 = new Markets.Products(false,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,true,false,false,true,true);
		Markets.Qualification qualification1 = new Markets.Qualification(4.3f,"Buen servicio");
		Markets.Contact contact1 = new Markets.Contact("market1@gmail.com",3232210312L);

		Location location2 =new Location(102224L,20110L,"Cll 18 b # 16 - 24");
		Markets.OperatingHours operatingHours2 = new Markets.OperatingHours(null,null,null,null,opening,closing,opening,closing,opening,closing,opening,closing,null,null);
		Markets.Products products2 = new Markets.Products(true,true,true,false,false,true,true,false,true,false,false,false,true,true,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,true,false,false,true,true);
		Markets.Qualification qualification2 = new Markets.Qualification(4.8f,"Excelente servicio, tiene todos los productos que se deseean");
		Markets.Contact contact2 = new Markets.Contact("market2@gmail.com",3124566422L);


		Markets market1 = new Markets(null,"Ventas la 12",true,false,location1,operatingHours1,products1,qualification1,contact1);
		Markets market2 = new Markets(null,"Donde Pepito",true,false,location2,operatingHours2,products2,qualification2,contact2);

//		Almacenar en base de datos
		repository.save(market1);
		repository.save(market2);

//		Recuperar todas las plazas (Para saber si se han guardado) READ
		repository.findAll();
	}

}
