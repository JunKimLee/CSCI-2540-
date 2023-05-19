/**
 * @author danielkim
 * Setting up constructor methods for all of the private variables with a toString method and compareTo method (alphabetical order)
 */
package assg6_Kimj19;

public class Book implements Comparable <Book>{  //Private variables
	private String ISBN;
	private String title;
	private String author;
	private String publisher;
	private int publishYear;

	public Book() { // Setting the variables to empty or 0 (because is a  int)
		ISBN = " ";
		title = " ";
		author = " ";
		publisher = " ";
		publishYear = 0;
	}

	public Book(String ISBN, String title, String author, String publisher, int publishYear) {
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publishYear = publishYear;
	}

	public String getISBN() { //get method for ISBN
		return ISBN;
	}

	public String gettitle() { //get method for title
		return title;
	}

	public String getauthor() { // get method for author
		return author;

	}

	public String getpublisher() { // get method for publisher
		return publisher;
	}

	public int getpublishYear() { // get method for publoshYEar
		return publishYear;
	}

	public void setISBN(String ISBN) { // set method for ISBN
		this.ISBN = ISBN;
	}

	public void setauthor(String author) { // set method for author
		this.author = author;

	}
	public void settitle(String title) {
		this.title = title;
	}

	public void setpublisher(String publisher) { // set method for publisher
		this.publisher = publisher;
	}

	public void setpublishYear(int publishYear) { // set method for publishYear
		this.publishYear = publishYear;

	}

	public String toString() { //ToString method to return the ISBN title author publisher and the publishYEar
		return ISBN + "\n" + title + "\n" + author + "\n" + publisher + "\n" + publishYear + "\n";

	}

	@Override /**
	           * @param is the object type of object 
	           * @return the title if they are equal to each other
	           */
	public boolean equals (Object obj) {
		if (obj == null)
		return false;
		
		if (obj instanceof Book)
		{
		Book temp = (Book)obj;
		return (this.title == temp.title);
		}
		else 
			return false;
	}	
		/**
		 * to make it in oder of alphabet decided to get the char (first letter)of the title names to set it up
		 * @param b
		 * @return
		 */
		public int compareTo (Book b) {
			char a = this.title.charAt(0);
			char z = this.title.charAt(0);
			if (a < z)
				return -1;
			if (a > z)
				return 1;
			else 
				return 0;
			
		}
	
	

}
