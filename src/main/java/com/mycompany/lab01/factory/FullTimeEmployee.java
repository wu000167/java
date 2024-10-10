package com.mycompany.lab01.factory;

import com.mycompany.lab01.employee.Employee;

/**
 * Represents a full-time employee.
 * This class extends the abstract Employee class and implements the 
 * behavior specific to full-time employees, such as clocking in, tracking work hours, 
 * and clocking out.
 */
public class FullTimeEmployee extends Employee {

    /**
     * Constructor for FullTimeEmployee.
     * Initializes a FullTimeEmployee object with the specified attributes.
     *
     * @param id                 The unique identifier for the full-time employee.
     * @param name               The name of the full-time employee.
     * @param department         The department where the full-time employee works.
     * @param role               The role or position of the full-time employee.
     * @param workingHoursPerWeek The number of working hours per week for the full-time employee.
     * @param salary             The salary of the full-time employee.
     */
    public FullTimeEmployee(int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        super(id, name, department, role, workingHoursPerWeek, salary);
    }

    /**
     * Implements the clock-in behavior for a full-time employee.
     * Displays the full-time employee's details when clocking in.
     */
    @Override
    public void clockIn() {
        System.out.println(name + " clocked in as a full-time employee.");
        System.out.println("ID: " + id + ", Department: " + department + ", Role: " + role + ", Working Hours: " + workingHoursPerWeek + ", Salary: " + salary);
    }

    /**
     * Implements the tracking of work hours for a full-time employee.
     * Displays the number of weekly working hours.
     */
    @Override
    public void trackWorkHours() {
        System.out.println(name + " is tracking full-time work hours.");
        System.out.println("Total weekly hours: " + workingHoursPerWeek);
    }

    /**
     * Implements the clock-out behavior for a full-time employee.
     */
    @Override
    public void clockOut() {
        System.out.println(name + " clocked out as a full-time employee.");
    }

}
