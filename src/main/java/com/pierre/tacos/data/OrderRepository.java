package com.pierre.tacos.data;

import org.springframework.data.repository.CrudRepository;

import com.pierre.tacos.Order;

public interface OrderRepository
         extends CrudRepository<Order, Long> {

}
