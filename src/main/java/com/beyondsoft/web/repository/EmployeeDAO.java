package com.beyondsoft.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.beyondsoft.web.model.Employees;

@Repository
@Component
public interface EmployeeDAO  extends JpaRepository<Employees, Long> 
{
	
	
}
