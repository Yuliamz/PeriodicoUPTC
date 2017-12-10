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
import uptc.sw2.periodico.dto.AdministradorDTO;
import uptc.sw2.periodico.logica.AdministradorLogica;


/**
  *  @author Julian Grijalba
  *  
  */
@Stateless
@Path("/Administrador")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AdministradorService {
	@EJB
    private AdministradorLogica logica;

	
	/**
	* retorna una lista con los Administrador que se encuentran en la base de datos
	* @return retorna una lista de AdministradorDTO
	* 
	*/
	@GET
	public List<AdministradorDTO> obtenerTodosAdministradors(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Administrador
	* @return Administrador del id dado
	* 
	*/
	@GET
	@Path("/{id}")
	public AdministradorDTO obtenerAdministrador(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Administrador
	 * @param dto Administrador a guardar
	 * @return Administrador con los cambios realizados por el proceso de guardar
	 * 
	 */
	@POST
	public AdministradorDTO guardarAdministrador(AdministradorDTO dto){
	    if(dto.getId()!=null){
	        logica.actualizar(dto);
	        return dto;
	    }else{
	        return logica.guardar(dto);
	    }
	}
	
	
	/**
	 * elimina el registro Administrador con el identificador dado
	 * @param id identificador del Administrador
	 *  
	 */
	@DELETE
	@Path("/{id}")
	public void borrarAdministrador(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
