import org.junit.Test;                                                            
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.lang.Math;
import java.util.*;
public class CompareStringsTest extends CompareStrings{

	protected String s1;
	protected String s2;
	protected String s3;
	protected String s4;

	protected ArrayList<String> array1;
	protected ArrayList<String> array2;
	protected ArrayList<String> array3;
	protected ArrayList<String> array4;

	@Before
	public void setup(){
		s1 = "hello";
		s2 = "hello!";
		s3 = "Hello";
		s4 = "HeLLO";

		array1 = new ArrayList<String>();
			array1.add("hello there");
			array1.add("hello there!");
			array1.add("Hello There");
			array1.add("HeLLO THEre");
		array2 = new ArrayList<String>();
			array2.add("ABCDEFG");
			array2.add("abcdefg");
			array2.add("AbCdEfG");
			array2.add("a b c d e f g");
		array3 = new ArrayList<String>();
			array3.add("apple");
			array3.add("aPPLE");
			array3.add("a p p l e");
			array3.add("apple?");
		array4 = new ArrayList<String>();		
			array4.add("stuff");
			array4.add("STUFF!!");
			array4.add("stuff??");
			array4.add("stuff..");
	}
	/**
	*	Tests the compareTo in class CompareStrings
	**/
		
	@Test
	public void compareToTest(){
		assertTrue(compareTo(s1, s2, 0) == -1);
		assertTrue(compareTo(s1, s3, 0) == 0);
		assertTrue(compareTo(s1, s4, 0) == 0);
		assertTrue(compareTo(s2, s1, 0) == 1);
		assertTrue(compareTo(s2, s2, 0) == 0);
		assertTrue(compareTo(s2, s3, 0) == 1);
		assertTrue(compareTo(s2, s4, 0) == 1);
		assertTrue(compareTo(s3, s1, 0) == 0);
		assertTrue(compareTo(s3, s2, 0) == -1);
		assertTrue(compareTo(s3, s3, 0) == 0);
		assertTrue(compareTo(s3, s4, 0) == 0);
		assertTrue(compareTo(s4, s1, 0) == 0);
		assertTrue(compareTo(s4, s2, 0) == -1);
		assertTrue(compareTo(s4, s3, 0) == 0);
		assertTrue(compareTo(s4, s4, 0) == 0);

	}
	/** 
	* Tests the findMinimum in class CompareStrings
	**/

	@Test
	public void findMinimumTest(){
	assertTrue(findMinimum(array1) == "hello there");
	assertTrue(findMinimum(array2) == "ABCDEFG");
	assertTrue(findMinimum(array3) == "apple");
	assertTrue(findMinimum(array4) == "stuff");


	}
 

}
