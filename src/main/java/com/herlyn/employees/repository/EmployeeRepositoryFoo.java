package com.herlyn.employees.repository;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.herlyn.employees.models.Employees;


@Repository("foo")
public class EmployeeRepositoryFoo implements EmployeeRepository {

    @Override
    public List<Employees> findAll() {
        return Collections.singletonList(new Employees(4L, "Juan","Perez", "tendero", 500));
    }

    @Override
    public Employees getById(Long id) {        
        return new Employees(id, "Juan","Perez", "tendero", 500);
    }
}