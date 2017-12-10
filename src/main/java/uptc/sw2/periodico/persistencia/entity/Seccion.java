package uptc.sw2.periodico.persistencia.entity;

import javax.persistence.*;

/**
 *
 * @author Julian Grijalba
 */
@Entity
@Table(name = "Seccion")
@NamedQueries({
    @NamedQuery(name = "Seccion.obtenerTodos", query = "select e from Seccion e")
})
public class Seccion {

    @Id
    @GeneratedValue(generator = "SeccionGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SeccionGen", sequenceName = "Seccion_SEQ", allocationSize = 1)
    private Long id;

    public Long getId() {
        return this.id;
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
