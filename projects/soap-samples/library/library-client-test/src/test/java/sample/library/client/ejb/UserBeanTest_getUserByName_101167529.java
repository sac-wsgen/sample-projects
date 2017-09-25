package sample.library.client.ejb;

import static org.junit.Assert.*;

import javax.xml.ws.Endpoint;

import org.junit.Test;

import sample.library.service.LibrarayService2123377200;

public class UserBeanTest_getUserByName_101167529 {

	@Test
	public void test0() {
		Endpoint endpoint = Endpoint.publish("http://localhost:9999/lib?wsdl", new LibrarayService2123377200());
		UserBean cut = new UserBean();
		String string341 = new String();
		String arg1 = string341;
		sample.library.service.User retVal = cut.getUserByName(arg1);
		assertNotNull(retVal);
		endpoint.stop();
	}
		
}
