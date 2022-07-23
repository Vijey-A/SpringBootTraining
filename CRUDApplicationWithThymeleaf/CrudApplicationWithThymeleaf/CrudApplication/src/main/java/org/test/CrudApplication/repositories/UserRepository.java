package org.test.CrudApplication.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.test.CrudApplication.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}