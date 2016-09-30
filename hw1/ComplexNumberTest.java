import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.lang.Math;

public class ComplexNumberTest{
	protected ComplexNumber com1;
	protected ComplexNumber com2;
   
   // assigning the values
	@Before	
	public void setUp(){
    	com1 = new ComplexNumber((float) 2.0, (float) 3.0);
    	com2 = new ComplexNumber((float) 3.0, (float) 4.0);
   }

   // test method to add two values
	@Test
	public void testAdd(){
    	ComplexNumber result = com1.add(com2);  
		assertTrue(result.toString().equals("5.0 + 7.0i")); 
		assertTrue(result.getReal() == 5.0);
		assertTrue(result.getImag() == 7.0);
		System.out.println(result);
   }
	//test method to subtract two complex numbers
	@Test
	public void testSub(){
		ComplexNumber result = com1.sub(com2);
		assertTrue(result.toString().equals("-1.0 - 1.0i"));
		assertTrue(result.getReal() == -1.0);
		assertTrue(result.getImag() == -1.0);
		System.out.println(result);
	}
	@Test
	//test method to multiply two complex numbers
	public void testMult(){
		ComplexNumber result = com1.mult(com2);
		assertTrue(result.getReal() == -6.0);
		assertTrue(result.getImag() == 17.0);
		assertTrue(result.toString().equals("-6.0 + 17.0i"));
		System.out.println(result);
	}
	@Test
	//test method to divide two complex numbers
	public void testDiv(){
		ComplexNumber result = com1.div(com2);
		System.out.println(result);
		assertTrue(result.getReal() ==(float)0.72);
		assertTrue(result.getImag() ==(float) 0.04);
		assertTrue(result.toString().equals("0.72 + 0.04i"));
	}
}



