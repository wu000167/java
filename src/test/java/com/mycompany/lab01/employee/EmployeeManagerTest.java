package com.mycompany.lab01.employee;

import com.mycompany.lab01.factory.FullTimeEmployee;
import com.mycompany.lab01.factory.PartTimeEmployee;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the EmployeeManager class.
 */
public class EmployeeManagerTest {

    private EmployeeManager manager;

    @BeforeEach
    public void setUp() {
        // Reset the EmployeeManager before each test
        manager = EmployeeManager.getInstance();
        manager.getAllEmployees().clear(); // Ensure we start with an empty employee list
    }

    /**
     * Test the singleton nature of the EmployeeManager.
     */
    @Test
    public void testGetInstance() {
        System.out.println("Testing getInstance() for singleton behavior");
        EmployeeManager instance1 = EmployeeManager.getInstance();
        EmployeeManager instance2 = EmployeeManager.getInstance();
        // Assert that both instances are the same (singleton)
        assertSame(instance1, instance2);
    }

    /**
     * Test the addEmployee method.
     */
    @Test
    public void testAddEmployee() {
        System.out.println("Testing addEmployee()");
        
        // Create a new employee and add to the manager
        Employee employee = new FullTimeEmployee(1, "Alice", "Engineering", "Developer", 40, 80000);
        manager.addEmployee(employee);

        // Ensure that the employee was added
        assertEquals(1, manager.getAllEmployees().size());
        assertEquals("Alice", manager.getEmployee(1).getName());
    }

    /**
     * Test the removeEmployee method.
     */
    @Test
    public void testRemoveEmployee() {
        System.out.println("Testing removeEmployee()");
        
        // Add an employee and then remove it
        Employee employee = new FullTimeEmployee(1, "Bob", "Marketing", "Analyst", 20, 40000);
        manager.addEmployee(employee);
        manager.removeEmployee(1);

        // Ensure that the employee was removed
        assertNull(manager.getEmployee(1));
        assertEquals(0, manager.getAllEmployees().size());
    }

    /**
     * Test the getEmployee method.
     */
    @Test
    public void testGetEmployee() {
        System.out.println("Testing getEmployee()");
        
        // Add an employee
        Employee employee = new FullTimeEmployee(2, "John", "HR", "Manager", 40, 90000);
        manager.addEmployee(employee);

        // Retrieve the employee by ID and check the details
        Employee retrievedEmployee = manager.getEmployee(2);
        assertNotNull(retrievedEmployee);
        assertEquals("John", retrievedEmployee.getName());
        assertEquals("HR", retrievedEmployee.getDepartment());
    }

    /**
     * Test the getAllEmployees method.
     */
    @Test
    public void testGetAllEmployees() {
        System.out.println("Testing getAllEmployees()");
        
        // Add multiple employees
        Employee employee1 = new FullTimeEmployee(1, "Alice", "Engineering", "Developer", 40, 80000);
        Employee employee2 = new PartTimeEmployee(2, "Bob", "Sales", "Salesperson", 20, 30000);
        manager.addEmployee(employee1);
        manager.addEmployee(employee2);

        // Retrieve all employees
        List<Employee> employees = manager.getAllEmployees();

        // Ensure that both employees were added
        assertEquals(2, employees.size());
    }
}
