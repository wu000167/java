package com.mycompany.lab01.builder;

import com.mycompany.lab01.factory.PartTimeEmployee;

/**
 * Concrete builder for creating PartTimeEmployee instances.
 * Implements the EmployeeBuilder interface and provides methods to set the attributes of a PartTimeEmployee.
 */
public class PartTimeEmployeeBuilder implements EmployeeBuilder {
    private int id;
    private String name;
    private String department;
    private String role;
    private int workingHoursPerWeek;
    private double salary;

    /**
     * Sets the ID of the part-time employee.
     *
     * @param id The unique identifier of the part-time employee.
     * @return The current instance of PartTimeEmployeeBuilder.
     */
    @Override
    public PartTimeEmployeeBuilder setId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Sets the name of the part-time employee.
     *
     * @param name The name of the part-time employee.
     * @return The current instance of PartTimeEmployeeBuilder.
     */
    @Override
    public PartTimeEmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Sets the department of the part-time employee.
     *
     * @param department The department where the part-time employee works.
     * @return The current instance of PartTimeEmployeeBuilder.
     */
    @Override
    public PartTimeEmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Sets the role of the part-time employee.
     *
     * @param role The role or job title of the part-time employee.
     * @return The current instance of PartTimeEmployeeBuilder.
     */
    @Override
    public PartTimeEmployeeBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * Sets the working hours per week of the part-time employee.
     *
     * @param hours The number of hours the part-time employee works per week.
     * @return The current instance of PartTimeEmployeeBuilder.
     */
    @Override
    public PartTimeEmployeeBuilder setWorkingHoursPerWeek(int hours) {
        this.workingHoursPerWeek = hours;
        return this;
    }

    /**
     * Sets the salary of the part-time employee.
     *
     * @param salary The annual salary of the part-time employee.
     * @return The current instance of PartTimeEmployeeBuilder.
     */
    @Override
    public PartTimeEmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    /**
     * Builds and returns a PartTimeEmployee instance.
     * 
     * @return A PartTimeEmployee instance with the specified attributes.
     */
    @Override
    public PartTimeEmployee build() {
        return new PartTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
    }
}
