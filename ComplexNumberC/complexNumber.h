#include <iostream>
#include <cmath>

using namespace std;


#ifndef COMPL_H
#define COMPL_H

class complexNumber
{
public:
	complexNumber(); //Default constructor	
	//destructor
	virtual ~complexNumber();
	complexNumber (float r, float i);
	//tester method 
	void complexTester(complexNumber result, complexNumber expected);
		
	//overloaded + operator
	complexNumber operator+ (const complexNumber& _rhs) const; 
	//constant afterwards says I will not change the values c = a+b , a+b wont chang
	
	//overloaded - operator
	complexNumber operator- (const complexNumber& _rhs) const;
	//overloaded * operator
	complexNumber operator/ (const complexNumber& _rhs) const;
	//overloaded / operator
	complexNumber operator* (const complexNumber& _rhs) const;
	//overloaded == operator	
	bool operator== (const complexNumber& _rhs);

	//copy constructor
	complexNumber (const complexNumber& _rhs);
	

	//getter methods
	float get_R() const;
	float get_I() const;

	//setter methods
	void set_R(float real);
	void set_I(float imag);

	
private:
	//instance variables
	float r;
	float i;
};	
// << operator needs to be defined outside of class
ostream& operator<< ( ostream& os, const complexNumber& s );

#endif






