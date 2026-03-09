//============================================================================
// Name        : StudentSystem.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================


/*
 * When does compiler generate a default constructor?
 * -> If no constructor is defined in a class, the compiler automatically generates a
 * 		default constructor that initializes the object.
 *
 * When does it NOT generate one?
 * -> If the programmer defines any constructor in the class, the compiler does not automatically generate
 * 		a default constructor.
 *
 *
 * Can constructors be overloaded?
 * -> Yes, constructors can be overloaded.
 *		A class can have multiple constructors with different parameter lists.
 *
 * */

#include <iostream>
using namespace std;

class Student{
private:
	int rollNo;
	string name;
	float mark;

public:
	float getMark() const {
		return mark;
	}

	void setMark(float mark) {
		this->mark = mark;
	}

	const string& getName() const {
		return name;
	}

	void setName(const string &name) {
		this->name = name;
	}

	int getRollNo() const {
		return rollNo;
	}

	void setRollNo(int rollNo) {
		this->rollNo = rollNo;
	}

	Student():rollNo(01),name("P"),mark(80.0){
//		this->rollNo=0;
//		this->name="";
//		this->mark=0.0;
	}
	Student(int rollNo, string name, float mark){
		this->rollNo=rollNo;
		this->name=name;
		this->mark=mark;
	}
	void studentData(){
		cout<<"Roll No: "<<rollNo<<"\t Name: "<<name<<"\t Mark: "<<mark<<endl;
	}
};

int main() {
	Student s;
	s.studentData();

	Student s1;
	s1.setRollNo(101);
	s1.setName("Avdhut");
	s1.setMark(90);

	s1.studentData();

	Student s2(102,"ppc",70.0);
	s2.studentData();

	Student s3(103,"mangesh",90.0);
	s3.studentData();


	cout << "!!!Hello World!!!" << endl;
	return 0;
}
