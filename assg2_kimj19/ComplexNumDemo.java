/**
 * @author Daniel Kim
 * On the main method we are testing if our constructor methods are working for addition , subtraction
 * multiplication and negative. Also testing get and set methods, constructor and we use if else for boolean
 */
package assg2_kimj19;

public class ComplexNumDemo {

	public static void main(String[] args) {
		// Testing the constructor 
	ComplexNum c1 = new ComplexNum();
	ComplexNum c2 = new ComplexNum(1,1);
	ComplexNum c3 = new ComplexNum (2,2);
	ComplexNum c4 = new ComplexNum(0,1);
	
	// Testing the get methods
	System.out.println("testing get methods");
	System.out.println("c1's real number" + c1.getReal() );
	System.out.println("c2's imaginary number" + c2.getImaginary());
	//Testing the set methods
	System.out.println("\nTesting set methods");
	c1.setReal(4.1);
	System.out.println("c3's real number" + c3.getReal());
	c1.setImaginary(5.1);
	System.out.println("c4's imaginary number" + c4.getImaginary());
	// Testing addition
	System.out.println("\nTesting addition");
	c1 =c2.add(c4);
	System.out.println("c2 + c4 = " + c1);
	c1 = c3.add(c2);
	System.out.println("c2 + c4 = " + c1); // 2nd test for addition
	// Testing subtraction 
	System.out.println("\nTesting subtraction");
	c1 =c2.sub(c4);
	System.out.println("c2 - c4 = " + c1);
	c1 = c3.sub(c2);
	System.out.println("c2 - c4 = " + c1);
	// Testing multiplication
	System.out.println("\nTesting multiplication");
	c1 =c2.mul(c4);
	System.out.println("c2 * c4 = " + c1);
	c1 = c3.mul(c2);
	System.out.println("c2 * c4 = " + c1);
	// Testing negative number
	System.out.println("\nTesting negative numbers");
	c1 =c2.neg(c4);
	System.out.println("To negate of " + c1); // I put negate hencing for the negative 
	c1 = c3.neg(c2);
	System.out.println("To negate of " + c1);
	//Testing toString
	System.out.println("\nTesting toString");
	System.out.println("c1's information:");
	System.out.println(c1.toString());
	
	
	System.out.println("c2's information:");
	System.out.println(c2.toString());     // automatically call the toString method
	System.out.println();
	// Testing boolean method 
	System.out.println("\nTesting the boolean method");
	if (c1.equals(c2)) 
		System.out.println("c1 and c2 are equal");
	else
		System.out.println("c1 and c2 are not equal");

	if (c2.equals(c3)) 
		System.out.println("c2 and c3 are equal");
	else
		System.out.println("c2 and c3 are not equal");

	if (c3.equals(c4)) 
		System.out.println("c3 and c4 are equal");
	else
		System.out.println("c3 and c4 are not equal");
	System.out.println();
	
		
		

	}
	
}
