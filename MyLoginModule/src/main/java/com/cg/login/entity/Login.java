package com.cg.login.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mylogin_login")
public class Login {
	
	@Id
	@Column(name = "user_id")
	private Integer userId;
	
	@Column(name="login_password",length=25)
	private String password;
	
	
	@Column(name="login_role",length=25)
	private String role;
	
	@OneToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	@MapsId
	private User user;
	

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Login() {
		
	}
	

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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
	
	
}
