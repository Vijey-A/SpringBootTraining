package org.test.SpringBootOracleCRUDRestfulAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.test.SpringBootOracleCRUDRestfulAPI.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}