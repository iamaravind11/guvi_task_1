package GuviTask;

import java.util.Scanner;

//WAP to reverse the given number
public class TaskNoThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide your Input: ");
        int userIn = scanner.nextInt();
        int reversed = 0;
        while (userIn !=0) {
            int digit = userIn % 10;
            reversed = reversed * 10 + digit;
            userIn = userIn / 10;
        }
        System.out.println("Reversed number: " + reversed);
        }
    }