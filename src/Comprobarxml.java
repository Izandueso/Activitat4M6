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
		NodeList nodeList = doc.getDocumentElement().getChildNodes();
		
		for (int i = 0; i < nodeList.getLength(); i++) {
			imprimirDadesXml((org.w3c.dom.Node)nodeList.item(i));
		}
		
		//Per obtenir els nodes fill d’un node useu el mètode getChildNodes()
		//Per obtenir els atributs d’un node, useu el mètode getAttributes()
		//Per obtenir el nom, el tipus i el valor d’un node, cerqueu els mètodes apropiats.
		
		
		
	}
	
	public static void imprimirDadesXml(org.w3c.dom.Node nodos){
			System.out.println(nodos.getNodeName() + " " + nodos.getTextContent());
			NodeList nodoListo = nodos.getChildNodes();
			for (int j = 0; j < nodoListo.getLength(); j++){
				imprimirDadesXml(nodoListo.item(j));	
			}
	}

}
