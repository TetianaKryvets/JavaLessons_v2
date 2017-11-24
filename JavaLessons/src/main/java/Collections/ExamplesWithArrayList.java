package Collections;

import java.util.ArrayList;

/**
 * User: tetiana.kryvets
 * Date: 10/29/17
 */

//TASKS:
//1. Write a Java program to retrieve an element (at a specified index) from a given array list
//2. Write a Java program to update specific array element by given element
//3. Write a Java program to search an element in a array list.
//4. Write a Java program to replace the second element of a ArrayList with the specified element.


public class ExamplesWithArrayList {

    public static void main (String[] arg) {
        ArrayList<String> arrList = new ArrayList();
        arrList.add("Red");
        arrList.add("Green");
        arrList.add("Blue");

        //insert an element into the array list at the first position
        arrList.add(0, "White");

        //output 1
        for (int i=0; i<arrList.size(); i++) {
            System.out.println(arrList.toArray()[i]);
        }

        //output2:
        for (String element : arrList) {
            System.out.println(element);
        }

        //output3:
        System.out.println(arrList);


        //Write a Java program to retrieve an element (at a specified index) from a given array list
        System.out.println("retrieve element at a specified index: " + arrList.get(3));

        //Write a Java program to update specific array element by given element
        arrList.set(3, "Yellow");
        System.out.println("update specific array element by given element" + arrList);

        //Write a Java program to search an element in a array list.
        if (arrList.contains("La-la"))
            System.out.println("Element is present");
        else
            System.out.println("Element is not present");

        //Write a Java program to replace the second element of a ArrayList with the specified element.
        arrList.set(1, "Pink");
        System.out.println("The second element is updated" + arrList);


    }
}
