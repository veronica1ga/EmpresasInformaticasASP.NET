package es.cifpcm.forvagosgonzalezv.web.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import es.cifpcm.forvagosgonzalezv.web.model.Provincia;

public class ProvDaoImpl implements ProvinciasDao {
	// private final org.slf4j.Logger logger = LoggerFactory.getLogger(Actor.class);
	DaoFactory dao=DaoFactory.getInstance();
	Connection conn = dao.getConnection();
	private Provincia provincias;
	@Override
	public List<Provincia> selectAll() {
		// TODO Auto-generated method stub
		List<Provincia> provincias = new ArrayList<Provincia>();
		try {
			String sql = "SELECT * FROM provincias";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Provincia p = new Provincia();
				p.setId_provincia(rs.getShort(1));
				p.setNombre(rs.getString(2));
				provincias.add(p);
			}

			// logger.info("Consulta OK: {}", sql);
		} catch (SQLException ex) {
			// logger.error("ERROR: {}", ex.getMessage());
			ex.printStackTrace();
		} finally { // Se cierra la conexión con la base de datos.
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				// logger.error("ERROR: {}", ex.getMessage());
				ex.printStackTrace();
			}
		}
		return provincias;
	}
	

}
