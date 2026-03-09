//============================================================================
// Name        : EmployeeInfo.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

/*
 * 	1. Why must const members be initialized in initializer list?
 * 	->	Because const data members can be initialized only once, at the time the object is created.
 *		The initializer list initializes them before the constructor body runs.
 *
 *	2. What happens if you try to assign the value of a const member inside constructor body?
 *	->	It causes a compilation error.
 *		const members cannot be reassigned after initialization.
 *
 *	3. Why is initializer list faster than assignment?
 *	->	initializer list directly initializes the member.
 *		Assignment first creates the member (default initialization) and then assigns a value.
 *		So initializer list avoids extra step, making it more efficient.
 *
 *
 *
 * */

#include <iostream>
using namespace std;

class Employee{
private:
	const int employeeId;
	string name;
	float salary;
public:
	Employee():employeeId(0),name(" "),salary(77.0){}
	Employee(int employeeId, string name, float salary):employeeId(employeeId),name(name),salary(salary){}

	void employeeData(){
		cout<<"employeeId: "<<employeeId<<"\t name: "<<name<<"\t salary: "<<salary<<endl;
	}
};
//
//class Employee{
//private:
//	const int employeeId;
//	string name;
//	float salary;
//public:
//	const int getEmployeeId() const {
//		return employeeId;
//	}
//
//	const string& getName() const {
//		return name;
//	}
//
//	void setName(const string &name) {
//		this->name = name;
//	}
//
//	float getSalary() const {
//		return salary;
//	}
//
//	void setSalary(float salary) {
//		this->salary = salary;
//	}
//
//	Employee(int employeeId, string name, float salary):employeeId(employeeId),name(name),salary(salary){}
//
//	void employeeData(){
//		cout<<"employeeId: "<<employeeId<<"\t name: "<<name<<"\t salary: "<<salary<<endl;
//	}
//};

int main() {
	Employee e(101,"PPC",7000.0);
	e.employeeData();
	cout << "!!!Hello World!!!" << endl;
	return 0;
}
