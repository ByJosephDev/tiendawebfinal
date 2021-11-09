package aplicacion.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aplicacion.spring.dao.IcategoriaDAO;
import aplicacion.spring.dao.IproductoDAO;
import aplicacion.spring.model.Categoria;
import aplicacion.spring.model.Producto;
import aplicacion.spring.libreria.Libreria;


@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private IproductoDAO productoDao;
		
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		Libreria lib=new Libreria();
		JdbcTemplate td=lib.obtener_conexion();
		String codigo="select p.id_producto,p.imagen_producto,p.nombre_producto,p.descripcion_producto,p.precio_producto,"
				+ "c.nombre_categoria,e.nombre_empresa from Productos p left join Categorias c on(c.id_categoria=p.id_categoria) left join Empresas e on(e.id_empresa=p.id_empresa);";
		List lista= td.queryForList(codigo);
		return lista;
	}

	@Override
	public List<Producto> findbyCategoria(long id) {
		Libreria lib=new Libreria();
		JdbcTemplate td=lib.obtener_conexion();
		String codigo="select p.id_producto,p.imagen_producto,p.nombre_producto,p.descripcion_producto,p.precio_producto,"
				+ "c.nombre_categoria,e.nombre_empresa from Productos p left join Categorias c on(c.id_categoria=p.id_categoria) left join Empresas e on(e.id_empresa=p.id_empresa) where p.id_categoria="+id+";";
		List lista= td.queryForList(codigo);
		return lista;
	}


}
