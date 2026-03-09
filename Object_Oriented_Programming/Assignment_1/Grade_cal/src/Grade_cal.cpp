//============================================================================
// Name        : Grade_Calculation.cpp
// Author      : Shivraj
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <stdio.h>

int main() {
	float sub1,sub2,sub3,sub4,sub5;
	float total,percentage;
	char grade;

	printf("Enter marks of 5 subjects:\n");
	fflush(stdout);
	scanf("%f %f %f %f %f", &sub1, &sub2, &sub3,&sub4,&sub5);
	total=sub1+sub2+sub3+sub4+sub5;
	percentage = total/5;

	grade=(percentage>=90) ? 'A' :
		  (percentage>=80) ? 'B' :
		  (percentage>=70) ? 'C' :
		  (percentage>=60) ? 'D' :
		  (percentage>=50) ? 'E' : 'F' ;

	printf("\n--- Result ---\n");
	    printf("Subject 1: %.2f\n", sub1);
	    printf("Subject 2: %.2f\n", sub2);
	    printf("Subject 3: %.2f\n", sub3);
	    printf("Subject 4: %.2f\n", sub4);
	    printf("Subject 5: %.2f\n", sub5);
	    printf("Total: %.2f\n", total);
	    printf("Percentage: %.2f%%\n", percentage);
	    printf("Grade: %c\n", grade);
	return 0;
}
