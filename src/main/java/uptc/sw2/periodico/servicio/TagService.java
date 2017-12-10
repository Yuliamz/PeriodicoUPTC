package uptc.sw2.periodico.servicio;


import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import uptc.sw2.periodico.dto.TagDTO;
import uptc.sw2.periodico.logica.TagLogica;


/**
  *  @author Julian Grijalba
  *  
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
	* 
	*/
	@GET
	public List<TagDTO> obtenerTodosTags(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Tag
	* @return Tag del id dado
	* 
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
	 * 
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
	 *  
	 */
	@DELETE
	@Path("/{id}")
	public void borrarTag(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
