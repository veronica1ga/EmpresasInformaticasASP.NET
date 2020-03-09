package es.cifpcm.forvagosgonzalezv.web.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;

import es.cifpcm.forvagosgonzalezv.web.model.User;

public class UsersDaoImpl implements UsersDAO {
	private final org.slf4j.Logger logger = LoggerFactory.getLogger(UsersDaoImpl.class);
	DaoFactory dao = DaoFactory.getInstance();
	Connection conn = dao.getConnection();

	public UsersDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<User> selectAll(String userName, String password) {
		// TODO Auto-generated method stub
		List<User> usuarios = new ArrayList<User>();
		try {
			String sql = "SELECT * FROM users";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				User u = new User();
				u.setUserId(rs.getShort(1));
				u.setUserName(rs.getString(2));
				u.setPassword(rs.getString(3));
				usuarios.add(u);
			}

			logger.info("Consulta OK: {}", sql);
		} catch (SQLException ex) {
			logger.error("ERROR: {}", ex.getMessage());
			ex.printStackTrace();
		} finally { // Se cierra la conexión con la base de datos.
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				logger.error("ERROR: {}", ex.getMessage());
				ex.printStackTrace();
			}
		}
		return usuarios;
	}

	@Override
	public Boolean userLogueado(String user, String password) {
		// TODO Auto-generated method stub
		Boolean check=false;
		try {
			String sql = "SELECT user_name, password FROM users where user_name=? and password=?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, user);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			check=rs.first();
			logger.info("Consulta OK: {}", sql);
		} catch (SQLException ex) {
			logger.error("ERROR: {}", ex.getMessage());
			ex.printStackTrace();
		} /*finally { // Se cierra la conexión con la base de datos.
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				logger.error("ERROR: {}", ex.getMessage());
				ex.printStackTrace();
			}
		}*/
		return check;
	}

	@Override
	public String groupLogueado(String userName) {
		//Boolean grupoUsuario=false;
		String userGroup = null;
		try {
			String sql = "SELECT groups.group_name FROM users_groups INNER JOIN groups ON users_groups.group_id=groups.group_id WHERE user_name=?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, userName);
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				userGroup=rs.getString("group_name");
			}
				
			//grupoUsuario=rs.first();
			logger.info("Consulta OK: {}", sql);
		} catch (SQLException ex) {
			logger.error("ERROR: {}", ex.getMessage());
			ex.printStackTrace();
		} /*finally { // Se cierra la conexión con la base de datos.
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				logger.error("ERROR: {}", ex.getMessage());
				ex.printStackTrace();
			}
		}*/
		return userGroup;
	}

}
