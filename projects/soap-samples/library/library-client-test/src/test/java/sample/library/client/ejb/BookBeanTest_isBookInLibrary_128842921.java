package sample.library.client.ejb;

import static org.junit.Assert.*;

import javax.xml.ws.Endpoint;

import org.junit.Test;

import sample.library.service.LibrarayService6873518650;

public class BookBeanTest_isBookInLibrary_128842921 {

	@Test
	public void test0() {
		Endpoint endpoint = Endpoint.publish("http://localhost:9999/lib?wsdl", new LibrarayService6873518650());
		BookBean cut = new BookBean();
		String string341 = new String();
		String arg1 = string341;
		boolean retVal = cut.isBookInLibrary(arg1);
		assertEquals(false, retVal);
		endpoint.stop();
	}
	
}
