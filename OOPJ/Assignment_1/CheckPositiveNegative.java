package com.primitivedatatypes;
import java.util.*;

public class CheckPositiveNegative {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no to check");
		int num = sc.nextInt();
		
		if(num >0) {
			
			System.out.println("No is positive");
			
		}
		else if(num <0 ) {
			System.out.println("No is negative");
			
		}
		
		else {
			System.out.println("No is 0");
			
			
		}
		
		
	}

}
