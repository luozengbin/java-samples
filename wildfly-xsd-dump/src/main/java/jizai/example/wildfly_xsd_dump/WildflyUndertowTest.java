package jizai.example.wildfly_xsd_dump;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;


import org.eclipse.persistence.jaxb.JAXBContextProperties;

public class WildflyUndertowTest {
	
	public static void main(String[] args) throws Exception {
		
//		UndertowSubsystemType subSystem = JAXB.unmarshal(new File("/home/akira/mywork/devspace/eclipse44/jaxx/src/main/java/jizai/example/jaxx/misc", "wildfly-undertow_1_2.xml"), UndertowSubsystemType.class);
//		System.out.println(subSystem);
//		
//		
//		
//		System.setProperty("jaxp.debug", "true");
//		System.setProperty("jaxb.debug", "true");
//		System.setProperty("javax.xml.bind.context.factory", "org.eclipse.persistence.jaxb.JAXBContextFactory");
//		
//		Map<String, Object> jaxbProperties = new HashMap<String, Object>(2);
//        jaxbProperties.put(JAXBContextProperties.MEDIA_TYPE, "application/json");
//        jaxbProperties.put(JAXBContextProperties.JSON_INCLUDE_ROOT, false);
//        JAXBContext jc = JAXBContext.newInstance(new Class[] {UndertowSubsystemType.class}, jaxbProperties);
//        Marshaller marshaller = jc.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//        marshaller.marshal(subSystem, System.out);
//
  }
}
