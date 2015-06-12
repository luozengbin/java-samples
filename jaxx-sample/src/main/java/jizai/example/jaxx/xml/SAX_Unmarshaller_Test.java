package jizai.example.jaxx.xml;

import java.io.Reader;
import java.io.StringReader;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import jizai.example.jaxx.model.Hoge;

/**
 * Hello world!
 *
 */
public class SAX_Unmarshaller_Test {
	public static void main(String[] args) throws XMLStreamException, JAXBException {
		
		System.setProperty("jaxp.debug", "true");
		System.setProperty("jaxb.debug", "true");
		
		String xml = "<?xml version=\"1.0\"?>" + "<hoge>" + "  <id>20</id>"
				+ "  <value>hogehoge</value>" + "</hoge>";
		
		// javax.xml.bind.JAXBユティリティクラスから自動的にSAXの実装を探して
		// XMLパース処理を行う、またバインディングする
		// SAXのデフォルト実装: com.sun.org.apache.xerces.internal.jaxp.SAXParserFactoryImpl
		// JAXBのデフォルト実装:com.sun.xml.internal.bind.v2.ContextFactory
		Hoge hoge = JAXB.unmarshal(new StringReader(xml), Hoge.class);
	    System.out.println("id=" + hoge.getId() + ", value=" + hoge.getValue());
	}
}
