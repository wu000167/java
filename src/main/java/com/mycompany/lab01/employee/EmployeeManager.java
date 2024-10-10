package com.mycompany.lab01.employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton class that manages all Employee instances.
 * The EmployeeManager class is responsible for managing the creation, retrieval,
 * and deletion of employees in the system. It ensures that only one instance
 * of EmployeeManager exists in the application.
 */
public class EmployeeManager {
    private static EmployeeManager instance;
    private List<Employee> employees;

    /**
     * Private constructor to prevent instantiation from outside.
     * Initializes the employee list.
     */
    private EmployeeManager() {
        employees = new ArrayList<>();
    }

    /**
     * Provides a global point of access to the EmployeeManager instance.
     * This method ensures that there is only one instance of EmployeeManager (Singleton pattern).
     *
     * @return The singleton instance of EmployeeManager.
     */
    public static synchronized EmployeeManager getInstance() {
        if (instance == null) {
            instance = new EmployeeManager();
        }
        return instance;
    }

    /**
     * Adds an employee to the management system.
     * 
     * @param employee The employee to add to the system.
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     * Removes an employee from the management system by ID.
     * 
     * @param id The ID of the employee to remove from the system.
     */
    public void removeEmployee(int id) {
        employees.removeIf(emp -> emp.getId() == id);
    }

    /**
     * Retrieves an employee by their ID.
     * 
     * @param id The ID of the employee to retrieve.
     * @return The employee with the matching ID, or null if no employee is found.
     */
    public Employee getEmployee(int id) {
        return employees.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);
    }

    /**
     * Retrieves a list of all employees in the system.
     * 
     * @return A list of all employees currently in the system.
     */
    public List<Employee> getAllEmployees() {
        return employees;
    }
}
