package org.dtotxml.test;

import org.dtotxml.annotation.tag.XMLFiled;

/**
 * @author jinbinHe
 * this is a Data Transfer Object(DTO)
 */
public class Message2 {
	@XMLFiled(fildName="siteName")
	public String name;
	@XMLFiled(fildName="siteAdress")
	public String adress;
	@XMLFiled(fildName="pv")
	public int view;
	@XMLFiled(fildName="ip")
	public int ip;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public int getIp() {
		return ip;
	}
	public void setIp(int ip) {
		this.ip = ip;
	}
}
