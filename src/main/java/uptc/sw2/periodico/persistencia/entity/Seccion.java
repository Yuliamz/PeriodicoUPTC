package uptc.sw2.periodico.persistencia.entity;


import javax.persistence.*;

/**
  *  @generated
  *  @author Julian Grijalba
  */
@Entity
@Table(name="Seccion")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Seccion.obtenerTodos", query="select e from Seccion e")
})
public class Seccion {

	@Id
    //@Column(name = "Seccion_id")
    @GeneratedValue(generator = "SeccionGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SeccionGen", sequenceName = "Seccion_SEQ",allocationSize = 1)
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
    
    //@Column(name = "nombre")
    private String nombre;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "cantidadArticulos")
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
