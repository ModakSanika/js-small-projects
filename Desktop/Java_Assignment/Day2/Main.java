/*
 * 
Write the main method to create an object of a class 
and call the above member method. 
 */
import java.util.*;
public class Main{

    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student(); // This will print "Student object is created"

        // Creating a Commission object
        Commission commission = new Commission();

        // Accepting details of the sales employee
        commission.acceptDetails();

        // Calculating and displaying commission
        commission.calculateCommission();

}}