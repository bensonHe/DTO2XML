package org.dtotxml.test;

import org.dtotxml.annotation.tag.XMLFiled;

/**
 * @author jinbinHe
 * this is a Data Transfer Object(DTO)
 */
public class Message {
	@XMLFiled(fildName="newMessage")
	public String dataName;
	@XMLFiled(fildName="qvodzy")
	public String title;
	@XMLFiled(fildName="qvodzy",attributeName="NAME")
	public String name;
	@XMLFiled(fildName="qvodzy",attributeName="ADRESS")
	public String adreess;
	@XMLFiled(fildName="qvodzy",attributeName="DESCRIPTION")
	public String description;
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdreess() {
		return adreess;
	}

	public void setAdreess(String adreess) {
		this.adreess = adreess;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDataName() {
		return dataName;
	}

	public void setDataName(String dataName) {
		this.dataName = dataName;
	}


}
