package com.herlyn.employees.models;

public class Employees {
    private Long id;
    private String name;
    private String lastname;
    private String position;  

    public Employees() {
    }

    public Employees(Long id, String name, String lastname, String position) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }    
}