package com.prenaka.onlineshopping.service;

import java.util.List;

import com.prenaka.onlineshopping.dto.UserDto;

public interface UserService {
	void saveUser(UserDto userDto);

	void updateUser(UserDto userDto);

	void deleteUser(Long id);

	UserDto getUserById(Long id);

	List<UserDto> getAllUser();

}
