/**
 * @author Daniel Kim
 * Putting the boook in a ArrayList and pretty much putting in codes from the interfaces to make them have a function.
 */
package assg6_Kimj19;

import java.io.File;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BookCatalog implements BookCatalogInterphase {
	Scanner inputstream = null;
	private ArrayList<Book> booklist; // setting it to a arrayList

	public BookCatalog() { // 
		booklist = new ArrayList<Book>();

	}
/**
 * This is the load data to be able to print out the ISBN , Title, Author, Publisher and publishingYear
 */
	@Override
	public void loadData(String filename) {
		try {
			inputstream = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			System.out.println("Error file not found" + filename);
			System.exit(1);
		}

		while (inputstream.hasNext()) {
			String ISBN = inputstream.nextLine();
			String title = inputstream.nextLine();
			String author = inputstream.nextLine();
			String publisher = inputstream.nextLine();
			int publishingYear = Integer.parseInt(inputstream.nextLine());
			Book b1 = new Book(ISBN, title, author, publisher, publishingYear); //stores all of teh values on the paramater to b1
			booklist.add(b1);
			inputstream.nextLine();
		}
	}
/**
 * the displayCatalog prints out booklist get method 
 */
	@Override
	public void displayCatalog() { // array size prints out booklist get method
		for (int i = 0; i < booklist.size(); i++) {
			
			System.out.println(booklist.get(i) );
			
		}

	}
/**
 * // new arrayList we made b1 a temporary varuiable and said that if the title are equal it returns b1.
 */
	@Override
	public Book searchForBook(String title) { 
		for (int i = 0; i < booklist.size(); i++) {
			Book b1 = booklist.get(i);

			if (booklist.get(i).gettitle().equals(title)) {
				return b1;
			}

		}
		return null;
	}

	@Override // If the arraylist title equals to the b1. get title it makes it not print anything but if they arent it adds to bookList
	public boolean addBook(String ISBN, String title, String author, String publisher, int publishYear) {
		Book b1 = new Book(ISBN, title, author, publisher, publishYear);

		for (int i = 0; i < booklist.size(); i++) {
			if (booklist.get(i).gettitle().equals(b1.gettitle())) {
				return false;
			}
		}
		booklist.add(b1);
		return true;
	}
/**
 * This is to update the book i made the author, publisher, ISBN, publishYear 
 *  
 * 
 * 
 */
	@Override
	public boolean updateBook(String ISBN, String title, String author, String publisher, int publishYear) {
		Book b1 = new Book(ISBN, title, author, publisher, publishYear);

		for (int i = 0; i < booklist.size(); i++) {

			if (booklist.get(i).gettitle().equals(b1.gettitle())) {
				if (author != null) {
					booklist.get(i).setauthor(author);
					
				}
				if (ISBN != null) {
					booklist.get(i).setISBN(ISBN);
				}
				if (publisher != null) {
					booklist.get(i).setpublisher(publisher);
				}
				if (publishYear != 0) {
					booklist.get(i).setpublishYear(publishYear);
				}
			

				return true;
			}

		}
		System.out.println("Book doesnt exist");
		return false;
	}
/**
 * it removes the book 
 */
	@Override
	public boolean removeBook(String title) {
		for (int i = 0; i < booklist.size(); i++) {
			
			if (booklist.get(i).gettitle().equals(title)) {
				booklist.remove(i);
				} else 
				{
				
				return false;
				
				}
		}
			return false;
		}
	

				
/**
 * It 
should return an ArrayList object with all the books by the given publisher.
 */
	@Override
	public ArrayList<Book> getBooksByPublisher(String publisher) {
		ArrayList<Book>getBooksByPublisher = new ArrayList<Book>();
		for (int i = 0; i < booklist.size(); i++) {
			Book b1 = booklist.get(i);
			if(publisher.equals(b1.getpublisher())) {
				getBooksByPublisher.add(b1);
			}
		}
			
		return getBooksByPublisher;
	}
/*8
 * the collections.sort method sorts out all of the books based on the title
 */
	@Override
	public void sortByTitle() {
		Collections.sort(booklist);
	}
/**
 * THe save method is to save. It should write the book catalog back to the 
file if the data has been changed 
 */
	@Override
	public void Save() {
		  String fileName = "assg6_catalog.txt";
		  PrintWriter outputStream = null;
		  try {
			  outputStream = new PrintWriter(fileName);
		  }
		  catch(IOException e){
			  System.out.println("Error opening the file " + 
                      fileName);
			  System.exit(0);
		  }
		  for (int i = 0; i < booklist.size(); i++) {
			  
			  outputStream.println(booklist.get(i));
			  
		  }
		  outputStream.close();
		
		
	}

}
