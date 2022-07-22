package org.test.SpringBootDemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.test.SpringBootDemo.model.Developer;

public interface DeveloperRepository extends CrudRepository<Developer, Long> {

}