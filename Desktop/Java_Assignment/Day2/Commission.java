/*
Define a class Commission described as follows:
Data Members: Name, Address, Phone, Sales_amount 
Member methods:
(i) To accept details of the sales employee
(ii) to calculate the commission as follows: Sales_amount >= 100000, 
commission = 10%; 50000 <= Sales_amount < 100000, commission = 5%;
 30000 <= Sales_amount < 50000, commission = 3%;
  Sales_amount < 30000, no commission. */

import java.util.*;

public class Commission{
    public  String name;
    private String address;
    private String phone;
    private double salesAmount;

    public void acceptDetails(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name:  ");
        this.name=sc.nextLine();

        System.out.println("Enter your Address:  ");
        this.address=sc.nextLine();

        System.out.println("Enter your Phone number:  ");
        this.phone=sc.nextLine();

        System.out.println("Enter Sales Amount:  ");
        this.salesAmount=sc.nextDouble();

    }
    public void calculateCommission() {
        double commissionRate = 0.0;

        if (salesAmount >= 100000) {
            commissionRate = 0.10; // 10%
        } else if (salesAmount >= 50000) {
            commissionRate = 0.05; // 5%
        } else if (salesAmount >= 30000) {
            commissionRate = 0.03; // 3%
        } else {
            commissionRate = 0.0; // No commission
        }
        System.out.println("\nCommission Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: $" + salesAmount);
        System.out.println("Commission Rate: " + (commissionRate * 100) + "%");
}
}