package sample.library.client.ejb;

import static org.junit.Assert.*;

import javax.xml.ws.Endpoint;

import org.junit.Test;

import sample.library.service.LibrarayService6829878080;

public class BookBeanTest_getBook_900919490 {

	@Test
	public void test0() {
		Endpoint endpoint = Endpoint.publish("http://localhost:9999/lib?wsdl", new LibrarayService6829878080());
		BookBean cut = new BookBean();
		String string341 = new String();
		String arg1 = string341;
		sample.library.service.Book retVal = cut.getBook(arg1);
		assertNotNull(retVal);
		endpoint.stop();
	}

}