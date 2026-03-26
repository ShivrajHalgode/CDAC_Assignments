package com.primitivedatatypes;
import java.util.*;
public class reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		int n = sc.nextInt();
		
		int rev =0;
		
		while (n !=0) {
			int digit = n% 10;
			rev =rev* 10 + digit;
			n = n/10;
			
		}
		
		
		System.out.println("reverse number  " + rev);
		



	}

}
