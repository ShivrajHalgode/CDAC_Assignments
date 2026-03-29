package overloaded;

public class StudentCounter {
	
	String name ;
	int rollno;
	static int count;
	
	StudentCounter(String name, int rollno){
		this.name=name;
		this.rollno= rollno;
		count++;
	}
	
	void studentdetails() {
		System.out.println("Name and rollno of student: "+ name +" " +rollno);
	}
	
	static void display() {
		
		
		System.out.println("count of student"+count);
		
	}

	public static void main(String[] args) {
		
		
		StudentCounter sc1 = new StudentCounter("Shraddha", 1);
        StudentCounter sc2 = new StudentCounter("Shiv", 2);
        StudentCounter sc3 = new StudentCounter("Radha", 3);

        sc1.studentdetails();
        sc2.studentdetails();
        sc3.studentdetails();

        StudentCounter.display();
		
		
		// TODO Auto-generated method stub
		
//		Create a class Student: 
//			Requirements: 
//			● Instance variables: name, rollNo 
//			● Static variable: totalStudents 
//			● Increment totalStudents every time object is created 
//			● Display total number of students 
////			Bonus: Add a static method to display count
///
///

	}

}
