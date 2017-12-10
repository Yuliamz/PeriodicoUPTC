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
public class ArticuloLogica {

    @EJB
    private ArticuloDAO persistencia;

    /**
     * retorna una lista con los Articulo que se encuentran en la base de datos
     *
     * @return retorna una lista de ArticuloDTO
     *
     */
    public List<ArticuloDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @param id identificador del elemento Articulo
     * @return Articulo del id dado
     *
     */
    public ArticuloDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * almacena la informacion de Articulo
     *
     * @param dto Articulo a guardar
     * @return Articulo con los cambios realizados por el proceso de guardar
     *
     */
    public ArticuloDTO guardar(ArticuloDTO dto) {
        return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
    }

    /**
     * Elimina el registro Articulo con el identificador dado
     *
     * @param id identificador del Articulo
     *
     */
    public void borrar(Long id) {
        persistencia.borrar(id);
    }

    /**
     * actualiza la informacion de Articulo
     *
     * @param dto Articulo a guardar
     * @return Articulo con los cambios realizados por el proceso de guardar
     *
     */
    public void actualizar(ArticuloDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    public Articulo convertirDTO(ArticuloDTO dto) {
        if (dto == null) {
            return null;
        }
        Articulo entidad = new Articulo();
        entidad.setId(dto.getId());
        entidad.setTitulo(dto.getTitulo());
        entidad.setImagen(dto.getImagen());
        entidad.setTexto(dto.getTexto());
        entidad.setResumen(dto.getResumen());
        entidad.setTags(dto.getTags());

        if (dto.getSeccion() != null) {
            entidad.setSeccion(new Seccion());
            entidad.getSeccion().setId(dto.getSeccion().getId());
        }

        return entidad;
    }

    public List<Articulo> convertirDTO(List<ArticuloDTO> dtos) {
        List<Articulo> entidades = new ArrayList<Articulo>();
        for (ArticuloDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    public ArticuloDTO convertirEntidad(Articulo entidad) {
        ArticuloDTO dto = new ArticuloDTO();
        dto.setId(entidad.getId());
        dto.setTitulo(entidad.getTitulo());
        dto.setImagen(entidad.getImagen());
        dto.setTexto(entidad.getTexto());
        dto.setResumen(entidad.getResumen());
        dto.setTags(entidad.getTags());

        if (entidad.getSeccion() != null) {
            SeccionDTO sdto = new SeccionDTO(entidad.getSeccion().getId());
            sdto.setNombre(entidad.getSeccion().getNombre());
            dto.setSeccion(sdto);
        }

        return dto;
    }

    public List<ArticuloDTO> convertirEntidad(List<Articulo> entidades) {
        List<ArticuloDTO> dtos = new ArrayList<ArticuloDTO>();
        for (Articulo entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
