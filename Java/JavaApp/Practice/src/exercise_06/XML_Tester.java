package exercise_06;

import javax.xml.parsers.*;
import org.w3c.dom.*;

public class XML_Tester {

	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder parser = factory.newDocumentBuilder();
		Document document = parser.parse(".\\Resource\\person.xml");
		Element inventory = document.getDocumentElement();
		
		NodeList persons = inventory.getElementsByTagName("person");
		System.out.println(persons.getLength());
		System.out.println("Person: ");
		for(int i=0; i<persons.getLength(); i++) {
			Element item = (Element)persons.item(i);
			String name = item.getElementsByTagName("name").item(0).getTextContent();
			System.out.println("name:" + name);
		}
	}

}
