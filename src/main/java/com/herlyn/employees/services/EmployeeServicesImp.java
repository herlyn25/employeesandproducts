package com.herlyn.employees.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.herlyn.employees.models.Employees;
import com.herlyn.employees.repository.EmployeeRepository;

@Service
public class EmployeeServicesImp implements EmployeeService{
  

 private EmployeeRepository repository;  

 
  public EmployeeServicesImp(@Qualifier("foo") EmployeeRepository repository) {
    this.repository=repository;
}

  @Override
    public List<Employees> listEmployees() {
        return repository.findAll().stream().map(emp->{
            Double salaryBonus = emp.getSalario()*1.30;
            Employees employees = (Employees) emp.clone();
            employees.setSalario(salaryBonus);
            return employees;
        }).collect(Collectors.toList());
    }    
    
    @Override
    public Employees employeeById(@PathVariable Long id) {
        return repository.getById(id);
    }
}