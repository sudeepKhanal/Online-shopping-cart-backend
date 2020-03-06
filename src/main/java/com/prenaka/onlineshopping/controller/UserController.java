package com.prenaka.onlineshopping.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prenaka.onlineshopping.dto.UserDto;
import com.prenaka.onlineshopping.service.UserService;
import com.prenaka.onlineshopping.util.ServiceResponse;

@RestController
@RequestMapping("role")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping
	public ResponseEntity<ServiceResponse> saveUser(@RequestBody UserDto userDto) {
		userService.saveUser(userDto);
		return new ResponseEntity<>(ServiceResponse.getServiceResponse("User has been registered successfully."),
				HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<ServiceResponse> updateUser(@RequestBody UserDto userDto) {
		userService.updateUser(userDto);
		return new ResponseEntity<>(ServiceResponse.getServiceResponse("user has been updated successfully."),
				HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ServiceResponse> deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
		return new ResponseEntity<>(ServiceResponse.getServiceResponse("User has been deleted successfully."),
				HttpStatus.OK);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<ServiceResponse> getUser(@PathVariable Long id) {
		return new ResponseEntity<>(ServiceResponse.getServiceResponse("User has been deleted successfully.")
				.addParam("role", userService.getUserById(id)), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<ServiceResponse> getUser() {
		return new ResponseEntity<>(ServiceResponse.getServiceResponse("User has been retrieved successfully.")
				.addParam("roles", userService.getAllUser()), HttpStatus.OK);
	}

}
