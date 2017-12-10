package uptc.sw2.periodico.persistencia.entity;

import javax.persistence.*;

/**
 *
 * @author Julian Grijalba
 */
@Entity
@Table(name = "Administrador")
@NamedQueries({
    @NamedQuery(name = "Administrador.obtenerTodos", query = "select e from Administrador e")
})
public class Administrador {

    @Id
    @GeneratedValue(generator = "AdministradorGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "AdministradorGen", sequenceName = "Administrador_SEQ", allocationSize = 1)
    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String usuario;

    private String contraseña;

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return this.contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
