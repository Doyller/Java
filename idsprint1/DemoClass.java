package idsprint1;

import java.util.Date;


public class DemoClass {

    public static void main (String[] args) {

        Customer c1 = new Customer("I Doyle", true, "Premium");
        Customer c2 = new Customer("Jimmy squids", true, "Silver");
        Customer c3 = new Customer("Pter Rabbet", true, "Silver");
        Customer c4 = new Customer("Santy Clause", true, "Gold");
        Customer c5 = new Customer("Jenna Tons", true, "Silver");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c4.toString());
        System.out.println(c5.toString());

        Visit v1 = new Visit(c1, new Date());
        System.out.println(v1.toString());

        v1.setProductExpense(4.5);
        v1.setServiceExpense(8.5);
        v1.setProductExpense(1.5);
        System.out.println(v1.toString());
        System.out.println("Total expense made by " + v1.getCustomerName() + " = " + v1.getTotalExpense());

    }
}

