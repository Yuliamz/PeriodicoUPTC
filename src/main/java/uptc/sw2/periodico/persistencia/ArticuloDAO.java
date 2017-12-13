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
/**
     * Devuelve una lista con todos las entidades Articulo en la base de datos
     * @return Lista de entidades Articulo
     */
    public List<Articulo> obtenerTodos() {
        return em.createNamedQuery("Articulo.obtenerTodos").getResultList();
    }

    /**
     * Obtiene la entidad Articulo consecuente al ID en la base de datos
     * @param id ID de la entidad Articulo 
     * @return Articulo correspondiente al ID
     */
    public Articulo obtener(Long id) {
        return em.find(Articulo.class, id);
    }

    /**
     * Persite la entidad Articulo en la base de datos
     * @param entidad Entidad Articulo que se va a persistir
     * @return Entidad Articulo con su ID
     */
    public Articulo guardar(Articulo entidad) {
        em.persist(entidad);
        return entidad;
    }
/**
     * Elimina la entidad Articulo de la base de datos correspondiente al ID especificado
     * @param id ID de la entidad Articulo que se va a eliminar
     */
    public void borrar(Long id) {
        em.remove(em.find(Articulo.class, id));
    }
/**
     * Actualiza la informacion de la entidad Articulo, que cuenta con su ID, en la base de datos
     * @param entidad Entidad Articulo con su ID
     */
    public void actualizar(Articulo entidad) {
        em.merge(entidad);
    }

}
