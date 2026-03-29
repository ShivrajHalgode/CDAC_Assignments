package com.atm;
import java.util.*;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter initial balance: ");
		double balance= sc.nextDouble();
		   int choice;
		
		
		do {
			
			
		System.out.println("1. Check balance");
		System.out.println("2. Deposit Money ");
		System.out.println("3. Withdraw Money ");
		System.out.println("4. Exit");
		System.out.println("Enter choice");
		 choice = sc.nextInt();
		switch(choice) {
		
		case 1: 
			System.out.println("Current Balance: " + balance);
            break;
			
			
		case 2:
			System.out.println("Enter money to deposit ");
			double deposit = sc.nextDouble();
			balance +=deposit;
			
			System.out.println("deposited moneay "+deposit);
			
			break;
			
		case 3 : 
			System.out.println("Enter money to withdraw ");
			double withdraw = sc.nextDouble();
			
			if(withdraw >balance) {
				
				System.out.println("insufficent balance ");
			}
			
			else {
				
				System.out.println("you can withdraw");
				
				double withdrawmoney;
				
				withdrawmoney = balance- withdraw;
				
			}
			break;
			
		case 4: System.out.println("Exit");
		
		}
		
		
		}while(choice != 4); 
			
			
		
		
		
		

}
}
