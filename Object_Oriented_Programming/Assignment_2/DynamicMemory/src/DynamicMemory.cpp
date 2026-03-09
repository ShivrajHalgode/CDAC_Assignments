//============================================================================
// Name        : DynamicMemory.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

/*
 * Why constructors are not called when using malloc
 * ->	malloc only assign memory not create object so it will not call construct
 *
 * Why new is preferred in C++
 * ->	The new operator not only allocates memory but also calls the constructor to initialize the object.
 *		This ensures that objects of a class are properly initialized when they are created.
 *
 * Difference in return types and initialization
 * ->	"malloc" dosn't initialize the object and return void* which require type casting pointer
 * 		"new" it initialize the object by calling constructor and return pointer so no need to type casting
 *
 * Why malloc cannot initialize complex types
 * -> malloc cannot initialize complex types because it only allocates memory and does not call constructors.
 *
 *
 *
 * */

#include <iostream>
using namespace std;

int main() {

	int* arr = new int[5];
	cout << "Enter 5 Number" << endl;
	for(int i=0; i<5; i++){
		cin>>arr[i];
	}
	for(int i=0; i<5; i++){
		cout<<arr[i]<<" ";
	}
	delete arr;

	cout<<endl;

	int* arr1 =(int*) malloc(5*sizeof(int));
	cout << "Enter 5 Number" << endl;
	for(int i=0; i<5; i++){
		cin>>arr1[i];
	}
	for(int i=0; i<5; i++){
		cout<<arr1[i]<<" ";
	}
	free(arr1);




	return 0;
}
