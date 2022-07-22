package org.test.SpringBootOracleCRUDRestfulAPI.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.test.SpringBootOracleCRUDRestfulAPI.model.Employee;
import org.test.SpringBootOracleCRUDRestfulAPI.service.EmployeeService;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController
{
    private EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }

    @PostMapping()
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return  new ResponseEntity<Employee> (employeeService.saveEmployee(employee),HttpStatus.CREATED);
    }

    @GetMapping
    public List<Employee> getAllEmployees()
    {
        return employeeService.getAllEmployees();
    }

    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeBtId(@PathVariable("id") long employeeId)
    {
        return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId),HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)

    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id,@RequestBody Employee employee)
    {
        return new ResponseEntity<Employee>(employeeService.updateEmployee(employee,id),HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)

    public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id)
    {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<String>("Employee deleted successfully..",HttpStatus.OK);
    }
}
