package assignment4;

import java.util.*;

interface BankService{
	void deposit(double amount);
	void withdraw(double amount);
}
	
class Account implements BankService {
	int accountNumber ;
	String accountHolderName;
	double balance;
	
	Account(int accountNumber,String accountHolderName,String balance){
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		 this.balance = Double.parseDouble(balance); 
	}
	
	
	
	
	public void deposit(double amount){
		if(amount <= 0) {
			System.out.println("invalid amount");
		}
		else balance +=amount;
		
		
	}
	
	void deposit(double amount, double bonus) {
		if (amount <= 0|| bonus <0) {
			System.out.println("invalid amount");
		}else {
			balance += (amount + bonus);
			
		}
		
		
	}
	public void withdraw(double amount){
		
		if(amount <= 0 ) {
			System.out.println("invalid amount");
		}else if(amount > balance) {
			System.out.println("insufficent balnce");
		}else {
			balance -= amount;
		}
			
		}
	

	String displayAccountDetails() {
		return "Acc No: " + accountNumber +
	               ", Name: " + accountHolderName +
	               ", Balance: " + balance;
	    }
	
	void accountsummary() {
		StringBuffer sb = new StringBuffer();
		sb.append("account details").append(displayAccountDetails());
		
		System.out.println(sb.toString());
	}
	
	
	
}


class SavingsAccount extends Account{
	
	
	
	SavingsAccount(int accountNumber,String accountHolderName,String balance){
		super(accountNumber,accountHolderName,balance);
	}
	
	String displayAccountDetails() {
		return "Saving account : "+ super.displayAccountDetails();
		
	}
	
}

class CurrentAccount extends Account{
	CurrentAccount(int accountNumber,String accountHolderName,String balance){
		super(accountNumber,accountHolderName,balance);
		
	}
	
	String displayAccountDetails() {
		return "Saving account : "+ super.displayAccountDetails();
		
	}
	
}



public class SmartBankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("enter account no");
		
		int accountno = sc.nextInt();
		
		System.out.println("eneter accounholder name");
		String name = sc.next();
		
		System.out.println("enetr balnce");
		String  bal = sc.next();
		
		double amount = sc.nextDouble();
		Account account = new Account(accountno, name,bal);
		account.deposit(amount);
		account.withdraw(amount);
		
		account.accountsummary();
		

		} catch (NumberFormatException e) {
            System.out.println("Invalid numeric input for balance");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input type");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}