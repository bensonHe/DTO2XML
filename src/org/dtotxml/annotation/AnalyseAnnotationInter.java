package org.dtotxml.annotation;

import java.util.Map;

import org.dtotxml.annotation.dto.XMLFmtDTO;

/*
 * this is convert the annotation object as a  Map<String, XMLFmtDTO>
 */
public interface AnalyseAnnotationInter {
	 Map<String, XMLFmtDTO> analyObject(Object obj) throws IllegalArgumentException, IllegalAccessException ;
}
