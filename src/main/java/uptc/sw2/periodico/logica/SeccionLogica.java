package uptc.sw2.periodico.logica;

import uptc.sw2.periodico.dto.*;
import uptc.sw2.periodico.persistencia.*;
import uptc.sw2.periodico.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
  *  @generated
  *  @author Julian Grijalba
  */
@Stateless
public class SeccionLogica {
	@EJB
    private SeccionDAO persistencia;


	
	/**
	* retorna una lista con los Seccion que se encuentran en la base de datos
	* @return retorna una lista de SeccionDTO
	* @generated
	*/
	public List<SeccionDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @param id identificador del elemento Seccion
	* @return Seccion del id dado
	* @generated
	*/
	public SeccionDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * almacena la informacion de Seccion
	 * @param dto Seccion a guardar
	 * @return Seccion con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public SeccionDTO guardar(SeccionDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Seccion con el identificador dado
	 * @param id identificador del Seccion
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de Seccion
	 * @param dto Seccion a guardar
	 * @return Seccion con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(SeccionDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	public Seccion convertirDTO(SeccionDTO dto){
		if(dto==null)return null;
		Seccion entidad=new Seccion();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
			entidad.setCantidadArticulos(dto.getCantidadArticulos());
		
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public List<Seccion> convertirDTO(List<SeccionDTO> dtos){
		List<Seccion> entidades=new ArrayList<Seccion>();
		for(SeccionDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	public SeccionDTO convertirEntidad(Seccion entidad){
		SeccionDTO dto=new SeccionDTO();
		dto.setId(entidad.getId());
			dto.setNombre(entidad.getNombre());
			dto.setCantidadArticulos(entidad.getCantidadArticulos());
		
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	public List<SeccionDTO> convertirEntidad(List<Seccion> entidades){
		List<SeccionDTO> dtos=new ArrayList<SeccionDTO>();
		for(Seccion entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
