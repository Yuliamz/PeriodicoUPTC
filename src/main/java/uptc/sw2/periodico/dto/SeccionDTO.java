package uptc.sw2.periodico.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Julian Grijalba
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SeccionDTO {

    public SeccionDTO() {

    }

    public SeccionDTO(Long id) {
        this.id = id;
    }

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String nombre;

    private Integer cantidadArticulos;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadArticulos() {
        return this.cantidadArticulos;
    }

    public void setCantidadArticulos(Integer cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
    }

}
