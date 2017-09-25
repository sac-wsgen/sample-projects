package sample.library.client.ejb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import javax.xml.ws.Endpoint;

import org.junit.Test;

import sample.library.service.LibrarayService13821026490;
import sample.library.service.LibrarayService13821026491;
import sample.library.service.LibrarayService13821026492;

public class LoanBeanTest_loanBook_21217732 {

	@Test
	public void test0() {
		Endpoint endpoint = Endpoint.publish("http://localhost:9999/lib?wsdl", new LibrarayService13821026490());
		LoanBean cut = new LoanBean();
		String string341 = new String();
		String arg1 = string341;
		String string349 = new String();
		String arg2 = string349;
		//Could not generate value for argument arg2. Value was: null
		boolean retVal = cut.loanBook(arg1, arg2);
		assertEquals(false, retVal);
		endpoint.stop();
	}
	
	@Test
	public void test1() {
		Endpoint endpoint = Endpoint.publish("http://localhost:9999/lib?wsdl", new LibrarayService13821026492());
		LoanBean cut = new LoanBean();
		try {
		String string341 = new String();
		String arg1 = string341;
		String string349 = new String();
		String arg2 = string349;
			cut.loanBook(arg1, arg2);
			fail("Expect method to throw exception of type: sample.library.client.ejb.BookNotFoundException");
		} catch(sample.library.client.ejb.BookNotFoundException e) {
			// this is what we expect to happen
		}
		endpoint.stop();
	}
	
	@Test
	public void test2() {
		Endpoint endpoint = Endpoint.publish("http://localhost:9999/lib?wsdl", new LibrarayService13821026491());
		LoanBean cut = new LoanBean();
		String string341 = new String();
		String arg1 = string341;
		String string349 = new String();
		String arg2 = string349;
		boolean retVal = cut.loanBook(arg1, arg2);
		assertEquals(true, retVal);
		endpoint.stop();
	}
}
