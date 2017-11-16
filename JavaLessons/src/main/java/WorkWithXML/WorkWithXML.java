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

    //1. parsing   (DOM -> набор элементов типа Node: стандартные объекты DOM — Node, NodeList. класс Element -
// наследник класса Node)
    //2. search an element
    //3. verification
    //4. update/modification
public class WorkWithXML {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        
        File f = new File("C:/Kryvets/TA_development/JavaLessons/JavaLessons/src/main/java/WorkWithXML/xx1.xml");
        // Создается построитель документа
        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        //// Создается дерево DOM документа из файла
        Document document = builder.parse(f);
        // Получаем корневой элемент
        //Case1:
        Element root = document.getDocumentElement();
        // для простоты сразу берем message
        Element message = (Element) root.getElementsByTagName("handbook").item(0);
        String textContent = message.getTextContent(); // тоже для упрощения
        System.out.println(textContent);

        addNewElement(document);


        //-----------------------------------------------------------------------//

//        //Case2:
//        Node rootNode = document.getDocumentElement();
//
//        System.out.println("List of books:");
//        System.out.println();
//        // Просматриваем все подэлементы корневого - т.е. книги
//        NodeList books = rootNode.getChildNodes();
//        for (int i = 0; i < books.getLength(); i++) {
//            Node book = books.item(i);
//            // Если нода не текст, то это книга - заходим внутрь
//            if (book.getNodeType() != Node.TEXT_NODE) {
//                NodeList bookProps = book.getChildNodes();
//                for(int j = 0; j < bookProps.getLength(); j++) {
//                    Node bookProp = bookProps.item(j);
//                    // Если нода не текст, то это один из параметров книги - печатаем
//                    if (bookProp.getNodeType() != Node.TEXT_NODE) {
//                        System.out.println(bookProp.getNodeName() + ":" + bookProp.getChildNodes().item(0).getTextContent());
//                    }
//                }
//                System.out.println("===========>>>>");
//            }
//        }

    }

    public static void addNewElement(Document document) throws TransformerException, FileNotFoundException {
        // Получаем корневой элемент
        Node rootNode = document.getDocumentElement();

        // Создаем нновый элемент
        Element handbook = document.createElement("handbook");

        Element customerName = document.createElement("customerName");
        customerName.setTextContent("NewCustomer");

        Element hbName = document.createElement("name");
        hbName.setTextContent("NewHBName");

        Element displayName = document.createElement("displayName");
        displayName.setTextContent("NameOfHBForDisplaying");

        Element id = document.createElement("id");
        id.setTextContent("888");

        // Добавляем внутренние элементы
        handbook.appendChild(customerName);
        handbook.appendChild(hbName);
        handbook.appendChild(displayName);
        handbook.appendChild(id);

        rootNode.appendChild(handbook);

        // Записываем XML в файл
        writeDocument(document);

    }

    private static void writeDocument(Document document) throws TransformerFactoryConfigurationError, TransformerException, FileNotFoundException {
        Transformer tr = TransformerFactory.newInstance().newTransformer();
        DOMSource source = new DOMSource(document);
        FileOutputStream fos = new FileOutputStream("C:/Kryvets/TA_development/JavaLessons/JavaLessons/src/main/java/WorkWithXML/other.xml");
        StreamResult result = new StreamResult(fos);
        tr.transform(source, result);
    }

}
