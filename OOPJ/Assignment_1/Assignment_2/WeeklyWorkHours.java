package com.weeklyworkhours;
import java.util.*;
public class WeeklyWorkHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String emp[]= new String[3];
		
		int week[][] = new int[3][];
		
		for(int i = 0; i<3; i++) {
			
			System.out.println("enter emp name");
			
			 emp[i] = sc.nextLine();
			 
			 System.out.println("enter working days");
			 int days = sc.nextInt();

			  week[i]= new int[days];
			 System.out.println("enter week and hours ");
			 
			 for(int j =0; j<days; j++) {
				 week[i][j]= sc.nextInt();
			 }
			 sc.nextLine();			
		}
		
		
		System.out.println("---------Weekly Work Hours -------");
		System.out.println("empname\tweek\thour");
		
		for(int i =0; i<3; i++) {
		System.out.print(emp[i] +"\t");
		
		for(int j =0 ; j<week[i].length; j++) {
			
			System.out.print(week[i][j]+"\t");
			
		}
		
		System.out.println();
		
		

	}

	}
}
