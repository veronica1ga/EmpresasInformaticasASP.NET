package es.cifpcm.forvagosgonzalezv.web.bean2;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import es.cifpcm.forvagosgonzalezv.web.data.*;
import es.cifpcm.forvagosgonzalezv.web.model.*;

/**
 * @author Veronica Gonzalez
 *
 */
@Named(value = "dataBean")
@ApplicationScoped
public class DataBean {
	private static final long serialVersionUID = 1L;

	private List<User> usuarios = new ArrayList<User>();
	private List<UserGroup> grupos_usuario = new ArrayList<UserGroup>();
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
	 * @return the grupos_usuario
	 */
	public List<UserGroup> getGrupos_usuario() {
		return grupos_usuario;
	}
	/**
	 * @param grupos_usuario the grupos_usuario to set
	 */
	public void setGrupos_usuario(List<UserGroup> grupos_usuario) {
		this.grupos_usuario = grupos_usuario;
	}

	/**
	 * Creates a new instance of MasterDataBean
	 */

	public DataBean() {
		UsersDAO userDao = DaoFactory.getInstance().getUsersDao();
		this.usuarios.addAll(userDao.selectAll(null, null));
	}

	

}
