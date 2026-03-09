//============================================================================
// Name        : Swap.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================


/*
 * Explain how reference variables act as aliases and how that affects swapByReference()
 * when normally send value then it will create the the copy of the value so we don't see swap between them
 * when we send the reference of the variable then it has to catch in the pointer if the pointer change the
 	value then it will reflect in original value  so we can see swap of value;
 * when we catch the function reference of the variable
 	 A reference variable is another name for an existing variable.
 *	variable have : "value" and "reference"
 *	pointer have  : "reference of variable as value" and "own reference"
 *	reference have: "it will point to the same memory location"
 */

#include <iostream>
using namespace std;

void swapByValue(int a, int b);					//perform swap on copy
void swapByAddress(int *a, int *b);				//perform swap on original
void swapByReference(int &a, int &b);			//perform swap on original



int main() {
	int a=10, b=20;
	cout << "before Swap by Value: " << a <<"\t b: " <<b<<endl;			//a=10 b=20
	swapByValue(a, b);
	cout << "After Swap by Value: " << a <<"\t b: " <<b<<endl;			//a=10 b=20
	swapByAddress(&a, &b);
	cout << "After Swap by Address: " << a <<"\t b: " <<b<<endl;		//a=20 b=10
	swapByReference(a, b);
	cout << "After Swap by Reference: " << a <<"\t b: " <<b<<endl;		//a=10 b=20
	cout << "" << endl; // prints !!!Hello World!!!
	return 0;
}

void swapByValue(int a, int b){
	a=a+b;
	b=a-b;
	a=a-b;
}
void swapByAddress(int *a, int *b){
	*a=*a+(*b);
	*b=*a-(*b);
	*a=*a-(*b);
}
void swapByReference(int &a, int &b){
	a=a+b;
	b=a-b;
	a=a-b;
}


