/**
 * @author danielkim
 * this is the interface doing loadData, displayCatalog, searchforbook, addBook, updatebook, removeBoook, the arrayList for BookbyPublisher, sortBytitle and save
 */
package assg6_Kimj19;

import java.util.ArrayList;

public interface BookCatalogInterphase {

	public void loadData(String filename);

	public void displayCatalog();

	public Book searchForBook(String title);

	public boolean addBook(String ISBN, String title, String author, String publisher, int publishYear);

	public boolean updateBook(String ISBN, String title, String author, String publisher, int publishYear);

	public boolean removeBook(String title);

	public ArrayList<Book> getBooksByPublisher(String publisher);

	public void sortByTitle();

	public void Save();

}
