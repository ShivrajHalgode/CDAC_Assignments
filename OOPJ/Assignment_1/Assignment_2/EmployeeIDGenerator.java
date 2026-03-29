package com.EmployeeIDGenerator;

public class EmployeeIDGenerator {
	
	static int count=0;
	
	int empid;
	String name;
	
	
	EmployeeIDGenerator(int empid , String name ){
		this.empid=empid;
		this.name=name;
		count++;
		
		
	}
	
	void display () {
		System.out.println("employee details ");
		System.out.println(empid);
		System.out.println(name);
		
	}
	
	void count() {
		System.out.println("emp count is :"+" "+ count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EmployeeIDGenerator eg1= new EmployeeIDGenerator(1, "sharddha");
		EmployeeIDGenerator eg= new EmployeeIDGenerator(2, "sai");
		eg.display();
		eg.count();
		eg1.display();
		//eg.count();

	}

}
