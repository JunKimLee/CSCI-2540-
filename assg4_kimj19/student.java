/**
 * @author Daniel Kim
 * Constructor classes for id lastname firstname gender dateofbirth and major also did the
 * get methods in here as well as a array
 */
package assg4_kimj19;
// default constructor
	public class student {
		private int id;
		private String lastName;
		private String firstName;
		private char gender;
		private String dateofbirth;
		private String major;
		// constructor setting all of the according variable to new(variables)
public student(int newId, String newlastName, String newfirstName,char newGender, String newdateofBirth, String newMajor ) {
	id = newId;
	lastName = newlastName;
	firstName = newfirstName;
	gender = newGender;
	dateofbirth = newdateofBirth;
	major = newMajor;
}
/**
 * getting the id and 
 * @return id
 */
		public int getId(){
			return id;
		}
		/**
		 * getting the lastName
		 * @return lastName
		 */
	   public String getlastName() {
	    	return lastName; 
	    }
	   /**
	    * gettting firstName  
	    * @return firstName
	    */
	   public String getfirstName() {
		   return firstName;
	   }
	   /**
	    * getting gender 
	    * @return gender
	    */
	   public char getgender() {
		   return gender;
	   }
	   /**
	    * getting dateofbirth
	    * @return dateofbirth
	    */
	   public String getdateofbirth() {
		   return dateofbirth;
	   }
	   /**
	    * getting a major
	    * @return major
	    */
	   public String getmajor() {
		   return major;
	   }
	   /**
	    * Print method to print in order of id lastname firstname gender dateofbirth and major
	    */
	   public String toString() {
		   return id + "  " + lastName +"  "+ firstName +"  " + gender+"  " + dateofbirth+ "  " + major + "   ";
	   }
	   /**
	    * in array putting a int i and setting it to less than or equal to the studentsize
	    * @param studentArr
	    * @param studentsize
	    * @param lastName 
	    * @param firstName
	    * @return if last name or first name is equals the programs gets the last and first name of the get methods
	    * @throws studentnotFoundexception to print out the messages of super methods on studentnotFoundException.
	    */
	   public static int studentSearch(student[]studentArr, int studentsize,String lastName,String firstName)throws studentnotFoundexception {
		    for(int i =0; i <= studentsize; i++) 
		    {
		    	student x = studentArr[i];
		    	if(lastName.equals(x.getlastName()))
		    	{
		    		if(firstName.equals(x.getfirstName()))
		    		{
		    			return i;
		    		}
		    	}
		    			
		    }
		    throw new studentnotFoundexception();
		    
	   }
}
// do the throw new, 

