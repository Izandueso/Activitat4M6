import java.io.File;
import java.io.IOException;

import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class Comprobarxml {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		// per a carregar en memòria un arxiu xml
		File file = new File("alumnes.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(file);

		//per obtenir el node arrel
		org.w3c.dom.Element nodeArrel = doc.getDocumentElement();
		
		//Per obtenir els nodes fill d’un node useu el mètode getChildNodes()		
		//Per obtenir els atributs d’un node, useu el mètode getAttributes()
		//Per obtenir el nom, el tipus i el valor d’un node, cerqueu els mètodes apropiats.
		
		NodeList nodos = nodeArrel.getChildNodes();
		org.w3c.dom.Node n = null;
		
		for (int i = 0; i < nodos.getLength(); i++) {
			n = nodos.item(i);
			//System.out.println("Elemento: " + i + " " + n.getNodeName());
			System.out.println("Nom: " + n.getNodeName());
			System.out.println("Tipus: " + n.getNodeType());
			System.out.println("Valor del node: " + n.getNodeValue());
			System.out.println();
		}
		
		
	}

}
