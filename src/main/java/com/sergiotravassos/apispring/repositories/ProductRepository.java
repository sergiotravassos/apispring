package com.sergiotravassos.apispring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiotravassos.apispring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
