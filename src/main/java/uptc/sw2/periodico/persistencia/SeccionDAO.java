package uptc.sw2.periodico.persistencia;

import uptc.sw2.periodico.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.Stateless;

/**
  *  @generated
  *  @author Julian Grijalba
  */
@Stateless
public class SeccionDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Seccion> obtenerTodos(){
		return em.createNamedQuery("Seccion.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Seccion obtener(Long id){
		return em.find(Seccion.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Seccion guardar(Seccion entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Seccion.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Seccion entidad){
		em.merge(entidad);
	}
	
	
}
