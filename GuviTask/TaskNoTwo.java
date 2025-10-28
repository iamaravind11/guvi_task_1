package GuviTask;

import java.util.Scanner;

//WAP to find the user given number is positive or negative
public class TaskNoTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide your input: ");
        int userIn = scanner.nextInt();
        if (userIn <=0){
            System.out.println("Given number is negative");
        }
        else {
            System.out.println("Given number is Positive");
        }
    }
}
