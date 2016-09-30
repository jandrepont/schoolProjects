/**                                                                                                                                      
  * Class ComplexNumber
  * Author: Joel Andrepont, University of New Orleans, Dept of Computer Science
  * Created On: 6/09/2015
  * Version: Alpha
  * Description:  Class ComplexNumber models a mathematical fraction by preserving the real
  * and imaginary numbers as seperate values.  It impliments the standard arithmatic operations of
  * addition, subtraction, multiplication, and division.
  **/

//import .Math for exponent method Math.pow()
import java.lang.Math;

public class ComplexNumber{
	/**
	*Instance Variables
    */
	
	private float real;		//real represents the real number of a complex number,
    private float imag;		//imag represents the imaginary number of a complex number, the i is added using the toString() method
    
	/**
    * Constructor
    * Takes two float arguments, the real and imaginary for the complex number
    * being created.
	* @param real takes a float
	* @param imag takes float
	**/
                                                                                                                         
	 public ComplexNumber(float real, float imag){
        //initialize instance variables
		this.real = real;
        this.imag = imag;		
    }
		//end constructor
    
   /**
	* Query
	* returns the value of the real number
	**/

    public float getReal(){
        return this.real;
    }


   /**
	* Query
	* returns the value of the imaginary number
	**/

    public float getImag(){
        return this.imag;
    }
	/**
    * Additon Method
   	* Takes one ComplexNumber argument, calculates the sum of the
    * calling ComplexNumber object and its argument, constructs a new ComplexNumber
    * object that stores the sum, and returns this new ComplexNumber object.
	* @param takes a ComplexNumber
	* @return the sum of 2 ComplexNumbers
	**/
    
    public ComplexNumber add(ComplexNumber otherNumber){
        ComplexNumber newComplex;
		
		//declare and initialize local variables for storing the result of adding two reals together
        float newReal = real + otherNumber.getReal();
		//declare and intialize local variables for storing the result of adding two imaginaries together
        float newImag = imag + otherNumber.getImag();
		//new complex created using new values
        newComplex = new ComplexNumber(newReal, newImag);
        return newComplex;
    }
    /**
	* Subtraction Method
	* Takes one Complex argument, calculates the difference of the ComplexNumber object and its argument,
	* constructs a new ComplexNumber object that stores the difference, and returns this ComplexNumber object.
	* @param a ComplexNumber 
	* @return a ComplexNumber	
	**/

    public ComplexNumber sub(ComplexNumber otherNumber){
        ComplexNumber newComplex;

		//declare and initialize local variables for storing the result of subtracting two reals
        float newReal = real - otherNumber.getReal();
		//declare and initialize local variables for storing the result of subtracting two imaginary numbers
        float newImag = imag - otherNumber.getImag();
		//new complex created using new values
        newComplex = new ComplexNumber(newReal, newImag);
        return newComplex;
    }
	/**
    * Multiplication Method
    * Takes one Complex argument, calculates the product of the ComplexNumber object and its argument,
	* constructs a new ComplexNumber object that stores the product, and returns this ComplexNumber object.
	* @param a ComplexNumber
	* @return a ComplexNumber
	**/

    public ComplexNumber mult(ComplexNumber otherNumber){
        ComplexNumber newComplex;
		//declare and initialize local variables for storing the result of multiplying two reals
        float newReal = (real * otherNumber.getReal()) - (imag * otherNumber.getImag());
		//declare and initialize local variables for storing the result of multiplying two imaginary numbers
        float newImag = imag * otherNumber.getReal() + real * otherNumber.getImag();
		//new complex created using new values
        newComplex = new ComplexNumber(newReal, newImag);
        return newComplex;
    }
    /**
	* Division Method
	* Takes one Complex argument, calculates the quotient of the ComplexNumber object and its argument,
    * constructs a new ComplexNumber object that stores the quotient, and returns this ComplexNumber object.
	* @param a ComplexNumber
	* @return a ComplexNumber
	**/
	public ComplexNumber div(ComplexNumber otherNumber){
        ComplexNumber newComplex;
        float newReal =(real *  otherNumber.getReal() + imag * otherNumber.getImag())/(float)((Math.pow(otherNumber.getReal(), 2) +
	    	(Math.pow(otherNumber.getImag(),2))));
        float newImag =(imag * otherNumber.getReal() - real * otherNumber.getImag()) /(float)((Math.pow(otherNumber.getReal(), 2) +
			(Math.pow(otherNumber.getImag(), 2))));
        newComplex = new ComplexNumber(newReal, newImag);
        return newComplex;
    }
	/**
	* toString mehod that returns the ComplexNumber  in (a +/- bi) form
	**/

	@Override 
	public String toString(){
		if(imag > 0.0){
			return real + " + " + imag + "i";
		}
		if(imag == 0.0){
			return real + "+ 0i";
		}	
		if(imag < 0){
			return real + " - " + -imag + "i";
		}
		return real + " + " + imag + "i"; 
	} 
}//end public class ComplexNumber
