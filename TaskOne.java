package GuviTask2;

public class TaskOne {
    private String name;
    private int age;

    // Constructor with only name, default age 18
    public TaskOne(String name) {
        this.name = name;
        this.age = 18;
    }

    // Constructor with name and age
    public TaskOne(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Demonstrate constructor with only name (default age 18)
        TaskOne person1 = new TaskOne("Alice");
        person1.display();

        // Demonstrate constructor with name and age
        TaskOne person2 = new TaskOne("Bob", 25);
        person2.display();
    }
}