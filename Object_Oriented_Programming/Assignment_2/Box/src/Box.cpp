//============================================================================
// Name        : Box.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Box{

private:
	int length;
	int width;
	int height;
//	const int height;

public:
	int getHeight() const {
		return height;
	}

//	void setHeight(int height) const {		//when data member is const then member function as to be const
//		height = height;					//"this" keyword this not work because of const so it will assign by himself
//	}

	void setHeight(int height){
			this->height = height;
		}

	int getLength() const {
		return length;
	}

	void setLength(int length) {
		this->length = length;
	}

	int getWidth() const {
		return width;
	}

	void setWidth(int width) {
		this->width = width;
	}

	//default constructor
	Box(){};


	//this constructor not handle const data member
//	Box(int length, int width, int height){
//			this->length=length;
//			this->width=width;
//			this->height=height;
//		}


	/*
	 *	when the one or more of data member is "const" we have to assign value during initialization
	 *	const have fixed value so we can't assign value by the "this" keyword
	 *	so c++ introduce the Constructor initializer list
	 *	ClassName(parameter_list) : member1(value1), member2(value2), ... {
 	 *	 // constructor body
	 *	}
	 *
	 */
	Box(int length, int width, int height):length(length),width(width),height(height){}




	void setDimensions(int length,int width,int height){
		setLength(length);
		setWidth(width);
		setHeight(height);
	}

	int volume(){
		return length*width*height;
	}


};

int main() {

//	Box b(5,6,7);
//
//	cout << "length: "<<b.getLength() <<"\t width: "<< b.getWidth()<<"\t height: "<<b.getHeight() << endl; // prints !!!Hello World!!!
//	cout << "Volume: "<<b.volume()  << endl;
//
//	Box b1(10,6,7);
//
//		cout << "length: "<<b1.getLength() <<"\t width: "<< b1.getWidth()<<"\t height: "<<b1.getHeight() << endl; // prints !!!Hello World!!!
//		cout << "Volume: "<<b1.volume()  << endl;
//	return 0;

	Box b2;
	b2.setDimensions(5, 10, 15);

	cout << "length: "<<b2.getLength() <<"\t width: "<< b2.getWidth()<<"\t height: "<<b2.getHeight() << endl; // prints !!!Hello World!!!
	cout << "Volume: "<<b2.volume()  << endl;

}

/*
	1. Why must initialization happen before assignment?
	->	Initialization happens when the object is created, while assignment happens after the object
		already exists.


	2.When is initialization preferred over assignment?
	->	when during the const and reference variable like "&b" the value assign the value initialize during
		object creation if not it will show error
			..\src\Box.cpp:18:12: note: 'const int Box::height' should be initialized
  	  	  	  const int height;
  	  	  	..\src\Box.cpp:54:2: error: uninitialized const member in 'const int' [-fpermissive]
  	  	  	  Box(int length, int width, int height){
		improve performance (direct initialization avoids extra assignment).
*/

