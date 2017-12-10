package uptc.sw2.periodico.persistencia;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import uptc.sw2.periodico.persistencia.entity.Administrador;

/**
 *
 * @author Julian Grijalba
 */
@Stateless
public class AdministradorDAO {

    @PersistenceContext
    private EntityManager em;

    public List<Administrador> obtenerTodos() {
        return em.createNamedQuery("Administrador.obtenerTodos").getResultList();
    }

    public Administrador obtener(Long id) {
        return em.find(Administrador.class, id);
    }

    public Administrador guardar(Administrador entidad) {
        em.persist(entidad);
        return entidad;
    }

    public void borrar(Long id) {
        em.remove(em.find(Administrador.class, id));
    }

    public void actualizar(Administrador entidad) {
        em.merge(entidad);
    }

}
