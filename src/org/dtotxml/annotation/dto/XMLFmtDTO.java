package org.dtotxml.annotation.dto;

import java.util.List;
import java.util.Map;

public class XMLFmtDTO {
	private String name;
	private Map<String, String> attribute;

	public String getName() {
		return name;
	}

	public Map<String, String> getAttribute() {
		return attribute;
	}

	public void setAttribute(Map<String, String> attribute) {
		this.attribute = attribute;
	}

	public void setName(String name) {
		this.name = name;
	}

}
