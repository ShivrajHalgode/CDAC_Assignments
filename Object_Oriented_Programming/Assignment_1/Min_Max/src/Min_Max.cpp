//============================================================================
// Name        : Min_Max.cpp
// Author      : Shivraj
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

// Function Declaration
void findMinMax(int a, int b, int c, int &minVal, int &maxVal);

int main() {
    int n1, n2, n3;
    int lowest, highest;   // Variables to store min and max

    cout << "Enter three integers: ";
    cin >> n1 >> n2 >> n3;

    // Function call
    findMinMax(n1, n2, n3, lowest, highest);

    // Printing results
    cout << "Minimum value: " << lowest << endl;
    cout << "Maximum value: " << highest << endl;

    // Verification
    cout << "\nAfter function call, lowest = " << lowest
         << " and highest = " << highest << endl;

    return 0;
}

// Function Definition
void findMinMax(int a, int b, int c, int &minVal, int &maxVal) {

    // Assume first value as min and max
    minVal = a;
    maxVal = a;

    if (b < minVal)
        minVal = b;
    if (b > maxVal)
        maxVal = b;

    if (c < minVal)
        minVal = c;
    if (c > maxVal)
        maxVal = c;
}
