package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * User: tetiana.kryvets
 * Date: 11/3/17
 */
public class ExamplesWithHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer, String>();

        hm.put(1, "123");
        hm.put(2, "345");
        hm.put(3, "675876");
        System.out.println(hm);

        //Write a Java program to count the number of key-value (size) mappings in a map.
        System.out.println("number of key-value: " + hm.size());

        //white a program to find the second pair key-value
        System.out.println(hm.get(3));

        //white a program to output HashMap
        for (int j = 1; j<= hm.size(); j++) {
            System.out.println(hm.get(j));
        }

        for (Map.Entry mp:hm.entrySet()) {
            System.out.println("  1!!!!   + "  + mp.hashCode());
            System.out.println("Key = " + mp.getKey());
        }



    }
}
