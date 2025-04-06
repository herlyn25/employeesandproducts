package com.herlyn.employees.controllers;


import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import com.herlyn.employees.models.Employees;
import com.herlyn.employees.services.EmployeeServicesImp;

@RestController
public class EmployeesController {
   EmployeeServicesImp service = new EmployeeServicesImp();

    @GetMapping("/")    
    public String home(){
        return "Esta es la pagina de inicio";
    }

    @GetMapping("/employee")
    public List<Employees> getAllEmp() {
        return service.listEmployees();
    } 
    @GetMapping("/employee/{id}")
    public Employees getEmpId(@PathVariable Long id) {
        return service.employeeById(id);
    }    
}