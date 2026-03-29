import java.util.*;

class student{
	int roll;
	String name;
	int marks;
	contact contact;
	
	
	student(int roll, String name, int marks,contact contact){
		
		this.roll=roll;
		this.name= name;
		this.marks=marks;
		this.contact=contact;
	}
	
	
	
	void printdetails(){
		System.out.println(roll+ name + marks);
		
	}
	
}


class contact {
	
	
	String contacno;
	String email;
	
	contact(String contctno, String email){
		this.contacno= contctno;
		this.email=email;
		
		
	}
	
	void printcont() {
		
		System.out.println(contacno +" " +email);
	}
}
public class Studenrecorsinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int noS;
		System.out.println("Enter no of records");
		noS = sc.nextInt();
		
		student student[]= new student[noS];
		
		for(int i =0; i<noS; i++) {
			System.out.println("Enter roll no , name, marks ");
			
			int roll= sc.nextInt();
			sc.nextLine();
			String name= sc.nextLine();
			int Marks= sc.nextInt();
			System.out.println("Enter contact no and email:");
			
			
			
			
			//contact 
			
			
			String contacno =sc.nextLine();
			sc.nextLine();
			String email = sc.nextLine();
			contact c = new contact(contacno,email);
			
			student[i]= new student(roll,name,Marks,c);
//			student[i].roll= sc.nextInt();
//			sc.nextLine();
//			student[i].name=sc.nextLine();
//			student[i].marks= sc.nextInt();
//			
			
		}
		
		
		System.out.println("Recoreds are");
		
		for(int i = 0; i<noS;i++) {
			
			student[i].printdetails();
			student[i].contact.printcont();
			
			
		}
		
		
		
		

	}

}
