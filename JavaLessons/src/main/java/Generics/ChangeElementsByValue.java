package Generics;

import java.util.ArrayList;
import java.util.List;


/**
 * User: tetiana.kryvets
 * Date: 11/24/2017
 */

//Write a program using Generic methods:
//     - method "fill" set '0' for all elements of ArrayList

public class ChangeElementsByValue {

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList();
        strList.add("aaaa");
        strList.add("bbbb");
        strList.add("ccccc");
        System.out.println("List: " + strList);

        Utilities.fill(strList, "0");
        System.out.println("All elements replaced with new value: "
                + strList);

        ArrayList<Integer> intList = new ArrayList();
        intList.add(5);
        intList.add(7);
        intList.add(10);
        System.out.println("List: " + intList);


        Utilities.fill(intList, 0);
        System.out.println("All elements replaced with new value: "
                + intList);
    }
}
