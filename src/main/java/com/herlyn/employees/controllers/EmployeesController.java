package com.herlyn.employees.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.*;

import com.herlyn.employees.models.Employees;

@RestController
public class EmployeesController {
    private static final List<Employees> employees = new ArrayList<>();

    static {
        employees.add(new Employees(1L,"Herlyn","Castillo","Desarrollador Junior"));
        employees.add(new Employees(2L,"Helver","Castillo","Prestamista"));
        employees.add(new Employees(3L,"Elkin","Castillo","Maestro de obra"));
    }

    @GetMapping("/")    
    public String home(){
        return "Esta es la pagina de inicio";
    }

    @GetMapping("/employee")
    public List<Employees> listEmployees() {
        return employees;
    }    
    @GetMapping("/employee/{id}")
    public Employees employeeById(@PathVariable Long id) {
        return employees.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }    
}