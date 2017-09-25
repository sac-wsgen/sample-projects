package sample.library.client.ejb;

import static org.junit.Assert.*;

import javax.xml.ws.Endpoint;

import org.junit.Test;

import sample.library.service.LibrarayService5665343010;
import sample.library.service.LibrarayService5665343011;
import sample.library.service.LibrarayService5665343012;

public class LoanBeanTest_returnBook_103661007 {

	@Test
	public void test0() {
		Endpoint endpoint = Endpoint.publish("http://localhost:9999/lib?wsdl", new LibrarayService5665343011());
		LoanBean cut = new LoanBean();
		try {
		String string341 = new String();
		String arg1 = string341;
		String string349 = new String();
		String arg2 = string349;
			cut.returnBook(arg1, arg2);
			fail("Expect method to throw exception of type: sample.library.client.ejb.LoanNotFoundException");
		} catch(sample.library.client.ejb.LoanNotFoundException e) {
			// this is what we expect to happen
		}
		endpoint.stop();
	}
	
	@Test
	public void test1() {
		Endpoint endpoint = Endpoint.publish("http://localhost:9999/lib?wsdl", new LibrarayService5665343010());
		LoanBean cut = new LoanBean();
		String string341 = new String();
		String arg1 = string341;
		String string349 = new String();
		String arg2 = string349;
		cut.returnBook(arg1, arg2);
		endpoint.stop();
	}
	
	@Test
	public void test2() {
		Endpoint endpoint = Endpoint.publish("http://localhost:9999/lib?wsdl", new LibrarayService5665343012());
		LoanBean cut = new LoanBean();
		try {
		String string341 = new String();
		String arg1 = string341;
		String string349 = new String();
		String arg2 = string349;
			cut.returnBook(arg1, arg2);
			fail("Expect method to throw exception of type: sample.library.client.ejb.BookNotFoundException");
		} catch(sample.library.client.ejb.BookNotFoundException e) {
			// this is what we expect to happen
		}
		endpoint.stop();
	}
}
