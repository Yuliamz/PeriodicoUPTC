package uptc.sw2.periodico.persistencia;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import uptc.sw2.periodico.persistencia.entity.Seccion;

/**
 *
 * @author Julian Grijalba
 */
@Stateless
public class SeccionDAO {

    @PersistenceContext
    private EntityManager em;

    public List<Seccion> obtenerTodos() {
        return em.createNamedQuery("Seccion.obtenerTodos").getResultList();
    }

    public Seccion obtener(Long id) {
        return em.find(Seccion.class, id);
    }

    public Seccion guardar(Seccion entidad) {
        em.persist(entidad);
        return entidad;
    }

    public void borrar(Long id) {
        em.remove(em.find(Seccion.class, id));
    }

    public void actualizar(Seccion entidad) {
        em.merge(entidad);
    }

}
