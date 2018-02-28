package com.eu.service;

import java.util.List;

import com.eu.domain.RandomCity;
import com.eu.domain.User;

public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}
