package ExceptionAndCollections;


class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom Exception for Invalid Name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}
public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Parameterized constructor
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        if (isValidName(name)) {
            this.name = name;
        } else {
            throw new NameNotValidException("Name contains invalid characters: " + name);
        }
        if (age >= 15 && age <= 21) {
            this.age = age;
        } else {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21. Provided: " + age);
        }
        this.course = course;
    }

    // Helper method to validate name (only alphabets and spaces allowed)
    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }
}
