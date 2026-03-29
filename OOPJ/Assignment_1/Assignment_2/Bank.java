package com.bank;
import java.util.*;

public class Bank {
	
	int accountno;
	String name;
	int balance;
	
	Bank(){}
	Bank(int accountno, String name,int balance){
		this.accountno=accountno;
		this.name=name;
		this.balance=balance;
	}

	void display() {
		System.out.println("Account no" +" "+accountno  );
		System.out.println("Account Holder Name" +" "+name  );
		System.out.println("Balance" +" "+balance  );
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Accouont no");
		
		int accountno=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter name ");
		
		String name = sc.nextLine();
		
		System.out.println("Enter balance");
		int balance= sc.nextInt();
		
		// TODO Auto-generated method stub
		
		Bank b= new Bank(accountno,name,balance);
		b.display();
		
		

	}

}
