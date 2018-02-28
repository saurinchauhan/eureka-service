package com.eu.repository;

import org.springframework.data.repository.CrudRepository;

import com.eu.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
