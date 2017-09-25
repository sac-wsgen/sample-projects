package com.forest.handlers;

import org.junit.Test;

import com.forest.events.OrderEvent;

public class PaymentHandlerTest_onNewOrder_209402914 {

	@Test
	public void test0() {
		PaymentHandler handler = new PaymentHandler();
		OrderEvent arg1 = null;
		handler.onNewOrder(arg1);
	}
	
}
