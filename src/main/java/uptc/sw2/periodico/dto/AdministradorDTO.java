package uptc.sw2.periodico.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author Julian Grijalba
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdministradorDTO {

    public AdministradorDTO(){
        //constructor base
    }
    
    public AdministradorDTO(Long id){
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
    private String usuario;
    
    /**
    * @generated
    */
    private String contraseña;
    
    
    /**
    * @generated
    */
    public String getUsuario() {
        return this.usuario;
    }
    
    /**
    * @generated
    */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    /**
    * @generated
    */
    public String getContraseña() {
        return this.contraseña;
    }
    
    /**
    * @generated
    */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
	
}
