package com.prenaka.onlineshopping.dto;

import javax.persistence.ManyToOne;

import com.prenaka.onlineshopping.model.BaseEntity;
import com.prenaka.onlineshopping.model.RoleEntity;

public class UserDto extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String userName;
	private String password;
	private String email;
	@ManyToOne
	private RoleEntity roleId;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public RoleEntity getRoleId() {
		return roleId;
	}

	public void setRoleId(RoleEntity roleId) {
		this.roleId = roleId;
	}

}
