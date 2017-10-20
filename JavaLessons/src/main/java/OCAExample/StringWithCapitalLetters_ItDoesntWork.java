package OCAExample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * User: tetiana.kryvets
 * Date: 10/20/17
 */
public class StringWithCapitalLetters_ItDoesntWork {
    String standardString;

    public static void main(String[] arg) throws Exception{
        //ввод строки с клавиатуры
        System.out.println("Input string");
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String Str = reader.readLine();

        //the first letter in the sentence should be capitalized
        String outputString2 = printTheFirstLetterCapitalized(Str);
        System.out.println("String should have the firs letter is capitalised: " + outputString2);

    }


    public static String printTheFirstLetterCapitalized(String Str) {
        String outputString = "";
        String[] splittedByWord = Str.split(" ");
        for (int i=0; i<splittedByWord.length; i++ ) {
            char[] charArray = splittedByWord[i].toCharArray();
            if (Character.isLetter(charArray[0])) {
                Character.toString(charArray[0]).toUpperCase();
                System.out.println("@!!!!    " + Character.toString(charArray[0]).toUpperCase());
                //todo: вот тут затык  - не сохраняет заглавную букву в массиве!!!


            }

            System.out.println(charArray.toString());
            //System.out.println(strSplittedWithUpperLetter);

        }


       return outputString;
    }
}
