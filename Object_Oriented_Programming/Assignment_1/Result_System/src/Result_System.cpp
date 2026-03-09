//============================================================================
// Name        : Result_System.cpp
// Author      : Shivraj
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Student{
protected:
	int rollNo;

public:
	Student (int r){
		rollNo = r ;
	}

	virtual void display(){
		cout << "RollNumber: "<<rollNo <<endl;
	}
};

class Result : public Student{
private:
	float marks;
public:
	Result (int r, float m) : Student(r){
		marks = m;
	}

	void display(){
		cout << "RollNumber: " << rollNo <<endl;
		cout << "Marks: " << marks <<endl;
	}
};
int main() {
	Result r1(1, 78);
	Student* ptr;
	ptr = &r1;
	ptr->display();
	return 0;
}


// 1. Which constructor will be called first: Student or Result?
// The Student constructor is called first.
// Reason: In inheritance, the base class constructor executes before the derived class constructor so that the base part of the object is initialized first.
// Order:
// Student constructor
// Result constructor

// 2. Does the program demonstrate early binding or late binding?
// The program demonstrates late binding (runtime polymorphism).
// Reason:
// The function display() is virtual.
// It is called using a base class pointer (Student* ptr).
// The decision about which display() to execute happens at runtime, not at compile time.

// 3. Why is the display() function declared as virtual?
// display() is declared virtual to enable runtime polymorphism.
// This ensures:
// When a base class pointer points to a derived class object,
// The derived class version of display() is called instead of the base version.
// Without virtual, the program would call Student::display() instead of Result::display().

