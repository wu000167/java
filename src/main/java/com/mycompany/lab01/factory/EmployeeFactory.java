package com.mycompany.lab01.factory;

import com.mycompany.lab01.employee.Employee;
import com.mycompany.lab01.builder.FullTimeEmployeeBuilder;
import com.mycompany.lab01.builder.PartTimeEmployeeBuilder;

/**
 * Factory class to create Employee instances based on the type.
 * This class demonstrates the use of the Factory design pattern.
 * It provides a centralized way to create different types of employees
 * (full-time or part-time) based on the input provided.
 */
public class EmployeeFactory {

    /**
     * Creates an Employee instance based on the provided type.
     * This method uses the Factory pattern to return either a full-time or part-time employee.
     *
     * @param type The type of employee to create ("FullTime" or "PartTime").
     * @return An Employee instance of the specified type (either FullTimeEmployee or PartTimeEmployee).
     * @throws IllegalArgumentException if the provided type is not recognized.
     */
    public static Employee createEmployee(String type) {
        switch (type) {
            case "FullTime":
                return new FullTimeEmployeeBuilder()
                        .setId(1)
                        .setName("Julie")
                        .setDepartment("Accounting")
                        .setRole("Accountant")
                        .setWorkingHoursPerWeek(40)
                        .setSalary(100000)
                        .build();
            case "PartTime":
                return new PartTimeEmployeeBuilder()
                        .setId(2)
                        .setName("David")
                        .setDepartment("Marketing")
                        .setRole("Analyst")
                        .setWorkingHoursPerWeek(20)
                        .setSalary(50000)
                        .build();
            default:
                throw new IllegalArgumentException("Unknown employee type: " + type);
        }
    }
}
