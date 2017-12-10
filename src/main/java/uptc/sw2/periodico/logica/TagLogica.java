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
public class TagLogica {
	@EJB
    private TagDAO persistencia;


	
	/**
	* retorna una lista con los Tag que se encuentran en la base de datos
	* @return retorna una lista de TagDTO
	* @generated
	*/
	public List<TagDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @param id identificador del elemento Tag
	* @return Tag del id dado
	* @generated
	*/
	public TagDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * almacena la informacion de Tag
	 * @param dto Tag a guardar
	 * @return Tag con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public TagDTO guardar(TagDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Tag con el identificador dado
	 * @param id identificador del Tag
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de Tag
	 * @param dto Tag a guardar
	 * @return Tag con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(TagDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	public Tag convertirDTO(TagDTO dto){
		if(dto==null)return null;
		Tag entidad=new Tag();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
		
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public List<Tag> convertirDTO(List<TagDTO> dtos){
		List<Tag> entidades=new ArrayList<Tag>();
		for(TagDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	public TagDTO convertirEntidad(Tag entidad){
		TagDTO dto=new TagDTO();
		dto.setId(entidad.getId());
			dto.setNombre(entidad.getNombre());
		
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	public List<TagDTO> convertirEntidad(List<Tag> entidades){
		List<TagDTO> dtos=new ArrayList<TagDTO>();
		for(Tag entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
