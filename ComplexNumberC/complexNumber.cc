/**
	@file complexNumber.h
	class to model complex numbers
 */

#include "complexNumber.h"

//complexNumber default constructor
complexNumber::complexNumber() //no return type, no need to specify return type
{
	r = 0;
	i = 0;
	cout<< "complexNumber constructor called: " <<endl;
}

//complexNumber destructor
complexNumber::~complexNumber(void)
{
    cout << "Object is being deleted" << endl;
}

//complexNumber constructor
complexNumber::complexNumber(float _r, float  _i)
{
	r = _r;
	i = _i;
}

//getter methods
float complexNumber::get_R(void) const
{
	return r;
}

float complexNumber::get_I(void) const
{
	return i;
}


//setter methods
void complexNumber::set_R(float real) 
{
	r = real;
}

void complexNumber::set_I(float imag) 
{
	i = imag;
}



//copy constructor for complexNumber
complexNumber::complexNumber(const complexNumber& _rhs)
{	
	cout<< "complexNumber copy constructor called: "	<<endl;
	r = _rhs.get_R();
	i = _rhs.get_I();
}

				//overloaded operators
//overloaded + operator
complexNumber complexNumber::operator+ (const complexNumber& _rhs) const
{
     	complexNumber a;
     	a.r = r + _rhs.get_R();
        a.i = i + _rhs.get_I();                                                                                       
		return a;
		//return complexNumber(r + _rhs.get_R(), etc)
}

//overlaoded - operator
complexNumber complexNumber::operator- (const complexNumber& _rhs) const
{
  	complexNumber a;
	a.r = r - _rhs.get_R();
  	a.i = i - _rhs.get_I();
	return a; 
}

//overloaded * operator
complexNumber complexNumber::operator* (const complexNumber& _rhs) const
{   
	complexNumber a;
    a.r = (r * _rhs.get_R() - (i * _rhs.get_I()));
    a.i = (i * _rhs.get_I() + (r * _rhs.get_R()));
    return a;
}

//overloaded / operator
complexNumber complexNumber::operator/ (const complexNumber& _rhs) const
{
	complexNumber a;
   	a.r = (r * _rhs.get_R() + i * _rhs.get_I())/(_rhs.get_R() * _rhs.get_R()) + (_rhs.get_I() * _rhs.get_I());
    a.i = (i * _rhs.get_R() - r * _rhs.get_I()) /(_rhs.get_R() * _rhs.get_R()) + (_rhs.get_I() * _rhs.get_I());
    return a;
}

//overloaded == operator
bool complexNumber::operator== (const complexNumber& _rhs)
{
	if(fabs((r - _rhs.get_R()) + (fabs(i - _rhs.get_I()))) <= .00001)
	{
		return true;
	}
	else
	{
		return false;
	}
}
//testing method
void complexTester(complexNumber result, complexNumber expected)
{
 	if((result==expected) == 1){
	    cout << "True" << endl;
	}
   	else{
   		cout << "False" << endl;
      	cout << "Result = " << result << ",  Exepected = " << expected << endl;
     	}
}

//overloaded outstream, prints out the complex number in proper format (a + bi)
ostream& operator<< ( ostream& os, const complexNumber& s )
{
	return cout<< s.get_R() << " + " << s.get_I() << "i" <<endl;
}







