package com.assignmnets;

import java.util.*;

public class que2 {
	
	 public static <T> void generateReport(List<T> data) {
	        System.out.println("----- Report -----");
	        for (T item : data) {
	            System.out.println(item);
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<Integer> sales = Arrays.asList(100, 200, 300);
	        generateReport(sales);

	        // Employee names
	        List<String> names = Arrays.asList("Amit", "Riya", "John");
	        generateReport(names);

	        // Product IDs
	        List<Integer> productIds = Arrays.asList(101, 102, 103);
	        generateReport(productIds);
	}

}
