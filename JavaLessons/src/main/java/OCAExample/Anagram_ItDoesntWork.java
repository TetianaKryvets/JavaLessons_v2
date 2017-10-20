package OCAExample;

import java.util.Arrays;

/**
 * User: tetiana.kryvets
 * Date: 10/19/17
 */

/*An anagram is a word or a phrase made by transposing the letters of another word or phrase;
for example, "parliament" is an anagram of "partial men," and "software" is an anagram of "swear oft."
 Write a program that figures out whether one string is an anagram of another string.
 The program should ignore white space and punctuation.
 */

public class Anagram_ItDoesntWork {
    public static void main(String[] arg) {

        String unsortedFirstString = "SatUrn Mars";
        String unsortedSecondString = "plus MiNus";

        String firstString = unsortedFirstString.toLowerCase();
        String secondString = unsortedSecondString.toLowerCase();

//Сортировка
//        char[] charArray = unsortedFirstString.toCharArray();
//
//        java.util.Arrays.sort(charArray);


        System.out.println(firstString + ",   Length: " + firstString.length());
        System.out.println("-------");
        System.out.println(secondString + ",   Length: " + secondString.length());

        //String firstString = new String(java.util.Arrays.sort(charArray));

        if (areAnagrams(firstString, secondString)) {
            System.out.println("They ARE anagrams!");
        } else {
            System.out.println("They are NOT anagrams!");
        }
        System.out.println();




//        StringBuilder charsPresented = new StringBuilder();
//        StringBuilder charsNotPresented = new StringBuilder();
//
//           for (int i=0; i<secondString.length(); i++) {
//            //for (int j=0; j<firstString.length(); j++) {
//                if (Character.isLetter(secondString.charAt(i))) {
//                    charsPresented.append(secondString.charAt(i));

               // if (secondString.charAt(i) == firstString.charAt(j)) {
               //     charsPresented.append(secondString.charAt(i));
//                } else {
//                if (secondString.charAt(i) != firstString.charAt(j)) {
//                    charsNotPresented.append(firstString.charAt(i));
//                    }
                //}
            }

        public static boolean areAnagrams(String firstString, String secondString) {

            boolean isFound = false;
            boolean[] isFound1 = new boolean[10];

            if (firstString.length() >= secondString.length()) {
                  for (int i=0; i<secondString.length(); i++) {
                    for (int j=0; j<firstString.length(); j++) {
                        //String stringValueOf = String.valueOf(secondString.charAt(j));
                        if (secondString.charAt(i) == firstString.charAt(j)) {
                            isFound1[i] = true;
                            System.out.println(" Символ из второй строки присутствует в первой строке: " +
                                    secondString.charAt(i));
                            break;

                        } else {
                            isFound1[i] = false;
                            System.out.println(" Символ из второй строки НЕ присутствует в первой строке: " +
                                    secondString.charAt(i));

                        }
                    }
                  System.out.println(Arrays.toString(isFound1));
                }

            } else {
                for (int i=0; i<firstString.length(); i++) {
                    for (int j=0; j<secondString.length(); j++) {
                        //String stringValueOf = String.valueOf(secondString.charAt(j));
                        if (firstString.charAt(i) == secondString.charAt(j)) {
                            isFound1[i] = true;
                            System.out.println("Вторая строка длиннее, сравниваем первую со второй. ");
                            System.out.println(" Символ из первой строки присутствует во второй строке: " +
                                    secondString.charAt(i));
                            break;

                        } else {
                            isFound1[i] = false;
                            System.out.println("Вторая строка длиннее, сравниваем первую со второй. ");
                            System.out.println(" Символ из первой строки НЕ присутствует во второй строке: " +
                                    secondString.charAt(i));
                        }
                    }
                    System.out.println(Arrays.toString(isFound1));
                }


            }
//            System.out.println(isFound1);
//            //как проверить что как только одно из значений false, знаит, возвращаем false
//            if (isFound1 == true)
//            {return  true; }
//            else {return false;}
            return true;

        }

}

