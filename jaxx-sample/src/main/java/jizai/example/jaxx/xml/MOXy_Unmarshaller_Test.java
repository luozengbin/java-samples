package jizai.example.jaxx.xml;

import java.io.StringReader;

import javax.xml.bind.JAXB;

import jizai.example.jaxx.model.Hoge;

public class MOXy_Unmarshaller_Test {
	public static void main(String[] args) {
		System.setProperty("jaxp.debug", "true");
		System.setProperty("jaxb.debug", "true");
		System.setProperty("javax.xml.bind.context.factory", "org.eclipse.persistence.jaxb.JAXBContextFactory");

		String xml = "<?xml version=\"1.0\"?>" + "<hoge>" + "  <id>20</id>"
				+ "  <value>hogehoge</value>" + "</hoge>";

		// javax.xml.bind.JAXBユティリティクラスから自動的にSAXの実装を探して
		// XMLパース処理を行う、またバインディングする
		// SAXのデフォルト実装:  com.sun.org.apache.xerces.internal.jaxp.SAXParserFactoryImpl
		// JAXBのデフォルト実装: org.eclipse.persistence.jaxb.JAXBContextFactory
		Hoge hoge = JAXB.unmarshal(new StringReader(xml), Hoge.class);
		System.out.println("id=" + hoge.getId() + ", value=" + hoge.getValue());

	}
}
