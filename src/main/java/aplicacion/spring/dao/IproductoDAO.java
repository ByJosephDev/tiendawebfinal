package aplicacion.spring.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import aplicacion.spring.model.Producto;

@Repository
public interface IproductoDAO extends JpaRepository<Producto, Long> {

	//@Query(value = "select p from Producto p left join fetch p.categoria")
	//public List<Producto> findAll();

	//@Query(value = "select p from Producto p left join fetch p.categoria",
	//		countQuery = "select count(p) from Producto p left join p.categoria" )
	//public Page<Producto> findAll(Pageable pageable);
	
	//@Query(value = "select p from Producto p left join fetch p.categoria where p.id = :var_id")
	//public Producto findById(@Param("var_id") long id);
}

