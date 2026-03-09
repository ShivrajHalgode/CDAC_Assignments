//============================================================================
// Name        : VariablePointer.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

/*
 * Two differences between pointer and reference
 * 	->	pointer != reference
 * 		pointer stores the address of a variable, reference is another name (alias) for the same variable
 *		reference variable is aliases of variable but pointer hold value as reference of variable and its own reference
 *		Pointers can be reassigned, but references cannot be reseated.
 *
 * Why references cannot be reseated but pointers can
 * ->	Pointer = variable storing address (can change).
 *		Reference = alias of variable (cannot change binding).
 *
 * Why references cannot be NULL
 * ->	reference is aliases of the variable when assign NULL it shows invalid initialization of non-const reference
 *		reference must always refer to a valid variable. Because reference must always bind to an object.
 *		pointer can store NULL value
 * */

#include <iostream>
using namespace std;

int main() {
	int a=10;
	cout << "a : "<<a<< endl;
	int* ptr = &a;
	cout << "*ptr : "<<*ptr<< endl;
	int &ref = a;
	cout << "&ref : "<<ref<< endl;
	cout << "before change a : "<<&a<<"\t *ptr : "<<ptr<<"\t &ref : "<<&ref<<"\n"<< endl;

	int num =20;
	ptr = &num;
	cout<<"After Pointer change Value"<<endl;
	cout << "a : "<<a<<"\t *ptr : "<<*ptr<<"\t &ref : "<<ref<< endl;
	cout << "a : "<<&a<<"\t *ptr : "<<ptr<<"\t &ref : "<<&ref<< "\n"<< endl;

	num=30;
	ref = num;
	cout<<"After Reference change Value"<<endl;
	cout << "a : "<<a<<"\t *ptr : "<<*ptr<<"\t &ref : "<<ref<< endl;
	cout << "a : "<<&a<<"\t *ptr : "<<ptr<<"\t &ref : "<<&ref<< "\n"<< endl;


	//int &ref1=NULL;		//\src\VariablePointer.cpp:45:12: error: invalid initialization of non-const
	  	  	  	  	  	//reference of type 'int&' from an rvalue of type 'int' int &ref1=NULL;
	return 0;
}
