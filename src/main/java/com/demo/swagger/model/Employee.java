package com.demo.swagger.model;

import io.swagger.annotations.ApiModelProperty;

public class Employee {

    @ApiModelProperty(notes = "ID of the Employee")
    int id;
    @ApiModelProperty(notes = "name of the Employee")
    String name;
    @ApiModelProperty(notes = "Designation of the Employee")
    String designation;
    @ApiModelProperty(notes = "Salary of the Employee")
    String salary;

    public Employee(int id, String name, String designation, String salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
