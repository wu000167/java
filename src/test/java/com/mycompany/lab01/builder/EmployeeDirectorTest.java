package com.mycompany.lab01.builder;

import com.mycompany.lab01.employee.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the EmployeeDirector class.
 */
public class EmployeeDirectorTest {

    private EmployeeDirector director;

    @BeforeEach
    public void setUp() {
        // Initialize EmployeeDirector with a FullTimeEmployeeBuilder before each test
        director = new EmployeeDirector(new FullTimeEmployeeBuilder());
    }

    /**
     * Test the constructEmployee method without parameters (default employee construction).
     */
    @Test
    public void testConstructEmployee() {
        System.out.println("Testing constructEmployee with default values...");

        // Construct a default employee using the director
        Employee employee = director.constructEmployee();

        // Verify that the employee has default values
        assertNotNull(employee);
        assertEquals(0, employee.getId());
        assertEquals("Default Name", employee.getName());
        assertEquals("Default Department", employee.getDepartment());
        assertEquals("Default Role", employee.getRole());
        assertEquals(40, employee.getWorkingHoursPerWeek());
        assertEquals(50000.0, employee.getSalary());
    }

    /**
     * Test the constructEmployee method with parameters (custom employee construction).
     */
    @Test
    public void testConstructEmployee_6args() {
        System.out.println("Testing constructEmployee with custom values...");

        // Define custom values for a new employee
        int id = 1;
        String name = "John Doe";
        String department = "IT";
        String role = "Developer";
        int hours = 40;
        double salary = 75000.0;

        // Construct the employee with custom values using the director
        Employee employee = director.constructEmployee(id, name, department, role, hours, salary);

        // Verify that the employee has the expected custom values
        assertNotNull(employee);
        assertEquals(id, employee.getId());
        assertEquals(name, employee.getName());
        assertEquals(department, employee.getDepartment());
        assertEquals(role, employee.getRole());
        assertEquals(hours, employee.getWorkingHoursPerWeek());
        assertEquals(salary, employee.getSalary());
    }
}
