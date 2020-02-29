package es.cifpcm.forvagosgonzalezv.web.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import es.cifpcm.forvagosgonzalezv.web.model.Municipio;
import es.cifpcm.forvagosgonzalezv.web.model.Provincia;

public class MunDaoImpl implements MunicipiosDao {
	// private final org.slf4j.Logger logger = LoggerFactory.getLogger(Actor.class);
	DaoFactory dao=DaoFactory.getInstance();
	Connection conn = dao.getConnection();
	@Override
	public List<Municipio> selectAll() {
		// TODO Auto-generated method stub
		List<Municipio> municipios = new ArrayList<Municipio>();
		try {
			String sql = "SELECT * FROM municipios";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Municipio m = new Municipio();
				m.setId_municipio(rs.getShort(1));
				m.setId_provincia(rs.getShort(2));
				m.setCod_municipio(rs.getInt(3));
				m.setDc(rs.getInt(4));
				m.setNombre(rs.getString(5));
				municipios.add(m);
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
		return municipios;
	}
	
	public List<Municipio> cambioProvincia(Short id_provincia, List<Municipio> municipios) {
		List<Municipio> municipioFiltro = new ArrayList<>();
		for(Municipio mun:municipios) {
			if(mun.getId_provincia()==id_provincia) {
				municipioFiltro.add(mun);
			}
		}
		return municipioFiltro;
	}
	
	

}
