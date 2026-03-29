package overloaded;
import java.util.*;

public class salaryconversion {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter salary (double): ");
	        double salary = sc.nextDouble();
	        
	        
	        int intSalary = (int) salary;
	        
	       
	        float floatSalary = (float) salary;
	        
	       
	        System.out.println("Original double value: " + salary);
	        System.out.println("After converting to int : " + intSalary);
	        System.out.println("After converting to float: " + floatSalary);
	        
	     
	        System.out.println("\nPrecision loss in int: " + (salary - intSalary));
	        System.out.println("Precision loss in float: " + (salary - floatSalary));
	    }
	
	
	}


