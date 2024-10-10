package com.mycompany.lab01.employee;

/**
 * The abstract base class representing a general Employee.
 * This class contains common properties and abstract methods that must be implemented by its subclasses.
 * It serves as a template for creating different types of employees, such as full-time and part-time employees.
 */
public abstract class Employee {
    protected int id;
    protected String name;
    protected String department;
    protected String role;
    protected int workingHoursPerWeek;
    protected double salary;

    /**
     * Constructor for the Employee class.
     * Initializes an Employee object with the given attributes.
     *
     * @param id                 The unique identifier for the employee.
     * @param name               The name of the employee.
     * @param department         The department where the employee works.
     * @param role               The role or position of the employee.
     * @param workingHoursPerWeek The number of working hours per week for the employee.
     * @param salary             The annual salary of the employee.
     */
    public Employee(int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
        this.workingHoursPerWeek = workingHoursPerWeek;
        this.salary = salary;
    }

    /**
     * Abstract method for the employee's clock-in action.
     * This method must be implemented by subclasses to define how an employee clocks in.
     */
    public abstract void clockIn();

    /**
     * Abstract method for the employee's clock-out action.
     * This method must be implemented by subclasses to define how an employee clocks out.
     */
    public abstract void clockOut();

    /**
     * Abstract method to track the employee's work hours.
     * This method must be implemented by subclasses to track how the employee logs their working hours.
     */
    public abstract void trackWorkHours();

    // Getters and Setters

    /**
     * Gets the employee's ID.
     *
     * @return The employee's unique identifier.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the employee's ID.
     *
     * @param id The employee's unique identifier.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the employee's name.
     *
     * @return The employee's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the employee's name.
     *
     * @param name The employee's name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the employee's department.
     *
     * @return The department where the employee works.
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the employee's department.
     *
     * @param department The department where the employee works.
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Gets the employee's role or position.
     *
     * @return The role or job title of the employee.
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the employee's role or position.
     *
     * @param role The role or job title of the employee.
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Gets the number of working hours per week for the employee.
     *
     * @return The employee's working hours per week.
     */
    public int getWorkingHoursPerWeek() {
        return workingHoursPerWeek;
    }

    /**
     * Sets the number of working hours per week for the employee.
     *
     * @param workingHoursPerWeek The number of hours the employee works per week.
     */
    public void setWorkingHoursPerWeek(int workingHoursPerWeek) {
        this.workingHoursPerWeek = workingHoursPerWeek;
    }

    /**
     * Gets the employee's annual salary.
     *
     * @return The employee's salary.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the employee's annual salary.
     *
     * @param salary The annual salary of the employee.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
