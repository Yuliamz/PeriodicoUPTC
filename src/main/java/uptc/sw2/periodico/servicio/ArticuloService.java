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
@Path("/Articulo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ArticuloService {
	@EJB
    private ArticuloLogica logica;

	
	/**
	* retorna una lista con los Articulo que se encuentran en la base de datos
	* @return retorna una lista de ArticuloDTO
	* @generated
	*/
	@GET
	public List<ArticuloDTO> obtenerTodosArticulos(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Articulo
	* @return Articulo del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public ArticuloDTO obtenerArticulo(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Articulo
	 * @param dto Articulo a guardar
	 * @return Articulo con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public ArticuloDTO guardarArticulo(ArticuloDTO dto){
	    if(dto.getId()!=null){
	        logica.actualizar(dto);
	        return dto;
	    }else{
	        return logica.guardar(dto);
	    }
	}
	
	
	/**
	 * elimina el registro Articulo con el identificador dado
	 * @param id identificador del Articulo
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarArticulo(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
