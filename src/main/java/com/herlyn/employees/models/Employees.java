package com.herlyn.employees.models;

public class Employees implements Cloneable{
    private Long id;
    private String name;
    private String lastname;
    private String position;
    private double salario;  

    public Employees() {
    }

    public Employees(Long id, String name, String lastname, String position, double salario) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.position = position;
        this.salario = salario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return new Employees(id,name, lastname,position,salario); // Tambien se puede colocar los metodos get
        }
    }    
}