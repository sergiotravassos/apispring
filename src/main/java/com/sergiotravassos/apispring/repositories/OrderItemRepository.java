package com.sergiotravassos.apispring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiotravassos.apispring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
