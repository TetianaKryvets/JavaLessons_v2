package Arrays;

import java.util.Arrays;


/**
 * User: tetiana.kryvets
 * Date: 10/26/17
 */

/*Write a Java program to sort a string array. */

public class SortStringArray {

    public static void main(String[] args) {
        String[] stringArray = {"first", "second", "third", "fourth", "fifth"};
        Arrays.sort(stringArray);

        for (String stringItem : stringArray) {
            System.out.println(stringItem);
        }
    }
}
