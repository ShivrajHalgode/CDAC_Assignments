package com.bill;

import java.util.*;

public class Que1Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name");
		String customername= sc.nextLine();
		
		System.out.println("Enter Customer number");
		
		int customerno = sc.nextInt();
		System.out.println("Enter Customer unit");
		int unit = sc.nextInt();
		
		double bill= 0;
		
		if (unit <= 100) {
			bill = unit*5;
			
			
			
		}else if (unit<=200) {
			
			bill = (100*5) + (unit -100)*7;
		}
		else {
			
			bill = (100*5) + (100 * 7) + (unit - 200) * 10;
		}
		
		
		
		if(bill> 1500) {
			
			bill = bill+(bill*0.05);
		}
		
		System.out.println("-------------------Electricity Bill ---------------");
        System.out.println("Customer Name   : " + customername);
        System.out.println("Consumer Number : " + customerno);
        System.out.println("Units Consumed  : " + unit);
        System.out.println("Total Bill      : Rs. " + bill);
    }
		

	}


