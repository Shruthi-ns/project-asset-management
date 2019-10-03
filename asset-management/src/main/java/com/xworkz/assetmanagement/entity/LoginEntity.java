package com.xworkz.assetmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.apache.log4j.Logger;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "login_check")
@NamedQueries({
		@NamedQuery(name = "isValidUser", query = "select login from LoginEntity login where login.email=:email and login.password=:password") })
public class LoginEntity {

	private static final Logger logger = Logger.getLogger(LoginEntity.class);

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "l_id")
	private int id;
	@Column(name = "uid")
	private int uid;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "role")
	private String role;
	@Column(name = "resetPassword")
	private boolean resetPassword;
	@Column(name = "generatedPassword")
	private String generatedPassword;

	public LoginEntity() {
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
