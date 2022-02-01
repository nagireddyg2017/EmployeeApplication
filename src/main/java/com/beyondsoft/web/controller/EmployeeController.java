package com.beyondsoft.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beyondsoft.web.model.Employees;
import com.beyondsoft.web.repository.EmployeeDAO;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController 
{
    
    
	@Autowired
    private Employees employees;
     
    /*@GetMapping(path="/", produces = "application/json")
    public Employees getEmployees() 
    {
        //return employeeDao.getAllEmployees();
        return employeeDao.getAllEmployees();
    } */
    
    @Autowired
    private EmployeeDAO employeeDao;
    @PostMapping(path="/", consumes = "application/json")
    public Employees saveEmployee() 
    {
        
        return employeeDao.save(employees);
    }
}