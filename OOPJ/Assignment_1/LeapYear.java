package com.primitivedatatypes;
import java.util.*;
public class LeapYear {
	
	public static void main (String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Year to cheak Leap Year or Not");
		
		int year = sc.nextInt();
		
		if ((year % 4 == 0 && year %100 !=0) || (year % 400 ==0)) {
			System.out.println("year is Leap Year");
			
			
		}
		else {
			
			System.out.println("year is not Leap year");
		}
		
	}

}
