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
 *
 * @author Julian Grijalba
 */
@Stateless
public class SeccionLogica {

    @EJB
    private SeccionDAO persistencia;

    /**
     * retorna una lista con los Seccion que se encuentran en la base de datos
     *
     * @return retorna una lista de SeccionDTO
     *
     */
    public List<SeccionDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @param id identificador del elemento Seccion
     * @return Seccion del id dado
     *
     */
    public SeccionDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * almacena la informacion de Seccion
     *
     * @param dto Seccion a guardar
     * @return Seccion con los cambios realizados por el proceso de guardar
     *
     */
    public SeccionDTO guardar(SeccionDTO dto) {
        return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
    }

    /**
     * Elimina el registro Seccion con el identificador dado
     *
     * @param id identificador del Seccion
     *
     */
    public void borrar(Long id) {
        persistencia.borrar(id);
    }

    /**
     * actualiza la informacion de Seccion
     *
     * @param dto Seccion a guardar
     *
     */
    public void actualizar(SeccionDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * convierte una Seccion DTO a una entidad Seccion
     * @param dto DTO de Seccion
     * @return Entidad de Seccion
     */
    public Seccion convertirDTO(SeccionDTO dto) {
        if (dto == null) {
            return null;
        }
        Seccion entidad = new Seccion();
        entidad.setId(dto.getId());
        entidad.setNombre(dto.getNombre());
        entidad.setCantidadArticulos(dto.getCantidadArticulos());

        return entidad;
    }

    /**
     * Convierte una lista de DTOs de Seccion a una lista de entidades de Seccion
     * @param dtos Lista de DTOs de Seccion
     * @return Lista de entidades Seccion
     */
    public List<Seccion> convertirDTO(List<SeccionDTO> dtos) {
        List<Seccion> entidades = new ArrayList<Seccion>();
        for (SeccionDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }
    

    /**
     * convierte una entidad Seccion a un DTO Seccion
     * @param entidad Entidad Seccion
     * @return DTO Seccion
     */
    public SeccionDTO convertirEntidad(Seccion entidad) {
        SeccionDTO dto = new SeccionDTO();
        dto.setId(entidad.getId());
        dto.setNombre(entidad.getNombre());
        dto.setCantidadArticulos(entidad.getCantidadArticulos());

        return dto;
    }

    /**
     * Convierte una lista de entidades Seccion a una lista de DTO de Seccion
     * @param entidades Lista de entidades Seccion
     * @return Lista de DTO de Seccion
     */
    public List<SeccionDTO> convertirEntidad(List<Seccion> entidades) {
        List<SeccionDTO> dtos = new ArrayList<SeccionDTO>();
        for (Seccion entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
