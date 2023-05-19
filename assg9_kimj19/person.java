package assg9_kimj19;
import java.util.*;
/**
 * This is a constructor class setting up the get method and set method 
 * @author danielkim
 *
 */

public class person extends KeyedItem<String> {
	//setting the private variables
	private String name;
	private String phoneNumber;
	


public person(String name1, String phoneNumber1) {
	super(name1); // calling super on name 
	phoneNumber = phoneNumber1; //setting phoneNumber to phoneNumber1
}
public String getname() {
	return name; //getname returns name
}
public String getphoneNumber() {
	return phoneNumber; //getphoneNumber returns phoenNumber
}
public void setname(String name) {
	this.name = name; // setname is renaming name to this.name
}
	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber; // setphoneNumber is renaming from phoneNumber to this.phonenumber
	}
	public String toString() {
		return super.getKey() + " " +phoneNumber ;
		// a toString returns the name with the phoneNumber
	}
	
}
