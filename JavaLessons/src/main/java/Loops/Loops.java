package Loops;

/**
 * Created with IntelliJ IDEA.
 * User: tetiana.kryvets
 * Date: 5/4/17
 */
public class Loops {
    public static void main (String[] arg) {
        int startValue = 111;
        int endValue = 8899;
        int sum = 0;
        double average = 0;
        //int i = startValue;

        for (int i=startValue; i<=endValue; i++) {
        //while(i <= endValue) {
        //do {
            sum = sum + i;
            //i++;
        }

        //} while (i <= endValue);
        average = sum/(endValue-startValue);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
