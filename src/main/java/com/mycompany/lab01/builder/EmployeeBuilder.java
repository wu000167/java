package com.mycompany.lab01.builder;

import com.mycompany.lab01.employee.Employee;

/**
 * Interface for building Employee objects using the Builder pattern.
 * This interface defines the methods that must be implemented by any class 
 * that follows the Builder pattern to construct Employee objects.
 */
public interface EmployeeBuilder {

    /**
     * Sets the ID of the employee.
     *
     * @param id The unique identifier of the employee.
     * @return The current instance of EmployeeBuilder (for method chaining).
     */
    EmployeeBuilder setId(int id);

    /**
     * Sets the name of the employee.
     *
     * @param name The name of the employee.
     * @return The current instance of EmployeeBuilder (for method chaining).
     */
    EmployeeBuilder setName(String name);

    /**
     * Sets the department of the employee.
     *
     * @param department The department where the employee works.
     * @return The current instance of EmployeeBuilder (for method chaining).
     */
    EmployeeBuilder setDepartment(String department);

    /**
     * Sets the role of the employee.
     *
     * @param role The role or job title of the employee.
     * @return The current instance of EmployeeBuilder (for method chaining).
     */
    EmployeeBuilder setRole(String role);

    /**
     * Sets the number of working hours per week for the employee.
     *
     * @param hours The number of hours the employee works per week.
     * @return The current instance of EmployeeBuilder (for method chaining).
     */
    EmployeeBuilder setWorkingHoursPerWeek(int hours);

    /**
     * Sets the salary of the employee.
     *
     * @param salary The annual salary of the employee.
     * @return The current instance of EmployeeBuilder (for method chaining).
     */
    EmployeeBuilder setSalary(double salary);

    /**
     * Builds and returns the Employee object.
     *
     * @return A new Employee object with the properties specified.
     */
    Employee build();
}
