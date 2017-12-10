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
import uptc.sw2.periodico.dto.ArticuloDTO;
import uptc.sw2.periodico.logica.ArticuloLogica;


/**
  *  @author Julian Grijalba
  *  
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
	* 
	*/
	@GET
	public List<ArticuloDTO> obtenerTodosArticulos(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Articulo
	* @return Articulo del id dado
	* 
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
	 * 
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
	 *  
	 */
	@DELETE
	@Path("/{id}")
	public void borrarArticulo(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
