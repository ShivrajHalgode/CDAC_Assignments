package com.primitivedatatypes;
import java.util.*;

public class SimpleCal {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Num1");
		double num1 = sc.nextDouble();
		System.out.println("Num2");
		double num2 = sc.nextDouble();
		
		System.out.println("Enter opration like + - / *");
		char op = sc.next().charAt(0);
		
		double result = 0;
		switch(op) {
		
		case '+':
			result = num1 + num2;
			
			break;
		case '-':
			result = num1 - num2;
			
			break;
		case '/':
			
			if(num2 != 0)
                result = num1 / num2;
            else {
                System.out.println("Cannot divide by zero");
                return;
            }
			break;
		case '*':
			result = num1 * num2;
			
			break;
			
		
	default:
        System.out.println("Invalid operator");
        return;
}

System.out.println("Result: " + result);
		
		
		
	}

}
