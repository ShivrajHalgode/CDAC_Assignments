package com.student;
import java.util.*;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student name ");
		
		String stdname = sc.nextLine();
		
		System.out.println("Enter student Roll no ");
		
		int rollno = sc.nextInt();
		
		System.out.println("Enter student Marks ");
		int marks[]= new int[5];
		
		for(int i =0 ; i<5; i++) {
			
			marks[i]= sc.nextInt();
			
		}
		
		for(int i= 0; i<5; i++) {
			
			System.out.println(marks[i]);
		}
		
		int total = 0;
		
		for(int i =0; i<5; i++) {
			total +=marks[i];
		}
		double avargae= total /5.0;
		
		double percentage= avargae;
		
		
		if (percentage >= 90) {
			
			System.out.println("A ");

			
		}else if (percentage >= 75 ) {
			
			System.out.println("B ");

		}else if (percentage >= 60) {
			
			System.out.println("C ");

		}else if (percentage >= 40 ) {
			
			System.out.println("D");

		}else {
			
			System.out.println("Fail");

		}
		
		System.out.println("--------------------student management system------------");
		System.out.println("Enetr name :" + stdname);
	    System.out.println("Roll No: " + rollno);
	    System.out.println("Total: " + total);
	    System.out.println("Percentage: " + percentage);
		
	}

}
