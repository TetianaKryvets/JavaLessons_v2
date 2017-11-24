package WorkWithXML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * User: tetiana.kryvets
 * Date: 11/17/2017
 */

//  	  Books – title, author, data
//           1. receive the list of all books.
//           2. receive the list of books with author: Author
//           3. add new books to existing XML File


public class WorkWithBooksInXML {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException, TransformerException {

        File f = new File("src/main/java/WorkWithXML/Books.xml");
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();

        Document document = builder.parse(f);

        //find absolute path
        System.out.println("Path to file: " + f.getAbsolutePath());

        //1. receive the list of all books
        System.out.println("The list of all books: ");
        
        Node rootNode = document.getDocumentElement();
        NodeList books = rootNode.getChildNodes();
        printElements(books);


        // 2. receive the list of books with author: Dhirendra
        System.out.println("The list of books with author: \"Dhirendra\"");
        NodeList root = getElementWithSpecificAtributeValue(document);
        printElements(root);

        //3.  add new books to existing XML File
        addFewBookIntoXML(document);
        

    }

    public static NodeList getElementWithSpecificAtributeValue(Document doc) throws XPathExpressionException {
        XPath xpath = XPathFactory.newInstance().newXPath();
        XPathExpression expr;
        expr = xpath.compile("//Author[contains(text(), \"Dhirendra\")]/parent::Book");
        NodeList nl = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
        return nl;
    }

    public static void printElements(NodeList root) {
        for (int i = 0; i < root.getLength(); i++) {
            Node book = root.item(i);
            if (book.getNodeType() != Node.TEXT_NODE) {
                NodeList bookProps = book.getChildNodes();
                for(int j = 0; j < bookProps.getLength(); j++) {
                    Node bookProp = bookProps.item(j);
                    if (bookProp.getNodeType() != Node.TEXT_NODE) {
                        System.out.println(bookProp.getNodeName() + ":" + bookProp.getChildNodes().item(0)
                                .getTextContent());
                    }
                }
                System.out.println("===================");
            }
        }

    }

    public static void addFewBookIntoXML(Document document) throws TransformerException {
        System.out.println("Add few books  and save the changes in the \"Output.xml\"");
        Element rootElement = document.getDocumentElement();
        Element book = document.createElement("Book");
        rootElement.appendChild(book);

            Element title = document.createElement("Title");
            Element author = document.createElement("Author");
            Element date = document.createElement("Date");
            Element isbn = document.createElement("ISBN");
            Element publisher = document.createElement("Publisher");
            Element cost = document.createElement("Cost");


            title.appendChild(document.createTextNode("Title"));
            author.appendChild(document.createTextNode("Author of this book"));
            date.appendChild(document.createTextNode("1954"));
            isbn.appendChild(document.createTextNode("111111-11-1111"));
            publisher.appendChild(document.createTextNode("publisher"));
            cost.appendChild(document.createTextNode("23"));

            book.appendChild(title);
            book.appendChild(author);
            book.appendChild(date);
            book.appendChild(isbn);
            book.appendChild(publisher);
            book.appendChild(cost);


        //save the changes in XML
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        StreamResult output = new StreamResult(new File
                ("src/main/java/WorkWithXML/Output.xml"));
        DOMSource source = new DOMSource(document);

        transformer.transform(source, output);
    }



}
