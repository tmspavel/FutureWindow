package com.tms.oknapvh.service;

import com.tms.oknapvh.dto.OrderDto;
import com.tms.oknapvh.dto.WindowDto;
import com.tms.oknapvh.entity.OrderEntity;
import com.tms.oknapvh.entity.OrderStatus;
import com.tms.oknapvh.entity.WindowEntity;

import java.util.List;
import java.util.UUID;

public interface OrderService {

    List<OrderDto> getAll();

    OrderEntity createOrder(WindowEntity window);

    OrderDto getById(UUID orderId);

    void deleteOrder(UUID orderId);

    OrderEntity updateStatusById(UUID id, OrderStatus status);

    List<OrderDto> getByUserId(UUID id);

}
