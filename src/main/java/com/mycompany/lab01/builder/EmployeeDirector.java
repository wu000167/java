/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab01.builder;

import com.mycompany.lab01.employee.Employee;

/**
 * Director class that constructs an Employee using an EmployeeBuilder.
 */
public class EmployeeDirector {
    private EmployeeBuilder builder;

    /**
     * Constructor for EmployeeDirector.
     *
     * @param builder The EmployeeBuilder to use for construction.
     */
    public EmployeeDirector(EmployeeBuilder builder) {
        this.builder = builder;
    }

    /**
     * Constructs an Employee with predefined attributes.
     *
     * @return The constructed Employee object.
     */
    public Employee constructEmployee() {
        return builder
                .setId(0)
                .setName("Default Name")
                .setDepartment("Default Department")
                .setRole("Default Role")
                .setWorkingHoursPerWeek(40)
                .setSalary(50000)
                .build();
    }

    /**
     * Constructs an Employee with custom attributes.
     *
     * @param id                 Employee ID.
     * @param name               Employee name.
     * @param department         Employee department.
     * @param role               Employee role.
     * @param hours              Working hours per week.
     * @param salary             Employee salary.
     * @return The constructed Employee object.
     */
    public Employee constructEmployee(int id, String name, String department, String role, int hours, double salary) {
        return builder
                .setId(id)
                .setName(name)
                .setDepartment(department)
                .setRole(role)
                .setWorkingHoursPerWeek(hours)
                .setSalary(salary)
                .build();
    }
}
