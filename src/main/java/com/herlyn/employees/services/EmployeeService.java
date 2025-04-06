package com.herlyn.employees.services;

import java.util.List;

import com.herlyn.employees.models.Employees;

public interface EmployeeService {

     List<Employees> listEmployees();
     Employees employeeById(Long id);
} 


