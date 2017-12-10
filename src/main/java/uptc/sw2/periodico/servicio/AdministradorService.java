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
@Path("/Administrador")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AdministradorService {
	@EJB
    private AdministradorLogica logica;

	
	/**
	* retorna una lista con los Administrador que se encuentran en la base de datos
	* @return retorna una lista de AdministradorDTO
	* @generated
	*/
	@GET
	public List<AdministradorDTO> obtenerTodosAdministradors(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Administrador
	* @return Administrador del id dado
	* @generated
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
	 * @generated
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
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarAdministrador(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
