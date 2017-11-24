package Generics;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * User: tetiana.kryvets
 * Date: 11/16/2017
 */

//  Write a generic method to find the min element of a list.


public class FindMaxElement {

    public static void main(String[] args) {
        int minValue = 0;
        int minValueInNumberArray = 0;

        ArrayList<Integer> listOfIntegers = new ArrayList<Integer>(Arrays.asList(12, 23, 15, 2332, 232, 232, 343, 3,
                56, 5, 34, 4));

        ArrayList<Number> listOfNumber = new ArrayList<Number>(Arrays.asList(23,45,45,2,6,4,9,5,8,567));

        minValue = Utilities.findMinElement(listOfIntegers);
        minValueInNumberArray = Utilities.findMinElement(listOfNumber);

        System.out.println("Min value: " + minValue);
        System.out.println("Min value in Number: " + minValueInNumberArray);
    }

}
