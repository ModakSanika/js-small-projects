package com.Sanika_Modak.assignment.utilities;

import com.Sanika_Modak.assignment.employees.Employee;
import com.Sanika_Modak.assignment.employees.Manager;
import com.Sanika_Modak.assignment.employees.Developer;
/**
 * Utility class for basic operations on Employee objects.
 */
public class EmployeeUtilities {

    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: $" + employee.getSalary());
    }
}
