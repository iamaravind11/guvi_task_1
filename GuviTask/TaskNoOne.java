package GuviTask;

import java.util.Scanner;

//WAP to print number upto 50
public class TaskNoOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide your input:");
        int userIn = scanner.nextInt();
            for (int i = userIn; i <= 50; i++){
                System.out.println(i);
            }
        }
    }
