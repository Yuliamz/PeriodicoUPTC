package uptc.sw2.periodico.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Julian Grijalba
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArticuloDTO {

    public ArticuloDTO() {

    }

    public ArticuloDTO(Long id) {
        this.id = id;
    }

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String titulo;
    private String imagen;
    private String texto;
    private String resumen;
    private String tags;
    private SeccionDTO seccion;

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagen() {
        return this.imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getResumen() {
        return this.resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getTags() {
        return this.tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public SeccionDTO getSeccion() {
        return this.seccion;
    }

    public void setSeccion(SeccionDTO seccion) {
        this.seccion = seccion;
    }

}
