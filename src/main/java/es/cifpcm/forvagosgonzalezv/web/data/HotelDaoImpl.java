package es.cifpcm.forvagosgonzalezv.web.data;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.query.Query;

import es.cifpcm.forvagosgonzalezv.web.model.Hoteloffer;
import es.cifpcm.forvagosgonzalezv.web.model.Municipio;



public class HotelDaoImpl implements HotelDao{
	DaoFactory dao=DaoFactory.getInstance();
	Connection conn = dao.getConnection();
	
	public Hoteloffer insert(Hoteloffer hoteloffer) {
		return hoteloffer;
	
	}


	@Override
	public List<Hoteloffer> selectAll() {
		List<Hoteloffer> listaHoteles = new ArrayList<Hoteloffer>();
		
		try {
			String sql = "SELECT * FROM hoteloffer";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Hoteloffer h = new Hoteloffer();
				h.setHotelId(rs.getInt(1));
				h.setName(rs.getString(2));
				h.setPrice(rs.getBigDecimal(3));
				h.setHotelPicture(rs.getString(4));
				h.setIdMunicipio(rs.getInt(5));
				listaHoteles.add(h);
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
		return listaHoteles;
		
		
	}
}
