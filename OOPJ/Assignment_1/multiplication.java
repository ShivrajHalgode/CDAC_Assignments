package com.primitivedatatypes;
import java.util.*;

public class multiplication {
	
	public static void main(String args[]) {
		
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no for multiplacation");
		int n = sc.nextInt();
		
		for(int i = 1; i<=10; i++) {
			
			sum = i*n;
			System.out.println(n +" "+ "X " +" "+ i + " "+ "=" + " " +  sum);
		}
		
	}

}
