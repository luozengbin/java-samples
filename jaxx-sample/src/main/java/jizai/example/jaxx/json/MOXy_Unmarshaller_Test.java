package jizai.example.jaxx.json;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import javax.json.Json;
import javax.json.JsonReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;

import jizai.example.jaxx.model.Hoge;

import org.eclipse.persistence.jaxb.JAXBContextProperties;
import org.eclipse.persistence.oxm.json.JsonStructureSource;

/**
 * JSON文字列からPOJOへ変換する処理.
 * JSONのパース処理はJSON Processing (JSR-353)の実装であるMOXyを利用する.
 * JAXBバインディング処理もMOXyを利用する.
 * 
 * @author akira
 *
 */
public class MOXy_Unmarshaller_Test {
	
	public static void main(String[] args) throws JAXBException {
		System.setProperty("jaxp.debug", "true");
		System.setProperty("jaxb.debug", "true");
		System.setProperty("javax.xml.bind.context.factory", "org.eclipse.persistence.jaxb.JAXBContextFactory");
		
		Map<String, Object> jaxbProperties = new HashMap<String, Object>(2);
        jaxbProperties.put(JAXBContextProperties.MEDIA_TYPE, "application/json");
        jaxbProperties.put(JAXBContextProperties.JSON_INCLUDE_ROOT, false);
        JAXBContext jc = JAXBContext.newInstance(new Class[] {Hoge.class}, jaxbProperties);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        //unmarshaller.setSchema(null);
        
		String json = "{\"id\":20, \"value\":\"hogehoge\"}";
		
        JsonReader jsonReader = Json.createReader(new StringReader(json));
        JsonStructureSource arraySource = new JsonStructureSource(jsonReader.readObject());
        
        // Unmarshal Root Level JsonArray
        // MOXyのBeanバリエーション処理がSAX APIに依存しているため、ログイにJAXPのログが出力される
        // --> org.eclipse.persistence.jaxb.ValidationXMLReader
        Hoge hoge = unmarshaller.unmarshal(arraySource, Hoge.class).getValue();
        
        System.out.println("id=" + hoge.getId() + ", value=" + hoge.getValue());
        
	}
}
