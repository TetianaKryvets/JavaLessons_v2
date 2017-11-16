package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * User: tetiana.kryvets
 * Date: 11/6/17
 */

//class for Generic methods

public class Utilities {
    public static <T> void fill(ArrayList<T> list, T val) {
        for (int i = 0; i < list.size(); i++){
            list.set(i, val);


        }
    }

    public static <T> void exchangePosition(ArrayList<T> list, int i, int j) {
        for (int k = 0; k < list.size(); k++ ) {
            T num = list.get(i);
            T num1 = list.get(i+1);
            list.set(i+1, num);
            list.set(i,num1);
        }
    }

    public static <T> String doSubString(Generic<T> str, int i, int j) {
        String subString = str.getObj().toString().substring(i,j);
        return subString;
    }

    public static <T> Integer findMaxElement(ArrayList<T> list, int i, int j) {
        int maxValue = 0;

        return maxValue;
    }

    public static <T> Integer findMinElement(ArrayList<T> list) {
        T maxValue = list.get(0);
        for (int i=1; i < list.size(); i ++ ) {

            if ((Integer)list.get(i) < (Integer) maxValue) {
                maxValue = list.get(i);
            }
        }
        return (Integer) maxValue;
    }

}
