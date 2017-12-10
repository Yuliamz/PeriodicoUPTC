package uptc.sw2.periodico.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author Julian Grijalba
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArticuloDTO {

    public ArticuloDTO(){
        //constructor base
    }
    
    public ArticuloDTO(Long id){
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
    private String titulo;
    
    /**
    * @generated
    */
    private String imagen;
    
    /**
    * @generated
    */
    private String texto;
    
    /**
    * @generated
    */
    private String resumen;
    
    /**
    * @generated
    */
    private String tags;
    
    
    /**
    * @generated
    */
    private SeccionDTO seccion;
    
    /**
    * @generated
    */
    public String getTitulo() {
        return this.titulo;
    }
    
    /**
    * @generated
    */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
    * @generated
    */
    public String getImagen() {
        return this.imagen;
    }
    
    /**
    * @generated
    */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    /**
    * @generated
    */
    public String getTexto() {
        return this.texto;
    }
    
    /**
    * @generated
    */
    public void setTexto(String texto) {
        this.texto = texto;
    }
    /**
    * @generated
    */
    public String getResumen() {
        return this.resumen;
    }
    
    /**
    * @generated
    */
    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    /**
    * @generated
    */
    public String getTags() {
        return this.tags;
    }
    
    /**
    * @generated
    */
    public void setTags(String tags) {
        this.tags = tags;
    }
    
	/**
	* @generated
	*/
	public SeccionDTO getSeccion() {
	    return this.seccion;
	}
	
	/**
	* @generated
	*/
	public void setSeccion(SeccionDTO seccion) {
	    this.seccion = seccion;
	}
	
}
