package prueba.pruebaSaquicelaJonnathan;

import Dao.DeudaDao;
import Model.Deuda;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class Inicio {

	@Inject DeudaDao deudaDao;
	
	@PostConstruct
	public void init() {
		System.out.println("hola mundo ejb");
		
		Deuda deuda1 = new Deuda();
		Deuda deuda2 = new Deuda();
		Deuda deuda3 = new Deuda();
		
		deuda1.setDeu_cedula("0147852369");
		deuda1.setDeu_nombre("Javier Sanchez");
		deuda1.setDeu_consumo(35.6);
		deuda1.setDeu_deuda(36.45);
		
		deuda2.setDeu_cedula("0123654789");
		deuda2.setDeu_nombre("Daniel Harman");
		deuda2.setDeu_consumo(55.78);
		deuda2.setDeu_deuda(49.68);
		
		deuda1.setDeu_cedula("0125874963");
		deuda1.setDeu_nombre("Jessica Pearson");
		deuda1.setDeu_consumo(24.58);
		deuda1.setDeu_deuda(19.80);
		
		this.deudaDao.crear(deuda1);
		this.deudaDao.crear(deuda2);
		this.deudaDao.crear(deuda3);
		
		
		
		
	}
}
