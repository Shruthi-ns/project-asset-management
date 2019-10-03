package com.xworkz.assetmanagement.dto;

import org.apache.log4j.Logger;
public class LoginDTO {

	private static final Logger logger = Logger.getLogger(LoginDTO.class);

	
	private int uid;
	private String name;
	private String email;
	private String password;
	private String role;
	private boolean resetPassword;
	private String generatedPassword;

	public LoginDTO() {
		logger.info("created.." + this.getClass().getSimpleName());
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isResetPassword() {
		return resetPassword;
	}

	public void setResetPassword(boolean resetPassword) {
		this.resetPassword = resetPassword;
	}

	public String getGeneratedPassword() {
		return generatedPassword;
	}

	public void setGeneratedPassword(String generatedPassword) {
		this.generatedPassword = generatedPassword;
	}

	@Override
	public String toString() {
		return "LoginDTO [uid=" + uid + ", name=" + name + ", email=" + email + ", password=" + password + ", role="
				+ role + ", resetPassword=" + resetPassword + ", generatedPassword=" + generatedPassword + "]";
	}

}
