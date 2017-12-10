package uptc.sw2.periodico.persistencia.entity;

import javax.persistence.*;

/**
 *
 * @author Julian Grijalba
 */
@Entity
@Table(name = "Articulo")
@NamedQueries({
    @NamedQuery(name = "Articulo.obtenerTodos", query = "select e from Articulo e")
})
public class Articulo {

    @Id
    @GeneratedValue(generator = "ArticuloGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ArticuloGen", sequenceName = "Articulo_SEQ", allocationSize = 1)
    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String titulo;
    private String imagen;
    private String texto;
    private String resumen;
    private String tags;

    @ManyToOne(cascade = {}, fetch = FetchType.EAGER)
    private Seccion seccion;

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

    public Seccion getSeccion() {
        return this.seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

}
