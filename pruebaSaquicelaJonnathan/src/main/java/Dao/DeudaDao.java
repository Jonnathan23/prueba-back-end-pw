package Dao;

import java.util.List;

import Model.Deuda;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class DeudaDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void crear(Deuda deuda) {
		try {
			em.persist(deuda);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fallo al insertar");
			System.out.println(e);
		}
	}
	
	public Deuda buscarDeuda(String cedula) {
		try {
			Deuda deudaEcontrada = em.find(Deuda.class, cedula);
			
			return deudaEcontrada;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public List<Deuda> listarDeudas(){
		String jpql = "SELECT c FROM Deuda c";
		Query query = em.createQuery(jpql, Deuda.class);
		
		return query.getResultList();
	}
}
