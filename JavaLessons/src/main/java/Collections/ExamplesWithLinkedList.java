package Collections;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * User: tetiana.kryvets
 * Date: 10/29/17
 */
public class ExamplesWithLinkedList {
    public static void main(String[] arg) {
        LinkedList linkedArray = new LinkedList();
        //Write a Java program to append the specified element to the end of a linked list.
        linkedArray.add("Blue");
        linkedArray.add(true);
        linkedArray.add(123434);
        linkedArray.add("red");
        int size = linkedArray.size();
        System.out.println(size);
        linkedArray.add(size, "123");
        System.out.println(linkedArray);

        //Write a Java program to iterate through all elements in a linked list.
        for (Object o : linkedArray) {
            System.out.println(o);
        }

        //Write a Java program to iterate through all elements in a linked list starting at the specified position.
        Iterator p =  linkedArray.listIterator(2);
        while (p.hasNext()) {
            System.out.println(p.next());
        }


    }
}
