package uptc.sw2.periodico.persistencia.entity;

import javax.persistence.*;

/**
 *
 * @author Julian Grijalba
 */
@Entity
@Table(name = "Tag")
@NamedQueries({
    @NamedQuery(name = "Tag.obtenerTodos", query = "select e from Tag e")
})
public class Tag {

    @Id
    @GeneratedValue(generator = "TagGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "TagGen", sequenceName = "Tag_SEQ", allocationSize = 1)
    private Long id;

    public Long getId() {
        return this.id;
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
