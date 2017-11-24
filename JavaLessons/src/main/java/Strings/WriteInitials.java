package Strings;

/**
 * User: tetiana.kryvets
 * Date: 10/19/17
 */
public class WriteInitials {
    //Write a program that computes your initials from your full name and displays them.

public static void main (String[] arg) {
    String fullName = "Kryvets Tetiana Ivanivna";

    System.out.println(fullName.substring(0,7) + " " + fullName.charAt(8)+". " + fullName.charAt(16) + ".");
}

}
