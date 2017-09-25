package sample.library.client.ejb;

import static org.junit.Assert.*;

import javax.xml.ws.Endpoint;

import org.junit.Test;

import sample.library.service.LibrarayService5497475120;
import sample.library.service.LibrarayService5497475121;
import sample.library.service.LibrarayService5497475122;
import sample.library.service.LibrarayService5497475123;

public class UserBeanTest_deleteUser_1718544375 {


	@Test
	public void test0() {
		Endpoint endpoint = Endpoint.publish("http://localhost:9999/lib?wsdl", new LibrarayService5497475122());
		UserBean cut = new UserBean();
		try {
		String string341 = new String();
		String arg1 = string341;
			cut.deleteUser(arg1);
			fail("Expect method to throw exception of type: sample.library.client.ejb.UserDeleteException");
		} catch(sample.library.client.ejb.UserDeleteException e) {
			// this is what we expect to happen
		}
		endpoint.stop();
	}
	
	@Test
	public void test1() {
		Endpoint endpoint = Endpoint.publish("http://localhost:9999/lib?wsdl", new LibrarayService5497475123());
		UserBean cut = new UserBean();
		try {
		String string341 = new String();
		String arg1 = string341;
			cut.deleteUser(arg1);
			fail("Expect method to throw exception of type: sample.library.client.ejb.UserDeleteException");
		} catch(sample.library.client.ejb.UserDeleteException e) {
			// this is what we expect to happen
		}
		endpoint.stop();
	}
	
	@Test
	public void test2() {
		Endpoint endpoint = Endpoint.publish("http://localhost:9999/lib?wsdl", new LibrarayService5497475120());
		UserBean cut = new UserBean();
		String string341 = new String();
		String arg1 = string341;
		boolean retVal = cut.deleteUser(arg1);
		assertEquals(false, retVal);
		endpoint.stop();
	}
	
	@Test
	public void test3() {
		Endpoint endpoint = Endpoint.publish("http://localhost:9999/lib?wsdl", new LibrarayService5497475121());
		UserBean cut = new UserBean();
		String string341 = new String();
		String arg1 = string341;
		boolean retVal = cut.deleteUser(arg1);
		assertEquals(true, retVal);
		endpoint.stop();
	}
}
