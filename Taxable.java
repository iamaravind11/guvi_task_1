package GuviTask3;

import java.util.PrimitiveIterator;
import java.util.Scanner;

public interface Taxable {
    double salesTax = 0.07;
    double incomeTax = 0.105;
    double calculateTax();
}

class Employee implements Taxable{
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public double calculateTax() {
        return salary * incomeTax;
    }

    public String toString() {
        return "EmpID: " + empId + ", Name: " + name + ", Salary: " + salary;
    }

}

class Product implements Taxable {
    private int pid;
    private double price;
    private int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculates sales tax on unit price
    @Override
    public double calculateTax() {
        return price * salesTax;
    }

    @Override
    public String toString() {
        return "ProductID: " + pid + ", Price: " + price + ", Quantity: " + quantity;
    }

}

class DriverMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Employee input
        System.out.print("Enter Employee ID: ");
        int eid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Yearly Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(eid, name, salary);

        // Product input
        System.out.print("Enter Product ID: ");
        int pid = sc.nextInt();
        System.out.print("Enter Unit Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        Product prod = new Product(pid, price, quantity);

        // Display results
        System.out.println(emp);
        System.out.println("Income Tax: " + emp.calculateTax());
        System.out.println(prod);
        System.out.println("Sales Tax (per unit): " + prod.calculateTax());

        sc.close();
    }
}