package sample.library.service;

public class LibraryServiceDummy implements sample.library.service.ILibraray{

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

	public Book getBook(String arg0) {
		throw new UnsupportedOperationException();
	}

	public Author getAuthor(Book arg0) {
		throw new UnsupportedOperationException();
	}

	public boolean isBookAvailable(Book arg0) {
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

	public boolean hasBook(String arg0) {
		throw new UnsupportedOperationException();
	}

	public boolean returnLoan(Book arg0, User arg1) {
		throw new UnsupportedOperationException();
	}

}
