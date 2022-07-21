package com.sergiotravassos.apispring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiotravassos.apispring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
