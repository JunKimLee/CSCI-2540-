/**
 * @author danielkimA
 * This is the demo classes testing out pretty much all of the functions for bookCatalog. Each one of the cases number corresponds to the case numbers
 * to test out its different function
 */
package assg6_Kimj19;

import java.util.*;
import java.io.*;

public class LibraryApplication extends BookCatalog {

	public static void main(String[] args) {
	/**
	 * to read and update from the assg 6 catalog text
	 */
		String filename = "assg6_catalog.txt";
		BookCatalog b1 = new BookCatalog();
		int userInput = 0;
		String userAnswer = " ";
		int userMenu = 0;
		b1.loadData(filename);
		
		Scanner kbd = new Scanner(System.in);
		String userISBN = null; // user entering the ISBN number
		String userTitle = null; // user entering the Title
		String userAuthor = null; // user entering the author name
		String userPublisher = null; // user entering the publisher name
		int userPublishYear = 0; // user PublishYear number
		do { // This is printing out the methods
			System.out.println("Choose an option below \n");
			System.out.println("1. Display all the books in the catalog");
			System.out.println("2. Search for a book  ");
			System.out.println("3. Add a new book ");
			System.out.println("4. Update an existing book ");
			System.out.println("5. Remove a book ");
			System.out.println("6. Display books by a publisher ");
			System.out.println("7. Sort all the books based on title");
			System.out.println("8. Save data ");
			System.out.println("9. Exit");
			
			
			userInput = kbd.nextInt();
			kbd.nextLine();
			switch (userInput) {
			case 1: // Displaying the catalogs
				b1.displayCatalog();
			break;
			case 2: // Searching for a book
				System.out.println("Enter the title of a Book");
				userAnswer = kbd.nextLine();
				if (b1.searchForBook(userAnswer) == null)
					System.out.println("Book not found");
				else {
					System.out.println(b1.searchForBook(userAnswer));
				}
				break;
			case 3: // Adding a new book
				System.out.println("Enter book ISBN");
				userISBN = kbd.nextLine();
				System.out.println("Enter book title");
				userTitle = kbd.nextLine();
				System.out.println("Enter Book author");
				userAuthor = kbd.nextLine();
				System.out.println("Enter book publisher");
				userPublisher = kbd.nextLine();
				System.out.println("Enter user publishYear");
				userPublishYear =kbd.nextInt();
				kbd.nextLine();
				b1.addBook(userISBN, userTitle, userAuthor, userPublisher, userPublishYear);
				break;
			case 4: // This is the sub - menu to update a existing book
			
		
				System.out.println("Enter book title");
				userTitle = kbd.nextLine();
				do {
					
					System.out.println("Which part of  book do you want to update, press 9 to return to home menu:"+ "1.) ISBN  "+ "2.) Author  "+ "3.) Publisher " + "4.) Publish Year)");
					
					userMenu =kbd.nextInt();
					kbd.nextLine();
				
				switch(userMenu) {
				case 1: // to update the new ISBN from the user
					System.out.println("Enter new ISBN");
					userISBN = kbd.nextLine();
					
					break;
				case 2: // TO update the new Author from the user
					System.out.println("Enter new Author");
					userAuthor = kbd.nextLine();
					break;
				case 3: // To update the new Publisher from the user
					System.out.println("Enter new Publisher");
					userPublisher = kbd.nextLine();
					break;
				case 4: // TO update the new Publish Year from the user
					System.out.println("Enter a new Publish Year");
					userPublishYear= kbd.nextInt();
					break;
				case 9:
					break;
								
				}
				
					
				}while (userMenu != 9);
			b1.updateBook(userISBN, userTitle, userAuthor, userPublisher, userPublishYear);
			// add book is to update b1 <Book> and storing the values.
				break;
				/**
				 * this is the case to remove a book
				 */
			case 5:
				System.out.println("enter a book title");
				userAnswer = kbd.nextLine();
				b1.removeBook(userAnswer);
				break;
				/**
				 * This is the case to display books by the publisher
				 */
			case 6:
				System.out.println("Enter a publisher");
				userPublisher = kbd.nextLine();
				ArrayList <Book> temp = b1.getBooksByPublisher(userPublisher);
				for (int i = 0; i < temp.size(); i++) {
					Book tempBook = temp.get(i);
					System.out.println(tempBook);
				}
				
				break;
				/**
				 * Sort all of the books based on titles
				 */
			case 7:
				System.out.println("");
				b1.sortByTitle();
				break;
				/**
				 * this is to save data
				 */
			case 8: 
				System.out.println("You saved the file");
				b1.Save();
				break;
				/**
				 * this is to exit the program
				 */
			case 9:
				b1.Save();
				kbd.close();
				break;
				
				
				
				
			}
				
			
		}
		while(userInput != 9);
	}
	
		
}
				
				
				
			
			
		
		
		
	

