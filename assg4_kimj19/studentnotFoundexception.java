/**
 * @author Daniel Kim 
 * This class where made for the program to be able to print out error messages in sys.out.println"Error student not found"
 */
package assg4_kimj19;

@SuppressWarnings("serial")
public class studentnotFoundexception extends Exception {
	// a constructor method using super to print out a message "Error student not found"
public studentnotFoundexception() {
	super("Error: student not found");
}
// Setting a string message as msg and using the super method to make it a variable
public studentnotFoundexception(String msg) {
	super(msg);
}
}
