package sample.library.client.ejb;

import static org.junit.Assert.*;

import javax.xml.ws.Endpoint;

import org.junit.Test;

import sample.library.service.LibrarayService17179986510;
import sample.library.service.LibrarayService17179986511;

public class UserBeanTest_registerUser_2047645208 {

	@Test
	public void test0() {
		Endpoint endpoint = Endpoint.publish("http://localhost:9999/lib?wsdl", new LibrarayService17179986511());
		UserBean cut = new UserBean();
		String string341 = new String();
		String arg1 = string341;
		boolean retVal = cut.registerUser(arg1);
		assertEquals(true, retVal);
		endpoint.stop();
	}
	
	@Test
	public void test1() {
		Endpoint endpoint = Endpoint.publish("http://localhost:9999/lib?wsdl", new LibrarayService17179986510());
		UserBean cut = new UserBean();
		try {
		String string341 = new String();
		String arg1 = string341;
			cut.registerUser(arg1);
			fail("Expect method to throw exception of type: sample.library.client.ejb.UserRegisterException");
		} catch(sample.library.client.ejb.UserRegisterException e) {
			// this is what we expect to happen
		}
		endpoint.stop();
	}
}
