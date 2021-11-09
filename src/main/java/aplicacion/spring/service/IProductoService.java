package aplicacion.spring.service;

import java.util.List;
import aplicacion.spring.model.Producto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public interface IProductoService {
	
	public List<Producto> findAll();
	
	public List<Producto> findbyCategoria(long id);
	
}
