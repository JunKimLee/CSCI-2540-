/**
 * @author Daniel Kim
 * The point of the program was to put together student.java and studentnotFoundexception all together
 * to be able to print out the student that you are looking for in a array of 100 students from the txt.file
 * it prints the id lastname fistname gender dateofbirth and major all on this program
 */
package assg4_kimj19;
import java.util.*;
import java.io.*;
public class StudentSearch {

	public static void main(String[] args) {
		String filename = "assg4_roster.txt"; // the name of the file
		Scanner inputStream = null; // Starting the scanner method
		String line; //setting a String variable to line
		
		student[] arr = new student[100]; //setting the array to 100 (Max Studentsize)
		
		try {
			inputStream = new Scanner(new File(filename));
		}
		catch (FileNotFoundException e) {
			System.out.println("Error openning the file " + filename);
			System.exit(1);
		}
		int studentCount = 0;
		while (inputStream.hasNextLine()) {
			line = inputStream.nextLine();// to print a nextLine
			String[] param = line.split("\\s+"); //Looked up this method to make the ToString method print out vertically with space
			//System.out.println(line);
			
			arr[studentCount] = new student(Integer.parseInt(param[0]), param[1], param[2], param[3].charAt(0), param[4], param[5]);
			studentCount++; // each of the param up above indicates the student id(0) lastname(1) firstname(2) gender(3) dateofbirth(4) and major(5) 
		}
		inputStream.close(); //closing the scanner
		//starting new scanner to make the user inputSMI for last and first name
		String answer = "Y";
		do { // a do while loop to make the user if he inputs Y it keeps on going and N it exits out of the terminal
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter last name: ");
		String last = scannerObject.next();
		System.out.println("Enter first name: ");
		String first = scannerObject.next();
		try {
			int search = student.studentSearch(arr,studentCount - 1, last, first);
			System.out.println(arr[search]);
		}
		catch (studentnotFoundexception a) {
			System.out.println(a.getMessage());
			
		}
		System.out.println("Do you want to search for another student(Y/N)");
		 answer = scannerObject.next();
		if(answer.equals("N") || answer.equals("N")) { // If user inputs Yes to keep on going then the program would proceed
			
			
		}
		}
		while (answer.equals("Y") || answer.equals("Y")); // If user inputs No then the program is going to terminate.
		System.exit(0);
	}
	

}
