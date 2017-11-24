package Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * User: tetiana.kryvets
 * Date: 10/20/17
 */

/*
TASK:
To "capitalize" a string means to change the first letter of each word in the string
 to upper case (if it is not already upper case). For example, a capitalized version
 of "Now is the time to act!" is "Now Is The Time To Act!".
 Write a subroutine named printCapitalizedthat will print a capitalized version of
 a string to standard output. The string to be printed should be a parameter to the subroutine.
 Test your subroutine with a main() routine that gets a line of input from the user and applies the subroutine to it.
 */
public class StringWithCapitalLetters {
    String standardString;

    public static void main(String[] arg) throws Exception{
        //ввод строки с клавиатуры
        System.out.println("Input string");
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String str = reader.readLine();

        //the first letter in the sentence should be capitalized
        String outputString = printTheFirstLetterCapitalized(str);
        System.out.println("String should have the firs letter is capitalised: " + outputString);

    }


    public static String printTheFirstLetterCapitalized(String str) {
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        for (int i=0; i<charArray.length; i++ ) {

            if (Character.isLetter(charArray[i])) {
                charArray[0] = Character.toUpperCase(str.charAt(0));

            }
            if (charArray[i] == ' ') {
                charArray[i+1] = Character.toUpperCase(str.charAt(i+1));
            }
        }
       return  new String(charArray);
    }

    //Andriy Lysenko method:
    private static String printCapitalized(String input){
        String[] strArray = input.split("");
        strArray[0] = strArray[0].toUpperCase();

        for (int i = 0; i < strArray.length - 1; i++){
            if (strArray[i].equals(" ")){
                strArray[i + 1] = strArray[i + 1].toUpperCase();
            }
        }
        return String.join("", strArray);
    }
}
