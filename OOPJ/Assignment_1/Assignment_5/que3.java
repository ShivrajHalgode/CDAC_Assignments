package com.assignmnets;
import java.util.*;
public class que3 {
	  public static <T extends Number> void calculate(List<T> data) {
	        double sum = 0;

	        for (T num : data) {
	            sum += num.doubleValue();
	        }

	        double avg = sum / data.size();

	        System.out.println("Sum = " + sum);
	        System.out.println("Average = " + avg);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Integer> transactions = Arrays.asList(100, 200, 300);
	        calculate(transactions);

	        List<Double> salaries = Arrays.asList(25000.5, 30000.5, 40000.0);
	        calculate(salaries);

	}

}
