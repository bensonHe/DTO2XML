<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>DTO2XML</title>
</head>

<body>
<p>DTO2XML<br />
  =======</p>
<p>use annotation let a Data Transfer Object(DTO) as a XML<br />
</p>
<p>this is first vision</p>
<p>example. <br />
</p>
<p>import org.dtotxml.annotation.tag.XMLFiled;</p>
<p>/**<br />
  * @author jinbinHe<br />
  * this is a Data Transfer Object(DTO)<br />
  */<br />
  public class Message {<br />
  @XMLFiled(fildName=&quot;newMessage&quot;)<br />
  public String dataName;<br />
  @XMLFiled(fildName=&quot;qvodzy&quot;)<br />
  public String title;<br />
  @XMLFiled(fildName=&quot;qvodzy&quot;,attributeName=&quot;NAME&quot;)<br />
  public String name;<br />
  @XMLFiled(fildName=&quot;qvodzy&quot;,attributeName=&quot;ADRESS&quot;)<br />
  public String adreess;<br />
  @XMLFiled(fildName=&quot;qvodzy&quot;,attributeName=&quot;DESCRIPTION&quot;)<br />
  public String description;<br />
  public String getTitle() {<br />
  return title;<br />
  }</p>
<p> public void setTitle(String title) {<br />
  this.title = title;<br />
  }<br />
  public String getName() {<br />
  return name;<br />
  }</p>
<p> public void setName(String name) {<br />
  this.name = name;<br />
  }</p>
<p> public String getAdreess() {<br />
  return adreess;<br />
  }</p>
<p> public void setAdreess(String adreess) {<br />
  this.adreess = adreess;<br />
  }</p>
<p> public String getDescription() {<br />
  return description;<br />
  }</p>
<p> public void setDescription(String description) {<br />
  this.description = description;<br />
  }<br />
  public String getDataName() {<br />
  return dataName;<br />
  }</p>
<p> public void setDataName(String dataName) {<br />
  this.dataName = dataName;<br />
  }<br />
</p>
<p>}<br />
</p>
<p>//so you can use DTO2XML like this . let it be a xml format</p>
<p> @Test<br />
  public void testThisGuy() throws IllegalArgumentException,<br />
  IllegalAccessException, ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException {<br />
  Message message = new Message();<br />
  message.setDataName(http://www.qvodzy.cc);<br />
  message.setTitle(&quot;qvod source web&quot;);<br />
  message.setName(&quot;qvod&quot;);<br />
  message.setAdreess(&quot;qvodzy.cc&quot;);<br />
  message.setDescription(&quot;this is a firm web&quot;);<br />
  System.out.println(new XMLOutPutByDTO().XMLOutPutByBean(message));<br />
  }</p>
<p>//run test unit .you can get a String format as xml like below</p>
<p>&lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot; standalone=&quot;no&quot;?&gt;<br />
  &lt;message&gt;<br />
  &lt;qvodzy ADRESS=&quot;qvodzy.cc&quot; DESCRIPTION=&quot;this is a firm web&quot; NAME=&quot;qvod&quot;&gt;qvod source web&lt;/qvodzy&gt;<br />
  &lt;newMessage&gt;http://www.qvodzy.cc &lt;/newMessage&gt;<br />
  &lt;/message&gt;</p>
<p>//the Advantage is small and without any another lib,<br />
  //in the next vision. I will add SAX to format xml to support big data </p>
<p>//have  any question please send email for me. qing878@gmail.com<br />
  //QQ 277803242 HeJinBin</p>
<p></p>
</body>
</html>
