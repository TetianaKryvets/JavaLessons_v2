package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * User: tetiana.kryvets
 * Date: 11/6/17
 */

//Write a program using Generic methods:
//     - method "fill" set '0' for all elements of ArrayList
//     - method "exchangePosition" changes the values of two adjacent elements

public class Test {
    public static void main(String[] args) {
        ArrayList<String> intList = new ArrayList();
        intList.add("aaaa");
        intList.add("bbbb");
        intList.add("ccccc");
        System.out.println("Список до обработки дженерик-методом: " + intList);



        //Utilities.fill(intList, 0);
        System.out.println("Список после обработки дженерик-методом: "
                + intList);

        Utilities.exchangePosition(intList, 1, 2);
        System.out.println("ExchangePosition: " + intList);
    }
}
