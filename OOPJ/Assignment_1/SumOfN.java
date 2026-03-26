package com.primitivedatatypes;
import java.util.*;

public class SumOfN {
	
	public static void main(String args[]) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no N");
		
		int n = sc.nextInt();
		
		for(int i = 0; i <= n; i++) {
			
			sum = sum + i;
			
			
		}
		System.out.println( sum);
		
	
		
		
		
		
	}

}
