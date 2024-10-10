package com.mycompany.lab01.factory;

import com.mycompany.lab01.employee.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the EmployeeFactory class.
 */
public class EmployeeFactoryTest {

    @BeforeEach
    public void setUp() {
        // Set up necessary environment before each test (if needed)
    }

    /**
     * Test of createEmployee method for FullTime employee.
     */
    @Test
    public void testCreateFullTimeEmployee() {
        System.out.println("Testing createEmployee with FullTime type...");

        // Create a FullTime employee
        Employee fullTimeEmployee = EmployeeFactory.createEmployee("FullTime");

        // Ensure the employee is not null
        assertNotNull(fullTimeEmployee, "Full-time employee should not be null");

        // Check if the employee's properties match expected values
        assertEquals(1, fullTimeEmployee.getId(), "Full-time employee ID mismatch");
        assertEquals("Julie", fullTimeEmployee.getName(), "Full-time employee name mismatch");
        assertEquals("Accounting", fullTimeEmployee.getDepartment(), "Full-time employee department mismatch");
        assertEquals("Accountant", fullTimeEmployee.getRole(), "Full-time employee role mismatch");
        assertEquals(40, fullTimeEmployee.getWorkingHoursPerWeek(), "Full-time employee working hours mismatch");
        assertEquals(100000, fullTimeEmployee.getSalary(), 0.01, "Full-time employee salary mismatch");
    }

    /**
     * Test of createEmployee method for PartTime employee.
     */
    @Test
    public void testCreatePartTimeEmployee() {
        System.out.println("Testing createEmployee with PartTime type...");

        // Create a PartTime employee
        Employee partTimeEmployee = EmployeeFactory.createEmployee("PartTime");

        // Ensure the employee is not null
        assertNotNull(partTimeEmployee, "Part-time employee should not be null");

        // Check if the employee's properties match expected values
        assertEquals(2, partTimeEmployee.getId(), "Part-time employee ID mismatch");
        assertEquals("David", partTimeEmployee.getName(), "Part-time employee name mismatch");
        assertEquals("Marketing", partTimeEmployee.getDepartment(), "Part-time employee department mismatch");
        assertEquals("Analyst", partTimeEmployee.getRole(), "Part-time employee role mismatch");
        assertEquals(20, partTimeEmployee.getWorkingHoursPerWeek(), "Part-time employee working hours mismatch");
        assertEquals(50000, partTimeEmployee.getSalary(), 0.01, "Part-time employee salary mismatch");
    }

    /**
     * Test of createEmployee method with an invalid employee type.
     */
    @Test
    public void testCreateInvalidEmployeeType() {
        System.out.println("Testing createEmployee with an invalid type...");

        // Attempt to create an employee with an invalid type and check for exception
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            EmployeeFactory.createEmployee("InvalidType");
        });

        // Verify the exception message
        String expectedMessage = "Unknown employee type: InvalidType";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage), "Exception message mismatch");
    }
}
