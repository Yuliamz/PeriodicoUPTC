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
public class AdministradorLogica {

    @EJB
    private AdministradorDAO persistencia;

    /**
     * retorna una lista con los Administrador que se encuentran en la base de
     * datos
     *
     * @return retorna una lista de AdministradorDTO
     *
     */
    public List<AdministradorDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @param id identificador del elemento Administrador
     * @return Administrador del id dado
     *
     */
    public AdministradorDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * almacena la informacion de Administrador
     *
     * @param dto Administrador a guardar
     * @return Administrador con los cambios realizados por el proceso de
     * guardar
     *
     */
    public AdministradorDTO guardar(AdministradorDTO dto) {
        return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
    }

    /**
     * Elimina el registro Administrador con el identificador dado
     *
     * @param id identificador del Administrador
     *
     */
    public void borrar(Long id) {
        persistencia.borrar(id);
    }

    /**
     * actualiza la informacion de Administrador
     *
     * @param dto Administrador a guardar
     */
    public void actualizar(AdministradorDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }
/**
     * Convierte un DTO de Administrador a una entidad Adminitrador
     * @param dto DTO de administrador
     * @return Entidad Administrador
     */
    public Administrador convertirDTO(AdministradorDTO dto) {
        if (dto == null) {
            return null;
        }
        Administrador entidad = new Administrador();
        entidad.setId(dto.getId());
        entidad.setUsuario(dto.getUsuario());
        entidad.setContraseña(dto.getContraseña());

        return entidad;
    }

    /**
     * Convierte una lista de DTOs de Administradores a una lista de entidades de Administrador
     * @param dtos Lista de DTOs de Administradores
     * @return Lista de entidades Adminitrador
     */
    public List<Administrador> convertirDTO(List<AdministradorDTO> dtos) {
        List<Administrador> entidades = new ArrayList<Administrador>();
        for (AdministradorDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * convierte una entidad Administrador a un DTO administrador
     * @param entidad Entidad administrador
     * @return DTO administrador
     */
    public AdministradorDTO convertirEntidad(Administrador entidad) {
        AdministradorDTO dto = new AdministradorDTO();
        dto.setId(entidad.getId());
        dto.setUsuario(entidad.getUsuario());
        dto.setContraseña(entidad.getContraseña());

        return dto;
    }

    /**
     * convierte una lista de entidades Administrador a una lista de DTO de administrador
     * @param entidades Lista de entidades Administrador
     * @return Lista de DTOs adminitrador
     */
    public List<AdministradorDTO> convertirEntidad(List<Administrador> entidades) {
        List<AdministradorDTO> dtos = new ArrayList<AdministradorDTO>();
        for (Administrador entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
