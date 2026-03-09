//============================================================================
// Name        : 4.cpp
// Author      : shil
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <stdlib.h>

void func(int val){
	printf("inside int func");
}

void func(int *val){
	printf("inside int* func");
}


int main(){

	int *ptr = NULL;

	int *p = nullptr; // return_type: nullptr_t

	func(ptr);

	return 0;
}



int main1() {
	int num = 10;

	int &n = num;	// reference variable

	int *ptrNum = &num;	// pointer to

//	int *ptrNum;		// GB_Value -> Wild Pointer

//	int *ptr = NULL;		//NULL: Macro which has a value 0;
//	int *p = nullptr;	//nullptr: represents pointer

//	int* ptrNum = &num; // valid
//
//	int * ptrNum = &num;	//valid


	printf("num: %d \n", num);
	printf("address of num: %p \n", &num);
//	printf("address of n: %p \n", &n);

//	*pointer_variable_name : Dereferecing
	*ptrNum = 20;	// allowed

	printf("ptrNum: %p \n", ptrNum);
	printf("address of ptrNum: %p \n", &ptrNum);
	printf("value of num via ptrNum: %d \n", *ptrNum);

	printf("num: %d \n", num);
	return 0;
}
