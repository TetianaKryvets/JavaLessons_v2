package WorkWithXML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.File;
import java.io.IOException;

/**
 * User: tetiana.kryvets
 * Date: 11/17/2017
 */

//  	  Books – title, author, data
//        parse catalog,
//           - receive the list of all books.
//           - receive the list of books with author: Author


public class WorkWithBooksInXML {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {

        File f = new File("C:/Kryvets/TA_development/JavaLessons/JavaLessons/src/main/java/WorkWithXML/Books.xml");
        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse(f);

        //           - receive the list of all books
        System.out.println("The list of all books: ");
        
        Node rootNode = document.getDocumentElement();
        NodeList books = rootNode.getChildNodes();
        printElements(books);


        //           - receive the list of books with author: Dhirendra
        System.out.println("The list of books with author: \"Dhirendra\"");
        NodeList root = getElementWithSpecificAtributeValue(document);
        printElements(root);

    }

    public static NodeList getElementWithSpecificAtributeValue(Document doc) throws XPathExpressionException {
        XPathFactory xPathfactory = XPathFactory.newInstance();
        XPath xpath = xPathfactory.newXPath();
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
                    // Если нода не текст, то это один из параметров книги - печатаем
                    if (bookProp.getNodeType() != Node.TEXT_NODE) {
                        System.out.println(bookProp.getNodeName() + ":" + bookProp.getChildNodes().item(0)
                                .getTextContent());
                    }
                }
                System.out.println("===================");
            }
        }

    }

}
