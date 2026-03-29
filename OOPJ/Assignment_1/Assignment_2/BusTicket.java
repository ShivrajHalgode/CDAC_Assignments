package com.busticket;
import java.util.*;

public class BusTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int seat[]= new int[10];
		int choice ;
		
		do {
			 System.out.println("\n--- Bus Ticket Booking ---");
	            System.out.println("1. View Available Seats");
	            System.out.println("2. Book a Seat");
	            System.out.println("3. Cancel a Seat");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");
	            
	            choice =sc.nextInt();
	            
	            switch(choice) {
	            
	            case 1: 
	            	System.out.println("Seat Status:");
	            	
	            	for(int i =0; i<10;i++) {
	            		
	            		if(seat[i]==0) {
	            			System.out.println("Seat" +(i+1) +":Avaliable");
	            			
	            			
	            		}else {
	            			System.out.println("Seat" +(i+1) +":Avaliable");	            		}
	            	}
	            	break;
	            	
	            case 2: 
	            	System.out.println("Enter seat number to book(1-10) ");
	            	int bookseat = sc.nextInt();
	            	
	            	if(bookseat < 1|| bookseat>10 ) {
	            		System.out.println("Invalid seat");
	            	}else if (seat[bookseat -1]==1) {
	            		System.out.println("Seat already booked");
	            		
	            		
	            	}else {
	            		seat[bookseat -1] =1;
	            		System.out.println("Seat booked ");
	            	}
	            	
	            case 3: 
	            	
	            	System.out.println("enter set not ");
	            	int cancel=sc.nextInt();
	            	
	            	if(cancel < 1 || cancel >10) {
	            		System.out.println("Invalid");
	            	} else if (seat[cancel -1 ]==0) {
	            		System.out.println("seat already empty ");
	            	}
	            	else {
	            		seat[cancel- 1]=0;
	            		System.out.println("Seat cancelled ");
	            		
	            	}
	            	break;
	            	
	            case 4: 
	            	System.out.println("Exit");
	            	
	            default : 
	            	System.out.println("Invalid choice ");
	            
	            }
	            
	            	
		}while(choice != 4);
		sc.close();

	}

}
