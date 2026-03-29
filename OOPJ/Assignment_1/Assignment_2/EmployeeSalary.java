package employeesalary;

import java.util.*;
public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        // Input
	        System.out.print("Enter Employee Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Employee ID: ");
	        int id = sc.nextInt();

	        System.out.print("Enter Basic Salary: ");
	        double basic = sc.nextDouble();

	        // Calculations
	        double hra = basic * 0.20;
	        double da  = basic * 0.10;
	        double pf  = basic * 0.08;

	        double netSalary = basic + hra + da - pf;

	        // Output
	        System.out.println("\n--------- Salary Slip ---------");
	        System.out.println("Employee Name : " + name);
	        System.out.println("Employee ID   : " + id);
	        
	        System.out.println("Basic Salary  : " + basic);
	        System.out.println("HRA     : " + hra);
	        System.out.println("DA       : " + da);
	        System.out.println("PF      : " + pf);
	  
	        System.out.println("Net Salary    : " + netSalary);
	        
	    }
	}

