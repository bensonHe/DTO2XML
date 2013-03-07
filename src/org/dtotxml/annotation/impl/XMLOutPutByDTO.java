package org.dtotxml.annotation.impl;

import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.dtotxml.annotation.AnalyseAnnotationInter;
import org.dtotxml.annotation.dto.XMLFmtDTO;
import org.dtotxml.annotation.util.XMLUtil;
import org.dtotxml.test.Message;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * create a customer annotation.
 * try to change this implement. example can use the sax for bigdata
 * @author JinbinHe
 * @QQ 277803242
 */
public class XMLOutPutByDTO {
	AnalyseAnnotationInter ano = new AnalyseAnnotation();

	public String XMLOutPutByBean(Object dto) throws IllegalArgumentException,
			IllegalAccessException, ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException {
		Map<String, XMLFmtDTO> dataMp = ano.analyObject(dto);
		XMLFmtDTO xmlFmtDTO = null;
		Map<String, String> attributeMap=null;
		Document document = DocumentBuilderFactory.newInstance()
				.newDocumentBuilder().newDocument();
		Element root = document.createElement("message");
		Iterator<String> nodeNameIterator = dataMp.keySet().iterator();
		Element element = null;
		while (nodeNameIterator.hasNext()) {
			String nodeName = nodeNameIterator.next();
			xmlFmtDTO=dataMp.get(nodeName);
			String nodeValue=xmlFmtDTO.getName();
			element = document.createElement(nodeName);
			if(XMLUtil.vaildateExit(nodeValue))
			element.setTextContent(nodeValue);
			attributeMap=xmlFmtDTO.getAttribute();
			Iterator<String> attributeIterator = attributeMap.keySet().iterator();
			while(attributeIterator.hasNext()){
				String attriName =attributeIterator.next();
				element.setAttribute(attriName, attributeMap.get(attriName));
			}
			root.appendChild(element);
		}
		document.appendChild(root);
		DOMSource domSource=new DOMSource(document);
		Transformer transformer=TransformerFactory.newInstance().newTransformer();
		StringWriter xmlContent=new StringWriter();
		transformer.transform(domSource, new StreamResult(xmlContent));
		return xmlContent.toString();
	}
	
}
