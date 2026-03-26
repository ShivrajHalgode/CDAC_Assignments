package com.primitivedatatypes;

public class countdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1234;
		int count = 0;
		
		if(num == 0) {
			
			count = 1;
			
		}else {
			while(num != 0) {
				num = num / 10;
				count++;
				
				
				
			}
		}
		
		System.out.println("Number of digit " + count);

	}
	

}
