//============================================================================
// Name        : Exam_Grade.cpp
// Author      : Shivraj
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Employee{
private:
	int empID;
	string empName;
	double empSalary;

public:
	int getEmpId() const {
		return empID;
	}

	void setEmpId(int empId) {
		empID = empId;
	}

	const string& getEmpName() const {
		return empName;
	}

	void setEmpName(const string &empName) {
		this->empName = empName;
	}

	double getEmpSalary() const {
		return empSalary;
	}

	void setEmpSalary(double empSalary) {
		this->empSalary = empSalary;
	}




	double calculateGrossSalary() {
	        double grossSalary;

	        if (empSalary <= 5000)
	            grossSalary = empSalary + (empSalary * 0.10);
	        else if (empSalary <= 10000)
	            grossSalary = empSalary + (empSalary * 0.15);
	        else
	            grossSalary = empSalary + (empSalary * 0.20);

	        return grossSalary;
	    }
	void displayEmployeeDetails() {
	        cout << "\nEmployee ID: " << empID;
	        cout << "\nEmployee Name: " << empName;
	        cout << "\nEmployee Salary: " << empSalary;
	        cout << "\nGross Salary: " << calculateGrossSalary() << endl;
	    }
	};

	int main() {
	    const int MAX = 2;
	    Employee emp[MAX];
	    int count = 0;
	    int choice;

	    do {
	        cout << "\n===== EMPLOYEE PAYROLL MENU =====";
	        cout << "\n1. Add New Employee";
	        cout << "\n2. Calculate Gross Salary";
	        cout << "\n3. Display Employee Details";
	        cout << "\n4. Update Employee Information";
	        cout << "\n5. Exit";
	        cout << "\nEnter choice: ";
	        cin >> choice;

	        switch (choice) {

	        case 1: {
	            if (count >= MAX) {
	                cout << "Employee limit reached!\n";
	                break;
	            }

	            int id;
	            string name;
	            double salary;
	            bool isUnique = true;

	            cout << "Enter Employee ID: ";
	            cin >> id;

	            // Check Unique ID
	            for (int i = 0; i < count; i++) {
	                if (emp[i].getEmpId() == id) {
	                    isUnique = false;
	                    break;
	                }
	            }

	            if (!isUnique) {
	                cout << "Employee ID already exists!\n";
	                break;
	            }

	            cout << "Enter Employee Name: ";
	            cin.ignore();
	            getline(cin, name);

	            cout << "Enter Employee Salary: ";
	            cin >> salary;

	            emp[count].setEmpId(id);
	            emp[count].setEmpName(name);
	            emp[count].setEmpSalary(salary);

	            count++;
	            cout << "Employee Added Successfully!\n";
	            break;
	        }

	        case 2: {
	            int id;
	            cout << "Enter Employee ID: ";
	            cin >> id;

	            bool found = false;
	            for (int i = 0; i < count; i++) {
	                if (emp[i].getEmpId() == id) {
	                    cout << "Gross Salary: "
	                         << emp[i].calculateGrossSalary() << endl;
	                    found = true;
	                    break;
	                }
	            }

	            if (!found)
	                cout << "Employee Not Found!\n";
	            break;
	        }

	        case 3: {
	            int id;
	            cout << "Enter Employee ID: ";
	            cin >> id;

	            bool found = false;
	            for (int i = 0; i < count; i++) {
	                if (emp[i].getEmpId() == id) {
	                    emp[i].displayEmployeeDetails();
	                    found = true;
	                    break;
	                }
	            }

	            if (!found)
	                cout << "Employee Not Found!\n";
	            break;
	        }

	        case 4: {
	            int id;
	            cout << "Enter Employee ID to Update: ";
	            cin >> id;

	            bool found = false;
	            for (int i = 0; i < count; i++) {
	                if (emp[i].getEmpId() == id) {
	                    string name;
	                    double salary;

	                    cout << "Enter New Name: ";
	                    cin.ignore();
	                    getline(cin, name);

	                    cout << "Enter New Salary: ";
	                    cin >> salary;

	                    emp[i].setEmpName(name);
	                    emp[i].setEmpSalary(salary);

	                    cout << "Employee Updated Successfully!\n";
	                    found = true;
	                    break;
	                }
	            }

	            if (!found)
	                cout << "Employee Not Found!\n";
	            break;
	        }

	        case 5:
	            cout << "Exiting Program...\n";
	            break;

	        default:
	            cout << "Invalid Choice!\n";
	        }

	    } while (choice != 5);

	    return 0;
	}
