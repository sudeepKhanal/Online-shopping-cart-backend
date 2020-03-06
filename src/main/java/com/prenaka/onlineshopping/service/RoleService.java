package com.prenaka.onlineshopping.service;

import java.util.List;

import com.prenaka.onlineshopping.dto.RoleDto;

public interface RoleService {

	void saveRole(RoleDto roleDto);

	void updateRole(RoleDto roleDto);

	void deleteRole(Long id);

	RoleDto getRoleById(Long id);

	List<RoleDto> getAllRole();

}
