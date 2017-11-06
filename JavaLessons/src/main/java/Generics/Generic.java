package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * User: tetiana.kryvets
 * Date: 11/6/17
 */
public class Generic<T> {
    protected T obj;

    public Generic(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void showType() {
        System.out.println("Show type: "+ obj.getClass().getName());
    }


    public static void main(String[] args) {
        Generic<String> stringGeneric = new Generic<String>("abcdef");
        Generic<Integer> intGeneric = new Generic<Integer>(12345);
        Generic<Character> characterGeneric = new Generic<Character>('f');

        stringGeneric.showType();
        intGeneric.showType();

        System.out.println(stringGeneric.getObj());
        System.out.println(intGeneric.getObj());

        System.out.println("-------------------------------------");

        System.out.println("3: " + characterGeneric.getObj().toString().toUpperCase());

        System.out.println("---------------------------------------");


        String newStr = Utilities.doSubString(stringGeneric, 2, 5);
        System.out.println("New substring: " + newStr);       //Output: New substring: Generics
        // .Generi

        String newIntStr = Utilities.doSubString(intGeneric, 2, 4);
        System.out.println("New sub-string from Integer: " + newIntStr);

    }


}