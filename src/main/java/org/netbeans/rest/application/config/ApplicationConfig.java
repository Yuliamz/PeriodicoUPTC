package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 * Esta clase registra la informacion de las clases que van a ser utilizadas
 * como servicios REST
 *
 * @author Julian Grijalba
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(uptc.sw2.periodico.servicio.AdministradorService.class);
        resources.add(uptc.sw2.periodico.servicio.ArticuloService.class);
        resources.add(uptc.sw2.periodico.servicio.SeccionService.class);
        resources.add(uptc.sw2.periodico.servicio.TagService.class);
    }

}
