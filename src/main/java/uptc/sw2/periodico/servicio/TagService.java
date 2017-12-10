package uptc.sw2.periodico.servicio;

import uptc.sw2.periodico.dto.*;
import uptc.sw2.periodico.logica.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
  *  @author Julian Grijalba
  *  @generated
  */
@Stateless
@Path("/Tag")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TagService {
	@EJB
    private TagLogica logica;

	
	/**
	* retorna una lista con los Tag que se encuentran en la base de datos
	* @return retorna una lista de TagDTO
	* @generated
	*/
	@GET
	public List<TagDTO> obtenerTodosTags(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Tag
	* @return Tag del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public TagDTO obtenerTag(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Tag
	 * @param dto Tag a guardar
	 * @return Tag con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public TagDTO guardarTag(TagDTO dto){
	    if(dto.getId()!=null){
	        logica.actualizar(dto);
	        return dto;
	    }else{
	        return logica.guardar(dto);
	    }
	}
	
	
	/**
	 * elimina el registro Tag con el identificador dado
	 * @param id identificador del Tag
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarTag(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
