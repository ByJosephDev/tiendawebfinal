package aplicacion.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aplicacion.spring.dao.IcategoriaDAO;
import aplicacion.spring.model.Categoria;

@RestController()
@RequestMapping(value = "categorias")
public class CategoriaController {

	@Autowired
	private IcategoriaDAO categoriadao;
	
	@GetMapping("/listar")
	public List<Categoria> listar(){
		return categoriadao.findAll();
	}
	
}
