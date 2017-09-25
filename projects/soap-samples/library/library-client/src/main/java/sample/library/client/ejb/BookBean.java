package sample.library.client.ejb;

import javax.ejb.Stateless;

import sample.library.service.Book;
import sample.library.service.ILibraray;
import sample.library.service.LibrarayService;

@Stateless
public class BookBean {
	
	public boolean addBook(String isbn) {
		LibrarayService libService = new LibrarayService();
		ILibraray library = libService.getLibrarayPort();
		
		if(!library.hasBook(isbn)) {
			return false;
		}
		
		library.addBook(isbn);
		
		// book must now be available in library!
		if(!library.hasBook(isbn)) {
			throw new BookAddException();
		}
		
		return true;
	}

	public Book getBook(String isbn) {
		LibrarayService libService = new LibrarayService();
		ILibraray library = libService.getLibrarayPort();
		
		return library.getBook(isbn);
	}
	
	public void removeBook(String isbn) {
		LibrarayService libService = new LibrarayService();
		ILibraray library = libService.getLibrarayPort();
		
		if(!library.hasBook(isbn)) {
			throw new BookNotFoundException();
		}
		
		Book book = library.getBook(isbn);
		library.removeBook(book);
		
		// check if book has been removed!
		if(library.hasBook(isbn)) {
			throw new BookRemoveException();
		}
	}
	
	public boolean isBookInLibrary(String isbn) {
		LibrarayService libService = new LibrarayService();
		ILibraray library = libService.getLibrarayPort();
		
		return library.hasBook(isbn);
	}
	
}
