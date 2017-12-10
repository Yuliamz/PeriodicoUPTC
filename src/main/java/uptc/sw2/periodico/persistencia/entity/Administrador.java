package uptc.sw2.periodico.persistencia.entity;


import javax.persistence.*;

/**
  *  @generated
  *  @author Julian Grijalba
  */
@Entity
@Table(name="Administrador")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Administrador.obtenerTodos", query="select e from Administrador e")
})
public class Administrador {

	@Id
    //@Column(name = "Administrador_id")
    @GeneratedValue(generator = "AdministradorGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "AdministradorGen", sequenceName = "Administrador_SEQ",allocationSize = 1)
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
    
    //@Column(name = "usuario")
    private String usuario;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "contraseña")
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
