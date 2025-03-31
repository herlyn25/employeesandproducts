package com.herlyn.employees.repository;

import java.util.*;

import com.herlyn.employees.models.Employees;

public class EmployeesRepository {

    private List<Employees> data;

    public EmployeesRepository(){
        this.data = Arrays.asList(
            new Employees(1L,"Herlyn","Castillo","Desarrollador Junior"),
            new Employees(2L,"Helver","Castillo","Prestamista"),
            new Employees(3L,"Elkin","Castillo","Maestro de obra")
            );
    }

    public List<Employees> findAll(){
        return data;
    }

    public Employees getById(Long id){
        return data.stream().filter(p->p.getId().equals(id)).findFirst().orElse(null);
    }

}
