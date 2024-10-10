package com.mycompany.lab01.factory;

import com.mycompany.lab01.employee.Employee;

/**
 * Represents a part-time employee.
 * This class extends the abstract Employee class and implements the
 * behavior specific to part-time employees, such as clocking in, tracking work hours,
 * and clocking out.
 */
public class PartTimeEmployee extends Employee {

    /**
     * Constructor for PartTimeEmployee.
     * Initializes a PartTimeEmployee object with the specified attributes.
     *
     * @param id                 The unique identifier for the part-time employee.
     * @param name               The name of the part-time employee.
     * @param department         The department where the part-time employee works.
     * @param role               The role or position of the part-time employee.
     * @param workingHoursPerWeek The number of working hours per week for the part-time employee.
     * @param salary             The salary of the part-time employee.
     */
    public PartTimeEmployee(int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        super(id, name, department, role, workingHoursPerWeek, salary);
    }

    /**
     * Implements the clock-in behavior for a part-time employee.
     * Displays the part-time employee's details when clocking in.
     */
    @Override
    public void clockIn() {
        System.out.println(name + " clocked in as a part-time employee.");
        System.out.println("ID: " + id + ", Department: " + department + ", Role: " + role + ", Working Hours: " + workingHoursPerWeek + ", Salary: " + salary);
    }

    /**
     * Implements the tracking of work hours for a part-time employee.
     * Displays the number of weekly working hours.
     */
    @Override
    public void trackWorkHours() {
        System.out.println(name + " is tracking part-time work hours.");
        System.out.println("Total weekly hours: " + workingHoursPerWeek);
    }

    /**
     * Implements the clock-out behavior for a part-time employee.
     */
    @Override
    public void clockOut() {
        System.out.println(name + " clocked out as a part-time employee.");
    }

}
