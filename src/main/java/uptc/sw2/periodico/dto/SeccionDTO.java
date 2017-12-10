package uptc.sw2.periodico.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author Julian Grijalba
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SeccionDTO {

    public SeccionDTO(){
        //constructor base
    }
    
    public SeccionDTO(Long id){
        this.id=id;
    }

	private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	
    
    /**
    * @generated
    */
    private String nombre;
    
    /**
    * @generated
    */
    private Integer cantidadArticulos;
    
    
    /**
    * @generated
    */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
    * @generated
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
    * @generated
    */
    public Integer getCantidadArticulos() {
        return this.cantidadArticulos;
    }
    
    /**
    * @generated
    */
    public void setCantidadArticulos(Integer cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
    }
    
	
}
