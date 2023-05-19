package assg9_kimj19;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
import java.util.*;
/**
 * this is the class where i do the load data, add, search, delete, update
 * @author danielkim
 *
 */
public class phoneBook {
	Scanner kbd = new Scanner (System.in); //using this on update method
	String phoneNumber; // using this on update method 
	BinarySearchTree<person, String> phone = new BinarySearchTree <person,String>();
	TreeIterator<person>iter;
	Scanner inputstream = null;
	public void loadData(String filename) {
		
		try {
			inputstream = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			System.out.println("Error file not found" + filename);
			System.exit(1);
			
			
		}
		/**
		 * using a string array to get the full name and phone number
		 */
		while (inputstream.hasNext()) {
			String temp = inputstream.nextLine();
			String[] arr = temp.split("\t", 2); // split method did 2 because on the string array it hold 2 arrray positions
			String fullName = arr[0]; // gets the fullname 
			String pn = arr[1]; // this is the phone number
		
			
			person insert = new person (fullName, pn);
			phone.insert(insert); // inserting the fullName and pn into phone
		}
		
	}
	
	
	/**
	 * we are trying to add the phone number and name into phone 
	 * @param name
	 * @param phoneNumber
	 * @return
	 */
	public boolean add(String name, String phoneNumber) {
		iter = new TreeIterator <person> (phone);
		iter.setInorder();
		while (iter.hasNext()) { 
			person temp = iter.next();
			if (temp.getKey().equals(name)) { 
				return false;
			}
			
		}
		phone.insert(new person(name, phoneNumber)); //inserting the name and phone number
		return true;
		
	
	}
	/**
	 * finding it on the phone and it returns the name and phoneNumber of the person and number
	 * @param phoneNumber
	 * @return
	 */
	public person search(String phoneNumber) {
		iter = new TreeIterator<person> (phone);
		iter.setInorder();
		while (iter.hasNext()) {
			person temp = iter.next();
			if (temp.getKey().equals(phoneNumber)) {
				return temp;
			}
			
			
		}
		return null;
	}
	/**
	 * it deletes the person name which automatically takes off the person phone number with it 
	 * @param name
	 * @return
	 */
	public boolean delete(String name) {
		iter = new TreeIterator<person> (phone);
		iter.setInorder();
		while (iter.hasNext()) {
			person temp = iter.next();
			if(temp.getKey().equals(name)) {
				//iter.remove();
				phone.delete(name);
			}
			{
				//return false;
			}
			
			
		}
		//phone.delete(name);
		return true;
		
	}
	
	/**
	 * this method is suppose to update existing users and change their phone number to new ones that they have gotten from user
	 * @param name
	 * @param phoneNumber
	 */
	public void update(String name ){
		phone.delete(name); // delete original name so it doesnt print out 2x
		System.out.println("enter new number");
		phoneNumber =kbd.nextLine();
		person b = new person(name, phoneNumber); //putting b into name and the phoneNumber
		phone.insert(b); // inserting the b to the phone.
		
		
					
					
				}
					
			
				
			
			
	
	/**
	 * this method should display the peoples name and the phone number on the terminal
	 */
	public void display() {
		iter = new TreeIterator<person>(phone);
		iter.setInorder();
		 while (iter.hasNext()) {
			 person addPerson = iter.next(); 
			System.out.println(addPerson.getKey() + "\t" + addPerson.getphoneNumber());
		 }
	}
	/**
	 * this method saves everything that the users has updated on the main method.
	 * it updates the person name and phonenumber
	 */
	public void save() {
		String filename = "ass9_phoneBook.txt ";
		PrintWriter outputstream = null;
		try {
			inputstream = new Scanner (new File(filename));
		}catch (FileNotFoundException e) {
			System.out.println("Error file not found" + filename);
			System.exit(0);
		}
		while (iter.hasNext()) {
			person temp = iter.next();
			outputstream.println(temp.getKey()+ " " + temp.getphoneNumber());
			
			
		}
		outputstream.close();
		System.exit(0);
		
	}
	
	
}
