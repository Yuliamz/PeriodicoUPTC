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
public class AdministradorDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Administrador> obtenerTodos(){
		return em.createNamedQuery("Administrador.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Administrador obtener(Long id){
		return em.find(Administrador.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Administrador guardar(Administrador entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Administrador.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Administrador entidad){
		em.merge(entidad);
	}
	
	
}
