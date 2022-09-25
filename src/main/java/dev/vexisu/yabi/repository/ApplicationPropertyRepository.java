package dev.vexisu.yabi.repository;

import org.springframework.data.repository.CrudRepository;

import dev.vexisu.yabi.impl.ApplicationProperty;

public interface ApplicationPropertyRepository extends CrudRepository<ApplicationProperty, String> {
    
}
