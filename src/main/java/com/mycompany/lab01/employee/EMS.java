package com.mycompany.lab01.employee;

import com.mycompany.lab01.builder.FullTimeEmployeeBuilder;
import com.mycompany.lab01.builder.PartTimeEmployeeBuilder;
import com.mycompany.lab01.builder.EmployeeDirector;
import com.mycompany.lab01.factory.EmployeeFactory;

/**
 * Main class to simulate the Employee Management System.
 * This class demonstrates the use of Factory and Builder design patterns to create and manage different types of employees.
 */
public class EMS {

    /**
     * The main method where the Employee Management System is simulated.
     * It demonstrates the creation of both full-time and part-time employees using the Factory and Builder design patterns,
     * and adds them to the EmployeeManager.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Get the singleton instance of EmployeeManager
        EmployeeManager manager = EmployeeManager.getInstance();

        // Using Factory pattern to create full-time and part-time employees
        System.out.println("Creating full-time and part-time employees using Factory...");
        Employee fullTimeEmployee = EmployeeFactory.createEmployee("FullTime");
        Employee partTimeEmployee = EmployeeFactory.createEmployee("PartTime");

        // Adding employees created by the factory to EmployeeManager
        manager.addEmployee(fullTimeEmployee);
        manager.addEmployee(partTimeEmployee);
        System.out.println("Employees added to the manager.\n");

        // Using Builder pattern to create a custom full-time employee
        System.out.println("Creating a custom full-time employee using Builder...");
        EmployeeDirector fullTimeDirector = new EmployeeDirector(new FullTimeEmployeeBuilder());
        Employee customFullTimeEmployee = fullTimeDirector.constructEmployee(3, "Jessica", "Legal", "Lawyer", 40, 200000);
        manager.addEmployee(customFullTimeEmployee);
        System.out.println("Custom full-time employee added to the manager.\n");

        // Using Builder pattern to create a custom part-time employee
        System.out.println("Creating a custom part-time employee using Builder...");
        EmployeeDirector partTimeDirector = new EmployeeDirector(new PartTimeEmployeeBuilder());
        Employee customPartTimeEmployee = partTimeDirector.constructEmployee(4, "Amber", "IT support", "Technicien Support", 20, 30000);
        manager.addEmployee(customPartTimeEmployee);
        System.out.println("Custom part-time employee added to the manager.\n");

        // Simulate employee actions (clock in, track work hours, clock out)
        System.out.println("Simulating employee actions...\n");
        for (Employee emp : manager.getAllEmployees()) {
            emp.clockIn();
            emp.trackWorkHours();
            emp.clockOut();
            System.out.println();  // Ensure separation between employee outputs
        }

        // Display all employee names
        System.out.println("All Employees:");
        manager.getAllEmployees().forEach(emp -> System.out.println(emp.getName()));
    }
}
