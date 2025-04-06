package com.herlyn.employees.repository;

import java.util.List;

import com.herlyn.employees.models.Employees;

public interface EmployeeRepository {
    List<Employees> findAll();
    Employees getById(Long id);
}
