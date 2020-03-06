package com.prenaka.onlineshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_tbl")
public class UserEntity extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "user_name")
	private String userName;
	private String password;
	private String email;
	@ManyToOne
	@JoinColumn(name = "role_id")
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
