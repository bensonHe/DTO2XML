package org.dtotxml.test;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.dtotxml.annotation.impl.XMLOutPutByDTO;
import org.junit.Test;

public class Test4ThisGuy {
	@Test
	public void testThisGuy() throws IllegalArgumentException,
			IllegalAccessException, ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException {
		Message message = new Message();
		message.setDataName("http://www.qvodzy.cc");
		message.setTitle("qvod source web");
		message.setName("qvod");
		message.setAdreess("qvodzy.cc");
		message.setDescription("this is a firm web");
		System.out.println(new XMLOutPutByDTO().XMLOutPutByBean(message));
	}
	@Test
	public void testThisGuy4Msg2() throws IllegalArgumentException,
			IllegalAccessException, ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException {
		Message2 message = new Message2();
		message.setName("qvod");
		message.setAdress("qvodzy.cc");
		message.setIp(10000);
		message.setView(50123);
		System.out.println(new XMLOutPutByDTO().XMLOutPutByBean(message));
	}
}
