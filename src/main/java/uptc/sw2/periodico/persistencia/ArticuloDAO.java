package uptc.sw2.periodico.persistencia;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import uptc.sw2.periodico.persistencia.entity.Articulo;

/**
 *
 * @author Julian Grijalba
 */
@Stateless
public class ArticuloDAO {

    @PersistenceContext
    private EntityManager em;

    public List<Articulo> obtenerTodos() {
        return em.createNamedQuery("Articulo.obtenerTodos").getResultList();
    }

    public Articulo obtener(Long id) {
        return em.find(Articulo.class, id);
    }

    public Articulo guardar(Articulo entidad) {
        em.persist(entidad);
        return entidad;
    }

    public void borrar(Long id) {
        em.remove(em.find(Articulo.class, id));
    }

    public void actualizar(Articulo entidad) {
        em.merge(entidad);
    }

}
