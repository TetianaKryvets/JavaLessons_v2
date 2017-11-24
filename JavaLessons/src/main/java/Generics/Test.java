package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * User: tetiana.kryvets
 * Date: 11/6/17
 */

//Write a program using Generic methods:
//     - method "exchangePosition" changes the values of two adjacent elements

public class Test {
    public static void main(String[] args) {
        ArrayList<String> intList = new ArrayList();
        intList.add("aaaa");
        intList.add("bbbb");
        intList.add("ccccc");
        System.out.println("List of Elements: " + intList);


        Utilities.exchangePosition(intList, 1, 2);
        System.out.println("ExchangePosition: " + intList);
    }
}
