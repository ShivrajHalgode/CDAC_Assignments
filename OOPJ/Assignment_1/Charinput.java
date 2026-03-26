package com.primitivedatatypes;
import java.util.*;

public class Charinput {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a char");
		
		char c = sc.next().charAt(0);
		
		
		int priv = c-1;
		int after= c+1;
		
		char p = (char)priv;
		char a = (char)after;
		
		System.out.println("Perious :" + priv);
		System.out.println("After :" + after);
		System.out.println("Perious :" + p);
		System.out.println("After :" + a);
		
	}
	
	

}
