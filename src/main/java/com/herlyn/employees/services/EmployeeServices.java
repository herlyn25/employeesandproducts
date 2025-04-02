package com.herlyn.employees.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;

import com.herlyn.employees.models.Employees;
import com.herlyn.employees.repository.EmployeesRepository;

public class EmployeeServices {
  EmployeesRepository repository = new EmployeesRepository();
    
    public List<Employees> listEmployees() {
        return repository.findAll().stream().map(emp->{
            Double salaryBonus = emp.getSalario()*1.30;
            Employees employees = new Employees(emp.getId(),emp.getName(),emp.getLastname(),emp.getPosition(),salaryBonus);
            return employees;
        }).collect(Collectors.toList());
    }    
    
    public Employees employeeById(@PathVariable Long id) {
        return repository.getById(id);
    }
}