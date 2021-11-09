package aplicacion.spring.model;

import java.io.Serializable;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto")
	private long id;
	
	@Column(name = "nombre_producto")
	private String nombre;
	
	@Column(name = "descripcion_producto")
	private String descripcion;
	
	@Column(name = "precio_producto")
	private double precio;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "id_empresa")
	private Empresa empresa;
	
	@Column(name = "imagen_producto")
	private String imagen;

	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="id_categoria")
	private Categoria categoria;
	

	
}
