package com.pierre.tacos.data;

import com.pierre.tacos.Order;

public interface OrderRepository {

    Order save(Order order);

}
