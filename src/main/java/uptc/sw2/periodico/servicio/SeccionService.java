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
@Path("/Seccion")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SeccionService {
	@EJB
    private SeccionLogica logica;

	
	/**
	* retorna una lista con los Seccion que se encuentran en la base de datos
	* @return retorna una lista de SeccionDTO
	* @generated
	*/
	@GET
	public List<SeccionDTO> obtenerTodosSeccions(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Seccion
	* @return Seccion del id dado
	* @generated
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
	 * @generated
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
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarSeccion(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
