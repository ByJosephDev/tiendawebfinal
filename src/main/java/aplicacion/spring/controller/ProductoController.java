package aplicacion.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import aplicacion.spring.dao.IproductoDAO;
import aplicacion.spring.model.Producto;
import aplicacion.spring.service.IProductoService;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping(value = "productos")
public class ProductoController {

	@Autowired
	private IProductoService productoService;
	
	@GetMapping
	@RequestMapping(value = "/listar")
	public List<Producto> listar(){
		return productoService.findAll();
	}
	
	@GetMapping
	@RequestMapping(value = "/categoria")
	public List<Producto> listar(@RequestParam(defaultValue = "1" ) long id){
		return productoService.findbyCategoria(id);
	}
}
