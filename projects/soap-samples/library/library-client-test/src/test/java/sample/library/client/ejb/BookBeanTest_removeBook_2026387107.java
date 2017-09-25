package sample.library.client.ejb;

import static org.junit.Assert.*;

import javax.xml.ws.Endpoint;

import org.junit.Test;

import sample.library.service.LibrarayService4978818030;
import sample.library.service.LibrarayService4978818031;
import sample.library.service.LibrarayService4978818032;

public class BookBeanTest_removeBook_2026387107 {

	@Test
	public void test0() {
		Endpoint endpoint = Endpoint.publish("http://localhost:9999/lib?wsdl", new LibrarayService4978818030());
		BookBean cut = new BookBean();
		String string341 = new String();
		String arg1 = string341;
		cut.removeBook(arg1);
		endpoint.stop();
	}
	
	@Test
	public void test1() {
		Endpoint endpoint = Endpoint.publish("http://localhost:9999/lib?wsdl", new LibrarayService4978818032());
		BookBean cut = new BookBean();
		try {
		String string341 = new String();
		String arg1 = string341;
			cut.removeBook(arg1);
			fail("Expect method to throw exception of type: sample.library.client.ejb.BookNotFoundException");
		} catch(sample.library.client.ejb.BookNotFoundException e) {
			// this is what we expect to happen
		}
		endpoint.stop();
	}
	
	@Test
	public void test2() {
		Endpoint endpoint = Endpoint.publish("http://localhost:9999/lib?wsdl", new LibrarayService4978818031());
		BookBean cut = new BookBean();
		try {
		String string341 = new String();
		String arg1 = string341;
			cut.removeBook(arg1);
			fail("Expect method to throw exception of type: sample.library.client.ejb.BookRemoveException");
		} catch(sample.library.client.ejb.BookRemoveException e) {
			// this is what we expect to happen
		}
		endpoint.stop();
	}
}
