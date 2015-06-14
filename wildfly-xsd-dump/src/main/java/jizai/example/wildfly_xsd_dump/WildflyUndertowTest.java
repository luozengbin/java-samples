package jizai.example.wildfly_xsd_dump;

import java.beans.PropertyChangeListener;
import java.io.FileInputStream;

import javax.xml.bind.Unmarshaller;

import org.eclipse.persistence.jaxb.dynamic.DynamicJAXBContext;
import org.eclipse.persistence.jaxb.dynamic.DynamicJAXBContextFactory;

public class WildflyUndertowTest {
	
	public static void main(String[] args) throws Exception {
		
//		UndertowSubsystemType subSystem = JAXB.unmarshal(new File("./xml", "wildfly-undertow_2_0.xml"), UndertowSubsystemType.class);
//		System.out.println(subSystem);
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
		
//		System.setProperty("jaxp.debug", "true");
//		System.setProperty("jaxb.debug", "true");
//		System.setProperty("javax.xml.bind.context.factory", "org.eclipse.persistence.jaxb.JAXBContextFactory");
		
		DynamicJAXBContext jaxbContext = DynamicJAXBContextFactory.createContextFromXSD(new FileInputStream("./src/main/java/customer.xsd"), null, null, null);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		
		
		PropertyChangeEvent l;
  }
}
