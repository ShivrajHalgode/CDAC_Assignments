package com.adddivsub;

import java.util.*;

public class AddDivSub {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no 1");
		int num1 = sc.nextInt() ;
		
		System.out.println("Enter no 2");
		double num2 = sc.nextDouble();
		
		int addres = (int) (num1 + num2);
		int divres = (int)(num1/num2);
		
		
		
		System.out.println("Addtion :" +addres );
		System.out.println("Division :" + divres);
		
		
		
		
		
		
	}

}
