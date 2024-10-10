package com.mycompany.lab01.builder;

import com.mycompany.lab01.factory.FullTimeEmployee;

/**
 * Concrete builder for creating FullTimeEmployee instances.
 * Implements the EmployeeBuilder interface and provides methods to set the attributes of a FullTimeEmployee.
 */
public class FullTimeEmployeeBuilder implements EmployeeBuilder {
    private int id;
    private String name;
    private String department;
    private String role;
    private int workingHoursPerWeek;
    private double salary;

    /**
     * Sets the ID of the full-time employee.
     *
     * @param id The unique identifier of the full-time employee.
     * @return The current instance of FullTimeEmployeeBuilder.
     */
    @Override
    public FullTimeEmployeeBuilder setId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Sets the name of the full-time employee.
     *
     * @param name The name of the full-time employee.
     * @return The current instance of FullTimeEmployeeBuilder.
     */
    @Override
    public FullTimeEmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Sets the department of the full-time employee.
     *
     * @param department The department where the full-time employee works.
     * @return The current instance of FullTimeEmployeeBuilder.
     */
    @Override
    public FullTimeEmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Sets the role of the full-time employee.
     *
     * @param role The role or job title of the full-time employee.
     * @return The current instance of FullTimeEmployeeBuilder.
     */
    @Override
    public FullTimeEmployeeBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * Sets the working hours per week of the full-time employee.
     *
     * @param hours The number of hours the full-time employee works per week.
     * @return The current instance of FullTimeEmployeeBuilder.
     */
    @Override
    public FullTimeEmployeeBuilder setWorkingHoursPerWeek(int hours) {
        this.workingHoursPerWeek = hours;
        return this;
    }

    /**
     * Sets the salary of the full-time employee.
     *
     * @param salary The annual salary of the full-time employee.
     * @return The current instance of FullTimeEmployeeBuilder.
     */
    @Override
    public FullTimeEmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    /**
     * Builds and returns a FullTimeEmployee instance.
     * 
     * @return A FullTimeEmployee instance with the specified attributes.
     */
    @Override
    public FullTimeEmployee build() {
        return new FullTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
    }
}
