package GuviTask;

import java.util.Scanner;

public class TaskNoFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Purchased amount is: ");
        int purchaseAmt = scanner.nextInt();

        if (purchaseAmt <= 500){
            System.out.println("No discount is applicable you're bill amount is: " + purchaseAmt);
        } else if ((purchaseAmt >=500) || (purchaseAmt<=1000)) {
            int discount1 = purchaseAmt / 100 * 10;
            int totalBill1 = purchaseAmt - discount1;
            System.out.println("You're eligible of 10% discount, your bill amount is : " + totalBill1);
        } else if (purchaseAmt >=1000) {
            int discount2 = purchaseAmt / 100 * 20;
            int totalBill2 = purchaseAmt - discount2;
            System.out.println("You're eligible of 20% discount, your bill amount is: " + totalBill2);
        }
    }
}
