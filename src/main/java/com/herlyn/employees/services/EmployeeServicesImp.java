package com.herlyn.employees.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;

import com.herlyn.employees.models.Employees;
import com.herlyn.employees.repository.EmployeesRepositoryImp;

public class EmployeeServicesImp implements EmployeeService{
  EmployeesRepositoryImp repository = new EmployeesRepositoryImp();
    
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