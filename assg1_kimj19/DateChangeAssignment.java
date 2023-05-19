/**
 * 
 * This programs asks user to input date in American form and it would print out the date in 
 * European format
 * @author Daniel Kim
 */
package assg1_kimj19;

import java.io.PrintStream;
import java.util.Scanner; 

public class DateChangeAssignment {

	private static final String Str = null;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
      	System.out.println("Enter a date in the form of month/day/year.");
      	String date = scan.nextLine();
		System.out.println("Your date in European form is:");
		// We are using substrings to use to print it out European date form
		System.out.println(date.substring(date.indexOf("/")+1,date.lastIndexOf("/"))+"."+
				date.substring(0,date.indexOf("/"))+"."+ date.substring(date.lastIndexOf("/")+1));
		
		
		scan.close();
		
		
	}

}
