package prueba.pruebaSaquicelaJonnathan;

import java.util.List;

import Dao.DeudaDao;
import Model.Deuda;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionDeuda {

	@Inject
	private DeudaDao deudaDao;
	
	public Deuda obtenerDeuda(String cedula) throws Exception{
		if( cedula == null) throw new Exception ("Cedula vacia");
		
		Deuda deudaEncontrada = deudaDao.buscarDeuda(cedula);
		if(deudaEncontrada == null) throw new Exception("Deuda no existente");
		
		return deudaEncontrada;		
		
	}
	
	public List<Deuda> listarDeudas(){
		return deudaDao.listarDeudas();
	}
}
