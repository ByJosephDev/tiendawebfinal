package aplicacion.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aplicacion.spring.model.Producto;

@Repository
public interface IproductoDAO extends JpaRepository<Producto, Long> {

}
