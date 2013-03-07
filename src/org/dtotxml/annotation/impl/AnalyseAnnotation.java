package org.dtotxml.annotation.impl;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.dtotxml.annotation.AnalyseAnnotationInter;
import org.dtotxml.annotation.dto.XMLFmtDTO;
import org.dtotxml.annotation.tag.XMLFiled;
import org.dtotxml.annotation.util.XMLUtil;

/**
 * @see AnalyseAnnotationInter
 * @author JinbinHe
 * @since 2013-3-7
 * @QQ 277803242
 */
public class AnalyseAnnotation implements AnalyseAnnotationInter{
	public Map<String, XMLFmtDTO> analyObject(Object obj)
			throws IllegalArgumentException, IllegalAccessException {
		Map<String, XMLFmtDTO> allNodesMap = new HashMap<String, XMLFmtDTO>();// for all nodes
		Map<String, String> attrMap = new HashMap<String, String>();// for attribute
		XMLFmtDTO xmlFmtDTO = null;
		Field[] fields = obj.getClass().getFields();// get dto all Fields
		XMLFiled xmlFiled = null;
		for (Field field : fields) {
			xmlFiled = field.getAnnotation(XMLFiled.class);
			if (xmlFiled != null) {
				String key = xmlFiled.fildName();
				String attributeName = xmlFiled.attributeName();
				boolean isAttribute = XMLUtil
						.vaildateAttributeName(attributeName);
				if (XMLUtil.vaildateFeildName(key)
						&& !allNodesMap.containsKey(key)) {
					xmlFmtDTO = new XMLFmtDTO();
					attrMap = new HashMap<String, String>();
					xmlFmtDTO.setAttribute(attrMap);
					allNodesMap.put(key, xmlFmtDTO);
					if (!isAttribute)
						xmlFmtDTO.setName(String.valueOf(field.get(obj)));
				}
				if (isAttribute) {
					String attributeValue = (String) field.get(obj);
					attrMap.put(attributeName, attributeValue);
				}

			}
		}
		return allNodesMap;
	}

}
