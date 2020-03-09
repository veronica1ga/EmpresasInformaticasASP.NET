package es.cifpcm.forvagosgonzalezv.web.data;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import es.cifpcm.forvagosgonzalezv.web.model.Hoteloffer;



public class HotelDaoImpl implements HotelDao{

	DaoFactory dao=DaoFactory.getInstance();
	Connection conn = dao.getConnection();
	
	public Hoteloffer insert(Hoteloffer hoteloffer) {
		Hoteloffer hotelInsertado= hoteloffer;
        String sql= "insert into hoteloffer (name, price, idMunicipio) value (?,?,?)";
        try{
        	PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, hoteloffer.getName());
            stmt.setBigDecimal(2, hoteloffer.getPrice());
            stmt.setInt(3, hoteloffer.getIdMunicipio());
            stmt.executeUpdate();
            ResultSet rs=stmt.getGeneratedKeys();
            while(rs.next()){
            	hoteloffer.setHotelId(rs.getInt(1));
            }
            hotelInsertado=hoteloffer;
            //logger.info("Consulta OK: {}", sql);
            
        }catch(SQLException ex){
            //logger.error("ERROR sql: {}", ex.getMessage());
        	ex.printStackTrace();
        }
        return hotelInsertado;
	
	}


	@Override
	public List<Hoteloffer> selectAll() {
		
		List<Hoteloffer> hoteles = new ArrayList<Hoteloffer>();
		try {
			String sql = "SELECT * FROM hoteloffer";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Hoteloffer a = new Hoteloffer();
				a.setHotelId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setPrice(rs.getBigDecimal(3));
				a.setHotelPicture(rs.getString(4));
				a.setHotelPicture(rs.getString(5));
				hoteles.add(a);
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
		return hoteles;
	}
}
