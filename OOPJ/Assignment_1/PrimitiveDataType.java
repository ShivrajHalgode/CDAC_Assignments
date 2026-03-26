package com.primitivedatatypes;

public class PrimitiveDataType {
	

//	int a= 10;
//	byte b = 10;
//	short s =10;
//	long l = 1000L;
//	float f = 10.0f;
//	double d = 20.99;
//	char c= 'A';
	
	int a;
	byte b;
	short s;
	long l ;
	float f;
	double d ;
	char c;


	boolean flage = true;
	public static void main(String args []) {
		PrimitiveDataType PDT = new PrimitiveDataType(); 
		
    System.out.println("byte : " +PDT. b);
    System.out.println("short : " + PDT.s);
    System.out.println("int : " + PDT.a);
    System.out.println("long : " + PDT.l);
    System.out.println("float : " + PDT.f);
    System.out.println("double : " + PDT.d);
    System.out.println("char : " + PDT.c);
    System.out.println("boolean: " + PDT.flage);
	
	
	
	}

}
