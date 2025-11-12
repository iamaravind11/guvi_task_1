package GuviTask2;

public class Person {
    protected String name;
    protected int age;

    // Constructor for Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display Person details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    private int employeeID;
    private double salary;

    // Constructor for Employee using super to initialize Person attributes
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display Employee details
    public void display() {
        super.display(); // Call parent's display
        System.out.println("Employee ID: " + employeeID + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        // Create Employee object
        Employee emp = new Employee("John Doe", 30, 12345, 75000.0);
        emp.display();
    }
}