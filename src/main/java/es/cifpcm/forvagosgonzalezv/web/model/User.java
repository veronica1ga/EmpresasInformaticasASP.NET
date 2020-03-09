package es.cifpcm.forvagosgonzalezv.web.model;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Short userId;

	private String password;

	private String userName;
	private List<UserGroup> grupo;
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String password, String userName) {
		// TODO Auto-generated constructor stub
		super();
		this.password=password;
		this.userName=userName;
	}
	
	public User(String password, String userName, List<UserGroup> grupo) {
		// TODO Auto-generated constructor stub
		super();
		this.password=password;
		this.userName=userName;
		this.grupo=grupo;
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
	 * @return the grupo
	 */
	public List<UserGroup> getGrupo() {
		return grupo;
	}

	/**
	 * @param grupo the grupo to set
	 */
	public void setGrupo(List<UserGroup> grupo) {
		this.grupo = grupo;
	}

}
