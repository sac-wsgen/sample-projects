package sample.library.service;

import javax.jws.WebService;
@WebService(
	serviceName="LibrarayService",
	portName="LibrarayPort",
	endpointInterface="sample.library.service.ILibraray",
	targetNamespace="http://service.library.sample/")
public class LibrarayService13821026490 implements sample.library.service.ILibraray{

	private int i0=0;
	private int i1=0;
	private int i2=0;

	public boolean isBookAvailable(sample.library.service.Book arg0) {
		switch(i0++) {
			case 0: {
			return false;}
			default : throw new IllegalStateException();
		}
	}
	public boolean hasBook(java.lang.String arg0) {
		switch(i1++) {
			case 0: {
			return true;}
			default : throw new IllegalStateException();
		}
	}
	public sample.library.service.Book getBook(java.lang.String arg0) {
		switch(i2++) {
			case 0: {
		Book book342 = new Book();
		return book342;}
			default : throw new IllegalStateException();
		}
	}
	
	public boolean isLoaned(Book arg0) {
		throw new UnsupportedOperationException();
	}
	
	public User getUserByUsername(String arg0) {
		throw new UnsupportedOperationException();
	}
	
	public boolean usernameExists(String arg0) {
		throw new UnsupportedOperationException();
	}
	
	public boolean hasUserLoanBook(Book arg0, User arg1) {
		throw new UnsupportedOperationException();
	}
	
	public Author getAuthor(Book arg0) {
		throw new UnsupportedOperationException();
	}
	
	public void removeBook(Book arg0) {
		throw new UnsupportedOperationException();
	}
	
	public Author getAuthorOfBook(String arg0) {
		throw new UnsupportedOperationException();
	}
	
	public void registerUser(String arg0) {
		throw new UnsupportedOperationException();
	}
	
	public boolean removeUser(int arg0) {
		throw new UnsupportedOperationException();
	}
	
	public void loan(Book arg0, User arg1) {
		throw new UnsupportedOperationException();
	}
	
	public void addBook(String arg0) {
		throw new UnsupportedOperationException();
	}
	
	public boolean returnLoan(Book arg0, User arg1) {
		throw new UnsupportedOperationException();	
	}
	
}
