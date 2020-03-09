package es.cifpcm.forvagosgonzalezv.web.bean2;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cifpcm.forvagosgonzalezv.web.bean2.DataBean;
import es.cifpcm.forvagosgonzalezv.web.data.UsersDAO;
import es.cifpcm.forvagosgonzalezv.web.data.UsersDaoImpl;
import es.cifpcm.forvagosgonzalezv.web.model.User;
import es.cifpcm.forvagosgonzalezv.web.model.Group;

/**
 * @author Veronica Gonzalez
 *
 */
@Named(value = "usuarioBean")
@SessionScoped
public class UsuarioBean extends User {
	private static final long serialVersionUID = 1L;
	private final Logger logger = LoggerFactory.getLogger(UsuarioBean.class);
	private Short userId;
	private String userName;
	private String password;
	private List<User> usuarios;
	private String groupName;

	@Inject
	DataBean DataBean;

	@PostConstruct
	public void init() {
		this.usuarios = DataBean.getUsuarios();
	}

	/**
	 * @return the userId
	 */
	public Short getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Short userId) {
		this.userId = userId;
	}

	/**
	 * @return the usuarios
	 */
	public List<User> getUsuarios() {
		return usuarios;
	}

	/**
	 * @param usuarios the usuarios to set
	 */
	public void setUsuarios(List<User> usuarios) {
		this.usuarios = usuarios;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * @param groupName the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String save() {
		//permite comparar usuario y contraseña para ver si está en la base de datos o no
		UsersDAO usuariodao = new UsersDaoImpl();
		if (this.userName != null && usuariodao.userLogueado(this.userName, this.password) == true) {
			groupName=usuariodao.groupLogueado(this.userName);
			return "newCustomer";
		}
		else {
			return "error";
		}

	}

}
