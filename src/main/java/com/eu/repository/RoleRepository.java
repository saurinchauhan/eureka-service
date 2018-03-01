package com.eu.repository;

import org.springframework.data.repository.CrudRepository;

import com.eu.domain.Role;

/**
 * Created by nydiarra on 06/05/17.
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
}
