package aplicacion.spring.libreria;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Libreria {
	
	public JdbcTemplate conn;
	public String driver="com.mysql.cj.jdbc.Driver";
	public String cadena="jdbc:mysql://localhost:3306/tiendaweb";
	public String usuario="root";
	public String password="root";
	
	public JdbcTemplate obtener_conexion() {
		
		DriverManagerDataSource dm = new DriverManagerDataSource();
		dm.setDriverClassName(driver);
		dm.setUrl(cadena);
		dm.setUsername(usuario);
		dm.setPassword(password);
		
		conn = new JdbcTemplate(dm);
		return conn;
		
	}

}
