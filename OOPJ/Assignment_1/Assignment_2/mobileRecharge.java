package com.recharge;
import java.util.*;

public class mobileRecharge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Phone no");
        String phoneno = sc.nextLine();

        System.out.println("-----------Recharge Menu------------");
        System.out.println("1. Rs. 199 → 28 days validity");
        System.out.println("2. Rs. 399 → 56 days validity");
        System.out.println("3. Rs. 599 → 84 days validity");

        System.out.println("Choose plan");
        int choice = sc.nextInt();

        System.out.println("Enter Amount");
        double amount = sc.nextDouble();

        switch(choice) {
            case 1:
                System.out.println("Recharge confirm Rs.199 → 28 days validity");
                break;

            case 2:
                System.out.println("Recharge confirm Rs.399 → 56 days validity");
                break;

            case 3:
                System.out.println("Recharge confirm Rs.599 → 84 days validity");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}