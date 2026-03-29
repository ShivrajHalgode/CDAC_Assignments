package com.studentmarkstable;
import java.util.*;
public class StudentMarksTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String sub1;
		
		
		Scanner sc = new Scanner(System.in);
		String student[] = new String[3];
		int marks[][]= new int[3][3];
		
		
		for(int i =0; i<student.length; i++) {
			System.out.println("Enter name of srudent ");
			 student[i]= sc.nextLine();
			 
			 System.out.println("Enter marks ");
			 
			 for(int j =0; j<3; j++){
				 
				 marks[i][j]=sc.nextInt();
			 }
			 
			sc.nextLine();
			 
		}
		
		System.out.println("------student marks--------");
		System.out.println("name\tsub1\tsub2\tsub3\ttotal\tavg");
		
		for(int i =0; i<3 ; i++) {
			System.out.print(student[i]+ "\t");
			
			int total = 0;
			
			for(int j=0; j<3;j++) {
				System.out.print(marks[i][j]+"\t");
				total += marks[i][j];
				
			}
		 double avg = total/3.0;
		 
		 System.out.print(total+"\t"  + avg);
		 System.out.println();
	
				
				
			}
			
			
			sc.close();
		}
		
		
	}


