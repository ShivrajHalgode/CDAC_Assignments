package com.restaurant;
import java.util.*;
public class Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int choice ;
		int total =0;
		char more;
		
		
		do {
			System.out.println("------ MENU ------");
            System.out.println("1. Burger - 100");
            System.out.println("2. Pizza - 200");
            System.out.println("3. Sandwich - 80");
            System.out.println("4. Coffee - 50");
            
            System.out.println("Enter choice");
            choice = sc.nextInt();
            
            switch(choice) {
            
            case 1:
            	total = total +100;
            	System.out.println("Burger added");
            	break;
            	
            case 2:
            	total =total+200;
            	System.out.println("Pizz added");
            	break;
            	
            case 3:
            	total =total+80;
            	System.out.println("Sandwich added");
            	break;
            	
            case 4:
            	total =total+50;
            	System.out.println("Coffee added");
            	break;
            }
            System.out.println("do you want to add more (yes/no)");
             more = sc.next().charAt(0);
            
			
		}while(more == 'Y' || more == 'y');
		
		double gst = total*0.5;
		double totalbill= total+gst;
		
		System.out.println("\n----- BILL -----");
        System.out.println("Total Amount: " + total);
        System.out.println("GST (5%): " + gst);
        System.out.println("Final Bill: " + totalbill);
        
        
        sc.close();


	}
	
	

}
