package com.prenaka.onlineshopping.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prenaka.onlineshopping.dto.UserDto;
import com.prenaka.onlineshopping.model.UserEntity;
import com.prenaka.onlineshopping.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void saveUser(UserDto userDto) {
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(userDto, userEntity);
		userRepository.save(userEntity);

	}

	@Override
	public void updateUser(UserDto userDto) {
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(userDto, userEntity);
		userRepository.save(userEntity);
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public UserDto getUserById(Long id) {
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userRepository.findById(id), userDto);
		return userDto;
	}

	@Override
	public List<UserDto> getAllUser() {
		return userRepository.findAll().stream().map(UserEntity -> {
			UserDto userDto = new UserDto();
			BeanUtils.copyProperties(UserEntity, userDto);
			return userDto;
		}).collect(Collectors.toList());
	}

}
