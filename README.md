DTO2XML
=======

use annotation let a Data Transfer Object(DTO) as a XML


this is first vision

example. 


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


//so you can use DTO2XML like this . let it be a xml format

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

//run test unit .you can get a String format as xml like below

<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<message>
<qvodzy ADRESS="qvodzy.cc" DESCRIPTION="this is a firm web" NAME="qvod">qvod source web</qvodzy>
<newMessage>http://www.qvodzy.cc</newMessage>
</message>

//the Advantage is small and without any another lib,
//in the next vision. I will add SAX to format xml to support big data 

//have  any question please send email for me. qing878@gmail.com
//QQ 277803242 HeJinBin

