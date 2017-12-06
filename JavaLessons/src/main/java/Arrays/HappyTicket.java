package Arrays;

import static oracle.jrockit.jfr.events.Bits.charValue;

/**
 * User: tetiana.kryvets
 * Date: 12/6/2017
 */

// task: how much "happy ticket" we have in array
    //  "happy ticket" is when sum of 3 first numbers is equal to sum of 3 last number
public class HappyTicket {
    public static void main(String[] args) {
        int[] ticketsArray = {123456, 239960, 999999, 991991, 123321, 678876, 734898};
        //int[] ticketsArray = {123456};
        int[] oneSymbol = new int[6];
        int sumOfHappyTicket = 0;

        for (int i=0; i < ticketsArray.length; i++) {
           String ticketNumber = Integer.toString(ticketsArray[i]);

           char[] charArray = ticketNumber.toCharArray();

           for (int j = 0; j <charArray.length; j++ ) {
               oneSymbol[j] = Character.getNumericValue(charArray[j]);
               System.out.print(oneSymbol[j] + " ");
           }

            int firstPart = oneSymbol[0] + oneSymbol[1] + oneSymbol[2];
            int secondPart = oneSymbol[3] + oneSymbol[4] + oneSymbol[5];
            if (firstPart == secondPart)
            {
                sumOfHappyTicket = sumOfHappyTicket + 1;
                System.out.println("Happy ticket!!!");
            } else {
                System.out.println("This ticket is not happy!");
            }
           
        }
        System.out.println("Number of Happy Tickets:" + sumOfHappyTicket);

    }
}
