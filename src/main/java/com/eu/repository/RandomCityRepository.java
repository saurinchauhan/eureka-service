package com.eu.repository;

import org.springframework.data.repository.CrudRepository;

import com.eu.domain.RandomCity;

public interface RandomCityRepository extends CrudRepository<RandomCity, Long> {
}
