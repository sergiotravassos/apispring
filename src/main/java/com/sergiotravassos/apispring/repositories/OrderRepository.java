package com.sergiotravassos.apispring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiotravassos.apispring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
