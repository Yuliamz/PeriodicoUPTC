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
import uptc.sw2.periodico.dto.SeccionDTO;
import uptc.sw2.periodico.logica.SeccionLogica;


/**
  *  @author Julian Grijalba
  *  
  */
@Stateless
@Path("/Seccion")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SeccionService {
	@EJB
    private SeccionLogica logica;

	
	/**
	* retorna una lista con los Seccion que se encuentran en la base de datos
	* @return retorna una lista de SeccionDTO
	* 
	*/
	@GET
	public List<SeccionDTO> obtenerTodosSeccions(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Seccion
	* @return Seccion del id dado
	* 
	*/
	@GET
	@Path("/{id}")
	public SeccionDTO obtenerSeccion(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Seccion
	 * @param dto Seccion a guardar
	 * @return Seccion con los cambios realizados por el proceso de guardar
	 * 
	 */
	@POST
	public SeccionDTO guardarSeccion(SeccionDTO dto){
	    if(dto.getId()!=null){
	        logica.actualizar(dto);
	        return dto;
	    }else{
	        return logica.guardar(dto);
	    }
	}
	
	
	/**
	 * elimina el registro Seccion con el identificador dado
	 * @param id identificador del Seccion
	 *  
	 */
	@DELETE
	@Path("/{id}")
	public void borrarSeccion(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
