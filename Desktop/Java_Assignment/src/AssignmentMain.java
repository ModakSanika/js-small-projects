import com.Sanika_Modak.assignment.employees.Employee;
import com.Sanika_Modak.assignment.employees.Developer;
import com.Sanika_Modak.assignment.employees.Manager;
import com.Sanika_Modak.assignment.utilities.EmployeeUtilities;

/**
 * Main class to demonstrate the functionality.
 */
public class AssignmentMain {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setEmployeeId(10);
        manager.setName("Arjun");
        manager.setSalary(90000);
        manager.setDepartment("Sales");

        Developer developer = new Developer();
        developer.setEmployeeId(20);
        developer.setName("Sanika");
        developer.setSalary(80000);
        developer.setProgrammingLanguage("Java");

        EmployeeUtilities.printEmployeeDetails(manager);
        System.out.println();
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}
