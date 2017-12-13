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

    /**
     * Devuelve una lista con todos las entidades Administrador en la base de datos
     * @return Lista de entidades Administrador
     */
    public List<Administrador> obtenerTodos() {
        return em.createNamedQuery("Administrador.obtenerTodos").getResultList();
    }
 /**
     * Obtiene la entidad Administrador consecuente al ID en la base de datos
     * @param id ID de la entidad Administrador 
     * @return Administrador correspondiente al ID
     */
    public Administrador obtener(Long id) {
        return em.find(Administrador.class, id);
    }
     /**
     * Persite la entidad Administrador en la base de datos
     * @param entidad Entidad Administrador que se va a persistir
     * @return Entidad Administrador con su ID
     */

    public Administrador guardar(Administrador entidad) {
        em.persist(entidad);
        return entidad;
    }
/**
     * Elimina la entidad Administrador de la base de datos correspondiente al ID especificado
     * @param id ID de la entidad Administrador que se va a eliminar
     */
    public void borrar(Long id) {
        em.remove(em.find(Administrador.class, id));
    }

    /**
     * Actualiza la informacion de la entidad Administrador, que cuenta con su ID, en la base de datos
     * @param entidad Entidad Administrador con su ID
     */
    public void actualizar(Administrador entidad) {
        em.merge(entidad);
    }

}
