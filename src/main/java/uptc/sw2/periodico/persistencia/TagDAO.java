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

    /**
     * Devuelve una lista con todos las entidades TAG en la base de datos
     * @return Lista de entidades TAG
     */
    public List<Tag> obtenerTodos() {
        return em.createNamedQuery("Tag.obtenerTodos").getResultList();
    }
 /**
     * Obtiene la entidad TAG consecuente al ID en la base de datos
     * @param id ID de la entidad TAG 
     * @return TAG correspondiente al ID
     */
    public Tag obtener(Long id) {
        return em.find(Tag.class, id);
    }
/**
     * Persite la entidad TAG en la base de datos
     * @param entidad Entidad TAG que se va a persistir
     * @return Entidad TAG con su ID
     */
    public Tag guardar(Tag entidad) {
        em.persist(entidad);
        return entidad;
    }
/**
     * Elimina la entidad TAG de la base de datos correspondiente al ID especificado
     * @param id ID de la entidad TAG que se va a eliminar
     */
    public void borrar(Long id) {
        em.remove(em.find(Tag.class, id));
    }
/**
     * Actualiza la informacion de la entidad TAG, que cuenta con su ID, en la base de datos
     * @param entidad Entidad TAG con su ID
     */
    public void actualizar(Tag entidad) {
        em.merge(entidad);
    }

}
