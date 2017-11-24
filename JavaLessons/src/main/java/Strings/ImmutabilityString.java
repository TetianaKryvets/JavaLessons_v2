package Strings;

/**
 * User: tetiana.kryvets
 * Date: 10/15/17
 */
//example with immutable string

public class ImmutabilityString {


    public static void main(String arg[]) {
        String s1 = "1";
        String s2 = s1.concat("2");
        String s3 = s2.concat("3");
        System.out.println(s1);
        System.out.println(s3);
    }

}
