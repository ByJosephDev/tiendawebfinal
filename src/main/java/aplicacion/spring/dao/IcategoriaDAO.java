package aplicacion.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aplicacion.spring.model.Categoria;

@Repository
public interface IcategoriaDAO extends JpaRepository<Categoria, Long>{
	
}
