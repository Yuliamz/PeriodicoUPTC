package uptc.sw2.periodico.persistencia;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import uptc.sw2.periodico.persistencia.entity.Tag;

/**
 *
 * @author Julian Grijalba
 */
@Stateless
public class TagDAO {

    @PersistenceContext
    private EntityManager em;

    public List<Tag> obtenerTodos() {
        return em.createNamedQuery("Tag.obtenerTodos").getResultList();
    }

    public Tag obtener(Long id) {
        return em.find(Tag.class, id);
    }

    public Tag guardar(Tag entidad) {
        em.persist(entidad);
        return entidad;
    }

    public void borrar(Long id) {
        em.remove(em.find(Tag.class, id));
    }

    public void actualizar(Tag entidad) {
        em.merge(entidad);
    }

}
