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
public class TagLogica {

    @EJB
    private TagDAO persistencia;

    /**
     * retorna una lista con los Tag que se encuentran en la base de datos
     *
     * @return retorna una lista de TagDTO
     *
     */
    public List<TagDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @param id identificador del elemento Tag
     * @return Tag del id dado
     *
     */
    public TagDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * almacena la informacion de Tag
     *
     * @param dto Tag a guardar
     * @return Tag con los cambios realizados por el proceso de guardar
     *
     */
    public TagDTO guardar(TagDTO dto) {
        return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
    }

    /**
     * Elimina el registro Tag con el identificador dado
     *
     * @param id identificador del Tag
     *
     */
    public void borrar(Long id) {
        persistencia.borrar(id);
    }

    /**
     * actualiza la informacion de Tag
     *
     * @param dto Tag a guardar
     *
     */
    public void actualizar(TagDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

     /**
     * convierte una Tag DTO a una entidad Tag
     * @param dto DTO de Tag
     * @return Entidad de Tag
     */
    public Tag convertirDTO(TagDTO dto) {
        if (dto == null) {
            return null;
        }
        Tag entidad = new Tag();
        entidad.setId(dto.getId());
        entidad.setNombre(dto.getNombre());

        return entidad;
    }
/**
     * Convierte una lista de DTOs de Tag a una lista de entidades de Tag
     * @param dtos Lista de DTOs de Tag
     * @return Lista de entidades Tag
     */
    public List<Tag> convertirDTO(List<TagDTO> dtos) {
        List<Tag> entidades = new ArrayList<Tag>();
        for (TagDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }
/**
     * convierte una entidad Tag a un DTO Tag
     * @param entidad Entidad Tag
     * @return DTO Tag
     */
    public TagDTO convertirEntidad(Tag entidad) {
        TagDTO dto = new TagDTO();
        dto.setId(entidad.getId());
        dto.setNombre(entidad.getNombre());

        return dto;
    }
 /**
     * convierte una lista de entidades Tag a una lista de DTO de Tag
     * @param entidades Lista de entidades Tag
     * @return Lista de DTOs Tag
     */
    public List<TagDTO> convertirEntidad(List<Tag> entidades) {
        List<TagDTO> dtos = new ArrayList<TagDTO>();
        for (Tag entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
