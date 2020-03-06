package com.prenaka.onlineshopping.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prenaka.onlineshopping.dto.CustomerDto;
import com.prenaka.onlineshopping.model.CustomerEntity;
import com.prenaka.onlineshopping.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	private final CustomerRepository customerRepository;

	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	@Override
	public void saveCustomer(CustomerDto customerDto) {
		CustomerEntity customerEntity = new CustomerEntity();
		BeanUtils.copyProperties(customerDto, customerEntity);
		customerRepository.save(customerEntity);
	}
	@Override
	public void updateCustomer(CustomerDto customerDto) {
		CustomerEntity customerEntity = new CustomerEntity();
		BeanUtils.copyProperties(customerDto, customerEntity);
		customerRepository.save(customerEntity);
	}

	@Override
	public void deleteCustomer(Long id) {
		customerRepository.deleteById(id);
	}

	@Override
	public CustomerDto getCustomerById(Long id) {
		CustomerDto customerDto = new CustomerDto();
		BeanUtils.copyProperties(customerRepository.findById(id), customerDto);
		return customerDto;
	}
	@Override
	public List<CustomerDto> getAllCustomer() {
		return customerRepository.findAll().stream().map(customerEntity -> {
			CustomerDto customerDto = new CustomerDto();
			BeanUtils.copyProperties(customerEntity, customerDto);
			return customerDto;
		}).collect(Collectors.toList());
	}

}
