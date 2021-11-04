package aplicacion.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import aplicacion.spring.dao.IproductoDAO;
import aplicacion.spring.model.Producto;

@RestController
@RequestMapping(value = "productos")
public class ProductoController {

	@Autowired
	private IproductoDAO productodao;
	
	@GetMapping("/listar")
	public List<Producto> listar(){
		return productodao.findAll();
	}
	
}
