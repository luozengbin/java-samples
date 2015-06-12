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
public class StAX_Unmarshaller_Test {
	public static void main(String[] args) throws XMLStreamException, JAXBException {
		
		System.setProperty("jaxp.debug", "true");
		System.setProperty("jaxb.debug", "true");
		
		String xml = "<?xml version=\"1.0\"?>" + "<hoge>" + "  <id>20</id>"
				+ "  <value>hogehoge</value>" + "</hoge>";
		
		// XMLのパース処理はStAXのデフォルト実装が利用される
		// com.sun.xml.internal.stream.XMLInputFactoryImpl
		Reader reader = new StringReader(xml);
		XMLInputFactory factory = XMLInputFactory.newInstance(); // Or newFactory()
		XMLStreamReader xmlReader = factory.createXMLStreamReader(reader);
		
		// JAXBの実装はJVMにバンドルされたものを利用する
		// com.sun.xml.internal.bind.v2.ContextFactory
		JAXBContext context = JAXBContext.newInstance(Hoge.class);
		Hoge hoge =  context.createUnmarshaller().unmarshal(xmlReader, Hoge.class).getValue();

		System.out.println("id=" + hoge.getId() + ", value=" + hoge.getValue());
	}
}
