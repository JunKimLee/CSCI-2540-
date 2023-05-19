/**
 * @author Daniel Kim
 * We are getting familiar with JUnit testing. We are pulling information from assg 2 and is similar to the Demo class but we are doing JUnit testing for it.
 * 
 */
package assg5_kimj19;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestComplexNum {
ComplexNum c1,c2, c3, c4, c5;
	@Before // testing the default constructor methods
	public void setUp() throws Exception {
		c1 = new ComplexNum(1,0);
		c2 = new ComplexNum(1,1);
		c3 = new ComplexNum (2,2);
		c4 = new ComplexNum (0,1);
		c5 = new ComplexNum (1,0); 
		
		
	}
	@Test // TEsting the get methods
	public void testGetComplexNum() {
		assertEquals("c1 real number ", 1.0,c1.getReal(), 0.0);
		assertEquals("c1 imaginary number",0.0, c1.getImaginary(), 0.0);
		assertEquals("c2 real number", 1.0, c2.getReal(),0.0 );
		assertEquals("c2 imaginary number", 1.0, c2.getImaginary(), 00  );
		
	}
	@Test // Testing the set methods
	public void testSet() {
		c1.setReal(10);
		c1.setImaginary(20);
		
		assertEquals("c1 new real is ", 10,c1.getReal(),0.0 );
		assertEquals("c1 new imaginary is",20, c1.getImaginary(),0.0 );
	}
	@Test // Testing the toString to be able to print out c1, and c2 information fully as in real and imaginary number
	public void testToString() {
		assertEquals("C1's information is ", "1.0", c1.toString() );
		assertEquals ("C2's information is ", "1.0+1.0i", c2.toString() );
	}
	@Test
	public void testBoolean() { //Testing the boolean method 
		assertEquals(" if c1 equals to c5", true, c1.equals(c5));
		assertEquals ("if c1 equals to c2", false, c1.equals(c2));
	}
	@Test
	public void testAddition() { // Testing addition.
		ComplexNum c2 = c1.add(c3);
		assertEquals("The answer is ", c2, c1.add(c3)); 
		ComplexNum c1 = c2.add(c4);
		assertEquals("The answer is", c1, c2.add(c4));		
	}
	@Test
	public void testSubtraction() { // Testing subtraction 
		ComplexNum c2 = c1.sub(c3);
		assertEquals("The answer is", c2, c1.sub(c3));
		ComplexNum c1= c2.sub(c4);
		assertEquals("The answer is", c1, c2.sub(c4));
	}
	@Test
	public void testMultiplication() { // TEsting multiplication
		ComplexNum c2= c1.mul(c3);
		assertEquals("The answer is", c2, c1.mul(c3));
		ComplexNum c1= c2.mul(c4);
		assertEquals("The answer is", c1, c2.mul(c4));
	}
	@Test
	public void testNegative() { // Testing negative numbers
		ComplexNum c2= c1.neg(c3);
		assertEquals("The answer is", c2, c1.neg(c3));
		ComplexNum c1 = c2.neg(c4);
		assertEquals("The answer is", c1, c2.neg(c4));
	}

}
