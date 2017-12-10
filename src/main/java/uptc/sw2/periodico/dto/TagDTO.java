package uptc.sw2.periodico.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Julian Grijalba
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TagDTO {

    public TagDTO() {

    }

    public TagDTO(Long id) {
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

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
