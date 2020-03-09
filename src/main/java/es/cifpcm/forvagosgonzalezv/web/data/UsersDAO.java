package es.cifpcm.forvagosgonzalezv.web.data;

import java.util.List;

import es.cifpcm.forvagosgonzalezv.web.model.User;
import es.cifpcm.forvagosgonzalezv.web.model.UserGroup;

public interface UsersDAO {
	Boolean userLogueado(String user, String password);
	List<User> selectAll(String userName, String password);
	String groupLogueado(String userGroup);
}
