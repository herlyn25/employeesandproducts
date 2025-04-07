package com.herlyn.employees.repository;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.herlyn.employees.models.Employees;

@Repository
public class EmployeesRepositoryImp implements EmployeeRepository {

    private List<Employees> data;

    public EmployeesRepositoryImp(){
        this.data = Arrays.asList(
            new Employees(1L,"Herlyn","Castillo","Desarrollador Junior", 200),
            new Employees(2L,"Helver","Castillo","Prestamista", 150),
            new Employees(3L,"Elkin","Castillo","Maestro de obra", 100)
            );
    }

    @Override
    public List<Employees> findAll(){
        return data;
    }

    @Override
    public Employees getById(Long id){
        return data.stream().filter(p->p.getId().equals(id)).findFirst().orElse(null);
    }

}