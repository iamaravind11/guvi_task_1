package GuviTask2;

import java.util.Scanner;

class Product {
    private int pid;
    private double price;
    private int quantity;

    // Parameterized constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public int getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

public class ProductMain {
    // Method to calculate total amount spent
    public static double calculateTotal(Product[] products) {
        double total = 0.0;
        for (Product p : products) {
            total += p.getPrice() * p.getQuantity();
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept five product information from user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter PID for product " + (i + 1) + ": ");
            int pid = scanner.nextInt();
            System.out.print("Enter price for product " + (i + 1) + ": ");
            double price = scanner.nextDouble();
            System.out.print("Enter quantity for product " + (i + 1) + ": ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        // Find PID of the product with the highest price
        int maxPid = products[0].getPid();
        double maxPrice = products[0].getPrice();
        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > maxPrice) {
                maxPrice = products[i].getPrice();
                maxPid = products[i].getPid();
            }
        }
        System.out.println("PID of the product with the highest price: " + maxPid);

        // Calculate and display total amount spent
        double totalAmount = calculateTotal(products);
        System.out.println("Total amount spent on all products: " + totalAmount);

        scanner.close();
    }
}
