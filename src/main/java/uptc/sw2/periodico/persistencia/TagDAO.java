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
public class TagDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Tag> obtenerTodos(){
		return em.createNamedQuery("Tag.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Tag obtener(Long id){
		return em.find(Tag.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Tag guardar(Tag entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Tag.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Tag entidad){
		em.merge(entidad);
	}
	
	
}
