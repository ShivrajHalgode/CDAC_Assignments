package com.ExpressionEvaluator;
import java.util.*;

public class ExpressionEvaluator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a;
		int b;
		int c;
		int choice;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value for a");
		a=sc.nextInt();
		System.out.println("enter value for b");
		b=sc.nextInt();
		System.out.println("enter value for c");
		c=sc.nextInt();
		

		//choice=sc.nextInt();
		
		do {System.out.println("\nChoose operation:");
        System.out.println("1. (a + b) * c");
        System.out.println("2. a > b && b > c");
        System.out.println("3. a % b (Exit)");
		System.out.println("enter choice");
		

        choice = sc.nextInt();

        switch (choice) {

            case 1:
                int result1 = (a + b) * c;
                System.out.println("Result: " + result1);
                System.out.println("Explanation: First (a+b), then multiply by c");
                break;

            case 2:
                boolean result2 = (a > b && b > c);
                System.out.println("Result: " + result2);
                System.out.println("Explanation: Checks if a>b AND b>c");
                break;

            case 3:
                int result3 = a % b;
                System.out.println("Result: " + result3);
                System.out.println("Explanation: Remainder when a is divided by b");
                System.out.println("Exit");
                break;

            default:
                System.out.println("Invalid choice!");
        }

    } while (choice != 3);

    sc.close();
}
}