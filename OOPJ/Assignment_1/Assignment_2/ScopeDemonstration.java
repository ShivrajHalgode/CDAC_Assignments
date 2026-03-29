package com.scopedemonstrationprogram;

public class ScopeDemonstration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		  

		   
		        int methodVar = 10;
		        System.out.println("Method Scope: " + methodVar);

		      
		        for (int i = 0; i < 3; i++) {
		            int loopVar = i * 2;
		            System.out.println("Loop Scope i: " + i);
		            System.out.println("Loop Variable: " + loopVar);
		        }

		      


		        {
		            int blockVar = 50;
		            System.out.println("Block Scope: " + blockVar);
		        }

		     


		      
		        System.out.println("MethodVar still accessible: " + methodVar);
		    }
		

	}


