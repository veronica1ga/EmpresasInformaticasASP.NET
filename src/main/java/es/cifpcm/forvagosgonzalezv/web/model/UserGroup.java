package es.cifpcm.forvagosgonzalezv.web.model;

import java.io.Serializable;

public class UserGroup implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int group_id;
	
	private String user_name;

	public UserGroup() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the group_id
	 */
	public int getGroup_id() {
		return group_id;
	}

	/**
	 * @param group_id the group_id to set
	 */
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}

	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

}
