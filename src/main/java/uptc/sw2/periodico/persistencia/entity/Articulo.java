package uptc.sw2.periodico.persistencia.entity;


import javax.persistence.*;

/**
  *  @generated
  *  @author Julian Grijalba
  */
@Entity
@Table(name="Articulo")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Articulo.obtenerTodos", query="select e from Articulo e")
})
public class Articulo {

	@Id
    //@Column(name = "Articulo_id")
    @GeneratedValue(generator = "ArticuloGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ArticuloGen", sequenceName = "Articulo_SEQ",allocationSize = 1)
	private Long id;

	public Long getId(){
		return this.id;
	}

	public void setId(Long id){
		this.id=id;
	}
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "titulo")
    private String titulo;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "imagen")
    private String imagen;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "texto")
    private String texto;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "resumen")
    private String resumen;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "tags")
    private String tags;
    
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Seccion seccion;
    
    
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
	public Seccion getSeccion() {
	    return this.seccion;
	}
	
	/**
	* @generated
	*/
	public void setSeccion(Seccion seccion) {
	    this.seccion = seccion;
	}
	
}
