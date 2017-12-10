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
public class ArticuloDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Articulo> obtenerTodos(){
		return em.createNamedQuery("Articulo.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Articulo obtener(Long id){
		return em.find(Articulo.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Articulo guardar(Articulo entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Articulo.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Articulo entidad){
		em.merge(entidad);
	}
	
	
}
