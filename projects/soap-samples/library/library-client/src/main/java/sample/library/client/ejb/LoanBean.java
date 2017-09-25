package sample.library.client.ejb;

import javax.ejb.Stateless;

import sample.library.service.Book;
import sample.library.service.ILibraray;
import sample.library.service.LibrarayService;
import sample.library.service.User;

@Stateless
public class LoanBean {

	public boolean loanBook(String isbn, String username) {
		LibrarayService libService = new LibrarayService();
		ILibraray library = libService.getLibrarayPort();
		
		if(!library.hasBook(isbn)) {
			throw new BookNotFoundException();
		}
		
		Book book = library.getBook(isbn);
		
		if(library.isBookAvailable(book)) {
			User user = library.getUserByUsername(username);
			library.loan(book, user);
			return true;
		}
		
		return false;
	}

	public void returnBook(String isbn, String username) {
		LibrarayService libService = new LibrarayService();
		ILibraray library = libService.getLibrarayPort();
		
		if(!library.hasBook(isbn)) {
			throw new BookNotFoundException();
		}
		
		Book book = library.getBook(isbn);
		User user = library.getUserByUsername(username);
		
		if(!library.hasUserLoanBook(book, user)) {
			throw new LoanNotFoundException();
		}
		
		library.returnLoan(book, user);
	}
}
