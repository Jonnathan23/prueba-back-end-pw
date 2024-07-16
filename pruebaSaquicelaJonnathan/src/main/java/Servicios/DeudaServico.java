package Servicios;

import java.util.List;

import Model.Deuda;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import prueba.pruebaSaquicelaJonnathan.GestionDeuda;

@Path("/deudas")
public class DeudaServico {

	@Inject
	private GestionDeuda gestionDeuda;
	
	@GET
	@Path("{cedula}")
	@Produces("application/json")
	public Deuda obtenerDeuda(@PathParam("cedula") String cedula) {
		try {
			return this.gestionDeuda.obtenerDeuda(cedula);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	@GET
	@Produces("application/json")
	public List<Deuda> list(){
		List<Deuda> deudas = this.gestionDeuda.listarDeudas();
		return deudas;
	}
	
}
