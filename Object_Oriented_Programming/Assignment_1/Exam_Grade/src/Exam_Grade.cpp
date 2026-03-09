//============================================================================
// Name        : Exam_Grade.cpp
// Author      : Shivraj
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Student{
private:
	string name;
	int rollNumber;
	float marks;
	char grade;

public:
	char getGrade() const {
		return grade;
	}

	void setGrade(char grade) {
		this->grade = grade;
	}

	float getMarks() const {
		return marks;
	}

	void setMarks(float marks) {
		this->marks = marks;
	}

	const string& getName() const {
		return name;
	}

	void setName(const string &name) {
		this->name = name;
	}

	int getRollNumber() const {
		return rollNumber;
	}

	void setRollNumber(int rollNumber) {
		this->rollNumber = rollNumber;
	}

	void calculationGrade(){
		if (marks >=90 && marks <=100)
			grade ='A';
		else if (marks>=80)
			grade ='B';
		else if (marks>=70)
			grade ='C';
		else if (marks>=60)
			grade ='D';
		else
			grade ='F';
	}
};


int main() {
	int n, choice;

	cout <<"Enter number of students:";
	cin>>n;

	Student s[n];

	do{
		cout <<"\n==== MENU ====";
		cout <<"\n1. Accept Information";
		cout <<"\n2. Display Information";
		cout <<"\n3. Calculate Grade";
		cout <<"\n4. Exit";
		cout <<"\nEnter choice:";
		cin>> choice;

		switch (choice){
		case 1:
			for (int i =0;i<n;i++){
				string name;
				int rollno;
				float marks;

				cout <<"\nEnter details for Student "<< i + 1 << endl;

				cout << "Name:";
				cin >> name;
				cout <<"Roll Number:";
				cin >> rollno;
				cout << "Marks";
				cin >> marks;

				s[i].setName(name);
				s[i].setRollNumber(rollno);
				s[i].setMarks(marks);
			}
			break;

		case 2:
			for (int i = 0; i < n; i++) {
			                cout << "\nStudent " << i + 1;
			                cout << "\nName: " << s[i].getName();
			                cout << "\nRoll Number: " << s[i].getRollNumber();
			                cout << "\nMarks: " << s[i].getMarks();
			                cout << "\nGrade: " << s[i].getGrade() << endl;
			            }
			            break;

			        case 3:
			            for (int i = 0; i < n; i++) {
			                s[i].calculationGrade();
			            }
			            cout << "Grades Calculated Successfully!\n";
			            break;

			        case 4:
			            cout << "Exiting Program...\n";
			            break;

			        default:
			            cout << "Invalid Choice!";
			        }

			    } while (choice != 4);
	return 0;
}
