package sample.library.client.ejb;

import static org.junit.Assert.*;

import javax.xml.ws.Endpoint;

import org.junit.Test;

import sample.library.service.LibrarayService18864200640;
import sample.library.service.LibrarayService18864200641;
import sample.library.service.LibrarayService18864200642;

public class BookBeanTest_addBook_1119413978 {

	@Test
	public void test0() {
		Endpoint endpoint = Endpoint.publish("http://localhost:9999/lib?wsdl", new LibrarayService18864200640());
		BookBean cut = new BookBean();
		String string341 = new String();
		String arg1 = string341;
		boolean retVal = cut.addBook(arg1);
		assertEquals(true, retVal);
		endpoint.stop();
	}
	
	@Test
	public void test1() {
		Endpoint endpoint = Endpoint.publish("http://localhost:9999/lib?wsdl", new LibrarayService18864200641());
		BookBean cut = new BookBean();
		try {
		String string341 = new String();
		String arg1 = string341;
			cut.addBook(arg1);
			fail("Expect method to throw exception of type: sample.library.client.ejb.BookAddException");
		} catch(sample.library.client.ejb.BookAddException e) {
			// this is what we expect to happen
		}
		endpoint.stop();
	}
	
	@Test
	public void test2() {
		Endpoint endpoint = Endpoint.publish("http://localhost:9999/lib?wsdl", new LibrarayService18864200642());
		BookBean cut = new BookBean();
		String string341 = new String();
		String arg1 = string341;
		boolean retVal = cut.addBook(arg1);
		assertEquals(false, retVal);
		endpoint.stop();
	}
}
