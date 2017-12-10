package uptc.sw2.periodico.persistencia.entity;


import javax.persistence.*;

/**
  *  @generated
  *  @author Julian Grijalba
  */
@Entity
@Table(name="Tag")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Tag.obtenerTodos", query="select e from Tag e")
})
public class Tag {

	@Id
    //@Column(name = "Tag_id")
    @GeneratedValue(generator = "TagGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "TagGen", sequenceName = "Tag_SEQ",allocationSize = 1)
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
    
	
}
