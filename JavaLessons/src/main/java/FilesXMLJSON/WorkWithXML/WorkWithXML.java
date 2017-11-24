package WorkWithXML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * User: tetiana.kryvets
 * Date: 11/16/2017
 */

    //1. parsing of XML Document

public class WorkWithXML {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        
        File f = new File("src/main/java/WorkWithXML/xx1.xml");
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();

        Document document = builder.parse(f);
        //Case1:
        Element root = document.getDocumentElement();
        Element message = (Element) root.getElementsByTagName("handbook").item(0);
        String textContent = message.getTextContent();
        System.out.println(textContent);

        addNewElement(document);



    }

    public static void addNewElement(Document document) throws TransformerException, FileNotFoundException {
        Node rootNode = document.getDocumentElement();

        Element handbook = document.createElement("handbook");

        Element customerName = document.createElement("customerName");
        customerName.setTextContent("NewCustomer");

        Element hbName = document.createElement("name");
        hbName.setTextContent("NewHBName");

        Element displayName = document.createElement("displayName");
        displayName.setTextContent("NameOfHBForDisplaying");

        Element id = document.createElement("id");
        id.setTextContent("888");

        // add new elements
        handbook.appendChild(customerName);
        handbook.appendChild(hbName);
        handbook.appendChild(displayName);
        handbook.appendChild(id);

        rootNode.appendChild(handbook);

        // write to XML file
        writeDocument(document);

    }

    private static void writeDocument(Document document) throws TransformerFactoryConfigurationError, TransformerException, FileNotFoundException {
        Transformer tr = TransformerFactory.newInstance().newTransformer();
        DOMSource source = new DOMSource(document);
        FileOutputStream fos = new FileOutputStream("src/main/java/WorkWithXML/other.xml");
        StreamResult result = new StreamResult(fos);
        tr.transform(source, result);
    }

}
