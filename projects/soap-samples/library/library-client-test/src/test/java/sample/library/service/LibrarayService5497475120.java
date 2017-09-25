package sample.library.service;

import javax.jws.WebService;
@WebService(
	serviceName="LibrarayService",
	portName="LibrarayPort",
	endpointInterface="sample.library.service.ILibraray",
	targetNamespace="http://service.library.sample/")
public class LibrarayService5497475120 implements sample.library.service.ILibraray{

	private int i0=0;

	public boolean usernameExists(java.lang.String arg0) {
		switch(i0++) {
			case 0: {
			return false;}
			default : throw new IllegalStateException();
		}
	}

	public User getUserByUsername(String arg0) {
		throw new UnsupportedOperationException();
	}

	public boolean removeUser(int arg0) {
		throw new UnsupportedOperationException();
	}

	public boolean returnLoan(Book arg0, User arg1) {
		throw new UnsupportedOperationException();
	}

	public Author getAuthorOfBook(String arg0) {
		throw new UnsupportedOperationException();
	}

	public Author getAuthor(Book arg0) {
		throw new UnsupportedOperationException();
	}

	public Book getBook(String arg0) {
		throw new UnsupportedOperationException();
	}

	public void registerUser(String arg0) {
		throw new UnsupportedOperationException();
	}

	public boolean isLoaned(Book arg0) {
		throw new UnsupportedOperationException();
	}

	public void loan(Book arg0, User arg1) {
		throw new UnsupportedOperationException();
	}
	
	public void addBook(String arg0) {
		throw new UnsupportedOperationException();
	}

	public boolean hasBook(String arg0) {
		throw new UnsupportedOperationException();
	}
	
	public void removeBook(Book arg0) {
		throw new UnsupportedOperationException();
	}
	
	public boolean isBookAvailable(Book arg0) {
		throw new UnsupportedOperationException();
	}
	
	public boolean hasUserLoanBook(Book arg0, User arg1) {
		throw new UnsupportedOperationException();
	}
}
