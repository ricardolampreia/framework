package com.backoffice.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "loginBean")
public class LoginBean {
	private String user="";
	private String password="";
	
	public String onButtonSubmit() {
		user = "bajoras";
		return ("pages/login.xhtml");
	}
	

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
