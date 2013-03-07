package org.dtotxml.annotation.util;

public class XMLUtil {
	public static boolean vaildateFeildName(String feildName) {
		if ("".equals(feildName))
			return false;
		return true;
	}

	public static boolean vaildateAttributeName(String attributeName) {
		if (attributeName.equals(""))
			return false;
		return true;
	}

	public static boolean vaildateExit(String value) {
		if (value == null)
			return false;
		if (value.equals(""))
			return false;
		return true;
	}
}
