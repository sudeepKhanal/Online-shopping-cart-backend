package com.prenaka.onlineshopping.service;

import java.util.List;
import com.prenaka.onlineshopping.dto.OrderDto;

public interface OrderService {
	void saveOrder(OrderDto orderDto);

	void updateOrder(OrderDto orderDto);

	void deleteOrder(Long id);

	OrderDto getOrderById(Long id);

	List<OrderDto> getAllOrder();

}
